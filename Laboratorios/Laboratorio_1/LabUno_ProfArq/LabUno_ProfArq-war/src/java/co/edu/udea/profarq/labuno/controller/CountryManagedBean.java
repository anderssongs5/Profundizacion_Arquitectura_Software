package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.CountryManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Country;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CountryManagedBean {

    @EJB()
    private CountryManagerSessionBean countryManagerSessionBean;
    private SelectItem[] contriesSelectItems;

    public CountryManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<Country> countriesList = this.countryManagerSessionBean.findAll();
        SelectItem[] selectItems = null;

        if ((countriesList != null) && (!countriesList.isEmpty())) {
            selectItems = new SelectItem[countriesList.size()];

            for (int position = 0; position < countriesList.size(); position++) {
                Country country = countriesList.get(position);
                selectItems[position] = new SelectItem(country,
                        String.format("[%s] %s",
                                country.getIsoCode(),
                                country.getCountry()));
            }
        }

        this.setContriesSelectItems(selectItems);
    }

    public SelectItem[] getContriesSelectItems() {

        return (this.contriesSelectItems);
    }

    public void setContriesSelectItems(SelectItem[] contriesSelectItems) {
        this.contriesSelectItems = contriesSelectItems;
    }
}
