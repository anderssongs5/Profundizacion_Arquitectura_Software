package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.CountryManagerBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CountryManagedBean implements Serializable {

    private static final long serialVersionUID = 8310135132300100199L;

    private CountryManagerBean countryManagerSessionBean;
    private SelectItem[] contriesSelectItems;

    public CountryManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
//        List<Country> countriesList = this.countryManagerSessionBean.findAll();
//        SelectItem[] selectItems = null;
//
//        if ((countriesList != null) && (!countriesList.isEmpty())) {
//            selectItems = new SelectItem[countriesList.size()];
//
//            for (int position = 0; position < countriesList.size(); position++) {
//                Country country = countriesList.get(position);
//                selectItems[position] = new SelectItem(country.getIsoCode(),
//                        String.format("[%s] %s",
//                                country.getIsoCode(),
//                                country.getCountry()));
//            }
//        }
//
//        this.setContriesSelectItems(selectItems);
    }

    public CountryManagerBean getCountryManagerSessionBean() {
        
        return countryManagerSessionBean;
    }

    public void setCountryManagerSessionBean(
            CountryManagerBean countryManagerSessionBean) {
        this.countryManagerSessionBean = countryManagerSessionBean;
    }

    public SelectItem[] getContriesSelectItems() {

        return (this.contriesSelectItems);
    }

    public void setContriesSelectItems(SelectItem[] contriesSelectItems) {
        this.contriesSelectItems = contriesSelectItems;
    }
}
