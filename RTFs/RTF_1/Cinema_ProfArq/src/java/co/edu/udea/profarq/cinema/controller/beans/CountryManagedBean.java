package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.CountryManagerBean;
import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Country;
import java.io.Serializable;
import java.util.List;
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
public class CountryManagedBean implements Serializable {

    private static final long serialVersionUID = 8310135132300100199L;

    private CountryManagerBean countryManagerBean;
    private SelectItem[] contriesSelectItems;

    public CountryManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<Country> countriesList;
        SelectItem[] selectItems = null;

        try {
            countriesList = this.countryManagerBean.findAll();
        } catch (CinemaBusinessException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                            "Country Film", e.getMessage()));

            this.setContriesSelectItems(selectItems);

            return;
        }

        if ((countriesList != null) && (!countriesList.isEmpty())) {
            selectItems = new SelectItem[countriesList.size()];

            for (int position = 0; position < countriesList.size(); position++) {
                Country country = countriesList.get(position);
                selectItems[position] = new SelectItem(country.getIsoCode(),
                        String.format("[%s] %s",
                                country.getIsoCode(),
                                country.getCountry()));
            }
        }

        this.setContriesSelectItems(selectItems);
    }

    public CountryManagerBean getCountryManagerBean() {

        return (this.countryManagerBean);
    }

    public void setCountryManagerBean(
            CountryManagerBean countryManagerBean) {
        this.countryManagerBean = countryManagerBean;
    }

    public SelectItem[] getContriesSelectItems() {

        return (this.contriesSelectItems);
    }

    public void setContriesSelectItems(SelectItem[] contriesSelectItems) {
        this.contriesSelectItems = contriesSelectItems;
    }
}
