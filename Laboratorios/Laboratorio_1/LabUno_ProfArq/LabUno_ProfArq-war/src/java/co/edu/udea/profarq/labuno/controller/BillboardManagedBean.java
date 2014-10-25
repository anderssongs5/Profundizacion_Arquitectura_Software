package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.BillboardManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Billboard;
import co.edu.udea.profarq.labuno.model.entity.BillboardPK;
import co.edu.udea.profarq.labuno.model.entity.City;
import co.edu.udea.profarq.labuno.model.entity.Film;
import co.edu.udea.profarq.labuno.model.entity.Status;
import co.edu.udea.profarq.labuno.model.entity.Theater;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class BillboardManagedBean implements Serializable {

    private static final long serialVersionUID = 4143438520136358109L;

    @EJB()
    private BillboardManagerSessionBean billboardManagerSessionBean;
    private CityManagedBean cityManagedBean;
    private FilmManagedBean filmManagedBean;
    private TheaterManagedBean theaterManagedBean;
    private Billboard newBillboard;
    private List<Billboard> billboardsList;
    private Map<String, String> citiesMap;
    private Map<String, String> theatersMap;
    private Map<String, Map<String, String>> theatersPerCitiesMap;

    public BillboardManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        BillboardPK billboardPK = new BillboardPK();
        billboardPK.setFilmReleaseDate(this.getFilmManagedBean().
                getSelectedFilm().getFilmPK().getReleaseDate());
        billboardPK.setFilmTitle(this.getFilmManagedBean().getSelectedFilm().
                getFilmPK().getTitle());

        this.newBillboard = new Billboard(billboardPK);
        this.newBillboard.setStatus(new Status("1"));

        List<City> citiesFound = this.getCityManagedBean().getCitiesList();
        if (citiesFound != null) {
            this.citiesMap = new HashMap<>();
            for (City city : citiesFound) {
                this.citiesMap.put(city.getCity(), city.getCode());
            }
        }
    }

    public CityManagedBean getCityManagedBean() {

        return (this.cityManagedBean);
    }

    public void setCityManagedBean(CityManagedBean cityManagedBean) {
        this.cityManagedBean = cityManagedBean;
    }

    public FilmManagedBean getFilmManagedBean() {

        return (this.filmManagedBean);
    }

    public void setFilmManagedBean(FilmManagedBean filmManagedBean) {
        this.filmManagedBean = filmManagedBean;
    }

    public TheaterManagedBean getTheaterManagedBean() {

        return (this.theaterManagedBean);
    }

    public void setTheaterManagedBean(TheaterManagedBean theaterManagedBean) {
        this.theaterManagedBean = theaterManagedBean;
    }

    public Billboard getNewBillboard() {

        return (this.newBillboard);
    }

    public void setNewBillboard(Billboard newBillboard) {
        this.newBillboard = newBillboard;
    }

    public List<Billboard> getBillboardsList() {
        if ((this.billboardsList == null) || (this.billboardsList.isEmpty())) {
            this.refreshPage();
        }

        return (this.billboardsList);
    }

    public void setBillboardsList(List<Billboard> billboardsList) {
        this.billboardsList = billboardsList;
    }

    public Map<String, String> getCitiesMap() {

        return (this.citiesMap);
    }

    public void setCitiesMap(Map<String, String> citiesMap) {
        this.citiesMap = citiesMap;
    }

    public Map<String, String> getTheatersMap() {

        return (this.theatersMap);
    }

    public void setTheatersMap(Map<String, String> theatersMap) {
        this.theatersMap = theatersMap;
    }

    public Map<String, Map<String, String>> getTheatersPerCitiesMap() {

        return (this.theatersPerCitiesMap);
    }

    public void setTheatersPerCitiesMap(
            Map<String, Map<String, String>> theatersPerCitiesMap) {
        this.theatersPerCitiesMap = theatersPerCitiesMap;
    }

    public void onChangeCity() {
        if ((this.getNewBillboard().getBillboardPK().getTheaterCity() != null)
                && !(this.getNewBillboard().getBillboardPK().getTheaterCity()
                .equals(""))) {
            List<Theater> theatersFound = this.getTheaterManagedBean().
                    getTheatersList();

            if (theatersFound != null) {
                this.theatersMap = new HashMap<>();

                for (Theater theater : theatersFound) {
                    if (theater.getTheaterPK().getCityCode().equals(
                            this.getNewBillboard().getBillboardPK()
                            .getTheaterCity())) {
                        this.theatersMap.put(theater.getTheaterPK().getTheater(),
                                theater.getTheaterPK().getTheater());
                    }
                }
            }
        }
    }

    public void saveBillboard(ActionEvent actionEvent) {
        this.billboardManagerSessionBean.save(this.getNewBillboard());
    }

    public void updateBillboards(ActionEvent actionEvent) {
        if (this.billboardsList != null) {
            for (Billboard billboard : this.billboardsList) {

            }
        }
    }

    private void refreshPage() {
        if ((this.filmManagedBean != null)
                && (this.filmManagedBean.getSelectedFilm() != null)) {
            Film selectedFilm = this.getFilmManagedBean().getSelectedFilm();

            this.billboardsList = this.billboardManagerSessionBean.findByFilm(
                    selectedFilm);
        }
    }
}
