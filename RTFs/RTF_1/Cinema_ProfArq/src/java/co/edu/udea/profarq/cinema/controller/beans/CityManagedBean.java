package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.CityManagerBean;
import co.edu.udea.profarq.cinema.model.entities.City;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CityManagedBean implements Serializable {

    private static final long serialVersionUID = 6231326269621578226L;

    private CityManagerBean cityManagerSessionBean;
    private List<City> citiesList;
    private SelectItem[] citiesSelectItems;

    public CityManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
//        this.citiesList = this.cityManagerSessionBean.findAll();
//        SelectItem[] selectItems = null;
//
//        if ((citiesList != null) && (!citiesList.isEmpty())) {
//            selectItems = new SelectItem[citiesList.size()];
//
//            for (int position = 0; position < citiesList.size(); position++) {
//                City city = citiesList.get(position);
//                selectItems[position] = new SelectItem(city,
//                        String.format("[%s] %s", city.getCode(),
//                                city.getCity()));
//            }
//        }
//
//        this.setCitiesSelectItems(selectItems);
    }

    public CityManagerBean getCityManagerSessionBean() {

        return cityManagerSessionBean;
    }

    public void setCityManagerSessionBean(
            CityManagerBean cityManagerSessionBean) {
        this.cityManagerSessionBean = cityManagerSessionBean;
    }

    public List<City> getCitiesList() {

        return (this.citiesList);
    }

    public void setCitiesList(List<City> citiesList) {
        this.citiesList = citiesList;
    }

    public SelectItem[] getCitiesSelectItems() {

        return (this.citiesSelectItems);
    }

    public void setCitiesSelectItems(SelectItem[] citiesSelectItems) {
        this.citiesSelectItems = citiesSelectItems;
    }
}
