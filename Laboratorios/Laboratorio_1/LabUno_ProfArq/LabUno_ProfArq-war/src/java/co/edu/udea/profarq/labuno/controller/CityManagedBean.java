package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.CityManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.City;
import java.io.Serializable;
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
public class CityManagedBean implements Serializable {

    private static final long serialVersionUID = 6231326269621578226L;

    @EJB()
    private CityManagerSessionBean cityManagerSessionBean;
    private SelectItem[] citiesSelectItems;

    public CityManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<City> citiesList = this.cityManagerSessionBean.
                findAll();
        SelectItem[] selectItems = null;

        if ((citiesList != null) && (!citiesList.isEmpty())) {
            selectItems = new SelectItem[citiesList.size()];

            for (int position = 0; position < citiesList.size(); position++) {
                City city = citiesList.get(position);
                selectItems[position] = new SelectItem(city,
                        String.format("[%s] %s", city.getCode(),
                                city.getCity()));
            }
        }

        this.setCitiesSelectItems(selectItems);
    }

    public SelectItem[] getCitiesSelectItems() {

        return (this.citiesSelectItems);
    }

    public void setCitiesSelectItems(SelectItem[] citiesSelectItems) {
        this.citiesSelectItems = citiesSelectItems;
    }
}
