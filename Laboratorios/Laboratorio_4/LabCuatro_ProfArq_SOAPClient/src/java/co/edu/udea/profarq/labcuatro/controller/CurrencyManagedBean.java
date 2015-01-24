package co.edu.udea.profarq.labcuatro.controller;

import co.edu.udea.profarq.labcuatro.business.Process;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CurrencyManagedBean implements Serializable {

    private static final long serialVersionUID = 1062850787748349743L;
    private SelectItem[] currencyList;
    private String sourceCurrency;
    private String targetCurrency;
    private double amount;

    public CurrencyManagedBean() {
        super();
    }

    @PostConstruct
    private void init() {
        this.currencyList = new SelectItem[Process.CURRENCY_LIST.size() + 1];
        Object[] objects = Process.CURRENCY_LIST.keySet().toArray();
        this.currencyList[0] = new SelectItem(null, "Seleccione una");
        for (int position = 0; position < objects.length; position++) {
            this.currencyList[position + 1] = new SelectItem(
                    Process.CURRENCY_LIST.get((String) objects[position]).getAcronym(),
                    Process.CURRENCY_LIST.get((String) objects[position]).getDescription().
                    concat(" (" + Process.CURRENCY_LIST.get((String) objects[position]).getSymbol() + ")"));
        }
    }

    public SelectItem[] getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(SelectItem[] currencyList) {
        this.currencyList = currencyList;
    }

    public String getSourceCurrency() {
        return (this.sourceCurrency);
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getTargetCurrency() {
        return (this.targetCurrency);
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getAmount() {
        return (this.amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void convertCurrency() {
        if (this.sourceCurrency != null && this.targetCurrency != null
                && this.amount >= 0) {
            Double d = Process.convertCurrency(this.sourceCurrency,
                    this.targetCurrency, this.amount);

            String result = Process.CURRENCY_LIST.get(this.targetCurrency).getSymbol()
                    + " " + d.toString() + " ("
                    + Process.CURRENCY_LIST.get(this.targetCurrency).getDescription()
                    + ")";

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Resultado: " + result, result));
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Error: Por favor seleccione e ingrese valores correctos.",
                            "Por favor seleccione e ingrese valores correctos."));
        }
    }
}
