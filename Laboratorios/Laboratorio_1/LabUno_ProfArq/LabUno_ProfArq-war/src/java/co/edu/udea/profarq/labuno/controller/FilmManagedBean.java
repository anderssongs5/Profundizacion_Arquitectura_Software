package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.FilmManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Director;
import co.edu.udea.profarq.labuno.model.entity.Film;
import co.edu.udea.profarq.labuno.model.entity.Genre;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class FilmManagedBean implements Serializable {

    private static final long serialVersionUID = 2350741601449118720L;
    private static final DateFormat RELEASE_DATE_FORMATER = new SimpleDateFormat("dd/MM/yyyy");

    public static final String BACK_TO_FILMS_LIST_PAGE_FLOW = "BACK_FILMS_LIST";
    public static final String CREATE_BILLBOARD_PAGE_FLOW = "CREATE_BILLBOARD";
    public static final String SHOW_FILM_PAGE_FLOW = "SHOW_FILM";
    public static final String UPDATE_BILLBARDS_PAGE_FLOW = "UPDATE_BILLBOARDS";

    @EJB()
    private FilmManagerSessionBean filmManagerSessionBean;
    private Film selectedFilm;
    private List<Film> filmsList;

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

    public String formatFilmReleaseDate(Date filmReleaseDate) {

        return (RELEASE_DATE_FORMATER.format(filmReleaseDate));
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

    public String backToFilmsList() {

        return (BACK_TO_FILMS_LIST_PAGE_FLOW);
    }

    public String createBillboard() {

        return (CREATE_BILLBOARD_PAGE_FLOW);
    }

    public String showFilm() {

        return (SHOW_FILM_PAGE_FLOW);
    }

    public String updateBillboards() {

        return (UPDATE_BILLBARDS_PAGE_FLOW);
    }

    private void refreshPage() {
        this.setFilmsList(this.filmManagerSessionBean.findAll());
    }
}
