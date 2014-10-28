package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.FilmManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Classification;
import co.edu.udea.profarq.labuno.model.entity.Country;
import co.edu.udea.profarq.labuno.model.entity.Director;
import co.edu.udea.profarq.labuno.model.entity.Film;
import co.edu.udea.profarq.labuno.model.entity.FilmPK;
import co.edu.udea.profarq.labuno.model.entity.Genre;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import org.primefaces.model.DualListModel;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class FilmManagedBean implements Serializable {

    private static final long serialVersionUID = -2928802982092664648L;

    private static final DateFormat RELEASE_DATE_FORMATER = new SimpleDateFormat("dd/MM/yyyy");

    public static final String BACK_TO_FILMS_LIST_PAGE_FLOW = "BACK_FILMS_LIST";
    public static final String BACK_TO_UPDATED_FILMS_LIST_PAGE_FLOW = "BACK_UPDATED_FILMS_LIST";
    public static final String CREATE_BILLBOARD_PAGE_FLOW = "CREATE_BILLBOARD";
    public static final String CREATE_FILM_PAGE_FLOW = "CREATE_FILM";
    public static final String SHOW_FILM_PAGE_FLOW = "SHOW_FILM";
    public static final String UPDATE_BILLBOARDS_PAGE_FLOW = "UPDATE_BILLBOARDS";

    @EJB()
    private FilmManagerSessionBean filmManagerSessionBean;
    private DirectorManagedBean directorManagedBean;
    private GenreManagedBean genreManagedBean;
    private Film selectedFilm;
    private Film newFilm;
    private List<Film> filmsList;
    private DualListModel<Genre> genresDualListModel;

    public FilmManagedBean() {
        super();
    }

    public void deleteFilm(ActionEvent actionEvent) {
        if (this.getSelectedFilm() != null) {
            if (this.filmManagerSessionBean.delete(this.getSelectedFilm())) {
                this.refreshPage();
            }
        }
    }

    public void saveFilm(ActionEvent actionEvent) {
        if ((this.getNewFilm() != null)
                && (this.getNewFilm().getFilmPK() != null)) {
            List<Director> directorsList = new ArrayList<>();
            StringTokenizer stringTokenizer = new StringTokenizer(
                    this.getNewFilm().getFullNamesDirectors(), ";");
            Director director;

            while (stringTokenizer.hasMoreElements()) {
                director = new Director(stringTokenizer.nextToken().trim());
                directorsList.add(director);

                try {
                    this.getDirectorManagedBean().save(director);
                } catch (Exception e) {
                }
            }
            this.getNewFilm().setDirectorList(directorsList);

            this.filmManagerSessionBean.save(this.getNewFilm());
        }
    }

    public String formatDirectorsList(List<Director> directorsList) {
        StringBuilder directorsFormat = new StringBuilder();

        if ((directorsList != null) && (!directorsList.isEmpty())) {
            for (int position = 0; position < directorsList.size(); position++) {
                Director director = directorsList.get(position);
                directorsFormat.append(director.getFullName());

                if (position != (directorsList.size() - 1)) {
                    directorsFormat.append(", ");
                }
            }
        }

        return (directorsFormat.toString());
    }

    public String formatFilmDuration(long duration) {
        float minutes = (float) (duration * 0.000016666666666667);

        return (String.format("%.1f Minutos", minutes));
    }

    public String formatFilmReleaseDate(Date filmReleaseDate) {

        return (RELEASE_DATE_FORMATER.format(filmReleaseDate));
    }

    public String formatGenresList(List<Genre> genresList) {
        StringBuilder genresFormat = new StringBuilder();

        if ((genresList != null) && (!genresList.isEmpty())) {
            for (int position = 0; position < genresList.size(); position++) {
                Genre genre = genresList.get(position);
                genresFormat.append(genre.getGenre());

                if (position != (genresList.size() - 1)) {
                    genresFormat.append(", ");
                }
            }
        }

        return (genresFormat.toString());
    }

    public Film getSelectedFilm() {

        return (this.selectedFilm);
    }

    public void setSelectedFilm(Film selectedFilm) {
        this.selectedFilm = selectedFilm;
    }

    public List<Film> getFilmsList() {
        if ((this.filmsList == null) || (this.filmsList.isEmpty())) {
            this.refreshPage();
        }

        return (this.filmsList);
    }

    public void setFilmsList(List<Film> filmsList) {
        this.filmsList = filmsList;
    }

    public Film getNewFilm() {

        return (this.newFilm);
    }

    public void setNewFilm(Film newFilm) {
        this.newFilm = newFilm;
    }

    public DualListModel<Genre> getGenresDualListModel() {

        return (this.genresDualListModel);
    }

    public void setGenresDualListModel(DualListModel<Genre> genresDualListModel) {
        this.genresDualListModel = genresDualListModel;
    }

    public DirectorManagedBean getDirectorManagedBean() {

        return (this.directorManagedBean);
    }

    public void setDirectorManagedBean(DirectorManagedBean directorManagedBean) {
        this.directorManagedBean = directorManagedBean;
    }

    public GenreManagedBean getGenreManagedBean() {

        return (this.genreManagedBean);
    }

    public void setGenreManagedBean(GenreManagedBean genreManagedBean) {
        this.genreManagedBean = genreManagedBean;
    }

    public String backToFilmsList() {

        return (BACK_TO_FILMS_LIST_PAGE_FLOW);
    }

    public String backToUpdatedFilmsList() {
        this.refreshPage();

        return (BACK_TO_UPDATED_FILMS_LIST_PAGE_FLOW);
    }

    public String createBillboard() {

        return (CREATE_BILLBOARD_PAGE_FLOW);
    }

    public String createFilm() {
        this.newFilm = new Film(new FilmPK());
        this.newFilm.setClassification(new Classification());
        this.newFilm.setCountry(new Country());
        this.newFilm.setGenreList(new ArrayList<Genre>());

        this.createDualListModel();

        return (CREATE_FILM_PAGE_FLOW);
    }

    public String showFilm() {

        return (SHOW_FILM_PAGE_FLOW);
    }

    public String updateBillboards() {

        return (UPDATE_BILLBOARDS_PAGE_FLOW);
    }

    private void createDualListModel() {
        List<Genre> source = this.genreManagedBean.getGenresList();

        this.setGenresDualListModel(new DualListModel<>(source,
                this.newFilm.getGenreList()));
    }

    private void refreshPage() {
        this.setFilmsList(this.filmManagerSessionBean.findAll());
    }
}
