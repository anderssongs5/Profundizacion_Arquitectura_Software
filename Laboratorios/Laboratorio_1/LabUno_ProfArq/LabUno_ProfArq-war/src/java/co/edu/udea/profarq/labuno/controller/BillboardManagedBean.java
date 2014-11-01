package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.BillboardManagerSessionBean;
import co.edu.udea.profarq.labuno.business.StatusManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.AudioFormat;
import co.edu.udea.profarq.labuno.model.entity.AudioFormatPK;
import co.edu.udea.profarq.labuno.model.entity.Billboard;
import co.edu.udea.profarq.labuno.model.entity.BillboardPK;
import co.edu.udea.profarq.labuno.model.entity.City;
import co.edu.udea.profarq.labuno.model.entity.Film;
import co.edu.udea.profarq.labuno.model.entity.FilmPK;
import co.edu.udea.profarq.labuno.model.entity.Status;
import co.edu.udea.profarq.labuno.model.entity.Theater;
import co.edu.udea.profarq.labuno.model.entity.TheaterPK;
import co.edu.udea.profarq.labuno.model.entity.VideoFormat;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
        this.newBillboard.setStatus(new Status(
                StatusManagerSessionBean.SOON_BILLBOARD));

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
        String videoFormat = this.getNewBillboard().getBillboardPK().getVideoFormat();
        String theaterCity = this.getNewBillboard().getBillboardPK().getTheaterCity();
        String theater = this.getNewBillboard().getBillboardPK().getTheater();
        String audioLanguage = this.getNewBillboard().getBillboardPK().getAudioLanguage();
        String subtitleLanguage = this.getNewBillboard().getBillboardPK().getSubtitleLanguage();
        String filmTitle = this.getNewBillboard().getBillboardPK().getFilmTitle();
        Date filmReleaseDate = this.getNewBillboard().getBillboardPK().getFilmReleaseDate();

        this.newBillboard.setVideoFormat1(new VideoFormat(videoFormat));
        this.newBillboard.setTheater1(new Theater(new TheaterPK(theaterCity, theater)));
        this.newBillboard.setAudioFormat(new AudioFormat(new AudioFormatPK(
                audioLanguage, subtitleLanguage)));
        this.newBillboard.setFilm(new Film(new FilmPK(filmTitle, filmReleaseDate)));

        this.billboardManagerSessionBean.save(this.getNewBillboard());

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Billboard Saved"));

        this.recreateAttributes();
    }

    private void recreateAttributes() {
        this.init();
    }

    public void updateBillboards(ActionEvent actionEvent) {
        if (this.billboardsList != null) {
            String statusCode;
            for (Billboard billboard : this.billboardsList) {
                statusCode = billboard.getStatus().getStatus();
                billboard.setStatus(new Status(statusCode));

                switch (statusCode) {
                    case StatusManagerSessionBean.ON_BILLBOARD:
                    case StatusManagerSessionBean.SOON_BILLBOARD:
                        billboard.setOutDate(null);
                        break;

                    case StatusManagerSessionBean.OUT_BILLBOARD:
                        billboard.setOutDate(new Date());
                }

                billboard = this.billboardManagerSessionBean.update(billboard);
            }
        }
    }

    private void refreshPage() {
        if ((this.filmManagedBean != null)
                && (this.filmManagedBean.getSelectedFilm() != null)) {
            this.billboardsList = this.billboardManagerSessionBean.findByFilm(
                    this.getFilmManagedBean().getSelectedFilm());
        }
    }
}
