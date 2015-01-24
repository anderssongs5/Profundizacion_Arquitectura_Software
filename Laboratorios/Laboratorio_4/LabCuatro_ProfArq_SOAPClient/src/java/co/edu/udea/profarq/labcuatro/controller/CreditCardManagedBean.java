package co.edu.udea.profarq.labcuatro.controller;

import co.edu.udea.profarq.labcuatro.business.Process;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CreditCardManagedBean implements Serializable {

    private static final long serialVersionUID = 1222288587240052359L;
    private String creditCardNumber;
    private String ccvNumber;
    private int expirationYear;
    private int expirationMonth;

    public CreditCardManagedBean() {
        super();
    }

    public String getCreditCardNumber() {
        return (this.creditCardNumber);
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCcvNumber() {
        return (this.ccvNumber);
    }

    public void setCcvNumber(String ccvNumber) {
        this.ccvNumber = ccvNumber;
    }

    public int getExpirationYear() {
        return (this.expirationYear);
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public int getExpirationMonth() {
        return (this.expirationMonth);
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public void validateCreditCard() {
        if (this.creditCardNumber != null && this.ccvNumber != null
                && this.expirationYear > 0 && this.expirationYear <= 2015
                && this.expirationMonth > 0 && this.expirationMonth <= 12) {

            String result = Process.validateCreditCard(this.creditCardNumber,
                    this.ccvNumber, this.expirationYear, this.expirationMonth);

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
