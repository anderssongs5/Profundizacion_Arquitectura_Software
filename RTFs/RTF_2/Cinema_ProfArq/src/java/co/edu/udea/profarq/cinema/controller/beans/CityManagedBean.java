package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.CityManagerBean;
import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.City;
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
public class CityManagedBean implements Serializable {

    private static final long serialVersionUID = 6231326269621578226L;

    private CityManagerBean cityManagerBean;
    private List<City> citiesList;
    private SelectItem[] citiesSelectItems;

    public CityManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        SelectItem[] selectItems = null;

        try {
            this.citiesList = this.cityManagerBean.findAll();
        } catch (CinemaBusinessException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                            "City Error", e.getMessage()));

            this.setCitiesSelectItems(selectItems);

            return;
        }

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

    public CityManagerBean getCityManagerBean() {

        return (this.cityManagerBean);
    }

    public void setCityManagerBean(
            CityManagerBean cityManagerBean) {
        this.cityManagerBean = cityManagerBean;
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
