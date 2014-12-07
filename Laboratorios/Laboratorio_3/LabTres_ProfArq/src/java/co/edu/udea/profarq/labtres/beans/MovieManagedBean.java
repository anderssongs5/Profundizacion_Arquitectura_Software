package co.edu.udea.profarq.labtres.beans;

import co.edu.udea.profarq.labtres.model.entities.Genre;
import co.edu.udea.profarq.labtres.model.entities.Movie;
import co.edu.udea.profarq.labtres.persistence.dao.IMovieDAO;
import co.edu.udea.profarq.labtres.persistence.dao.impl.MovieDAOImpl;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.DualListModel;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Stateless()
@Named(value = "movieManagedBean")
public class MovieManagedBean implements Serializable {

    private static final long serialVersionUID = 4953721668114682847L;

    @Inject()
    private GenreManagedBean genreManagedBean;
    private IMovieDAO movieDAO;
    private List<Movie> moviesList;
    private Movie selectedMovie;
    private DualListModel<Genre> genresDualListModel;
    private static final String UPDATE_MOVIE = "UPDATE_MOVIE";
    private static final String BACK_MOVIE_LIST = "BACK_MOVIE_LIST";

    public MovieManagedBean() {
    }

    @PostConstruct()
    private void init() {
        try {
            movieDAO = MovieDAOImpl.getInstance();
        } catch (UnknownHostException ex) {
            System.err.println(ex);
        }

        if (this.movieDAO != null) {
            this.refreshMoviesList();
        }
    }

    public List<Movie> getMoviesList() {
        return (this.moviesList);
    }

    public void setMoviesList(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    public Movie getSelectedMovie() {
        return (this.selectedMovie);
    }

    public void setSelectedMovie(Movie selectedMovie) {
        this.selectedMovie = selectedMovie;
    }

    public void refreshMoviesList() {

        this.setMoviesList(this.movieDAO.findAll());
    }

    public String formatClassification(String classification) {
        String formatedValue;

        if (!classification.equals("00")) {
            formatedValue = String.format("%s %s %s", "Mayores de",
                    classification, " años");
        } else {
            formatedValue = String.format("%s", "Todo público");
        }

        return (formatedValue);
    }

    public void createMovie(ActionEvent actionEvent) {

    }

    public String updateMovie() {
        if (this.selectedMovie == null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Actualizar Película",
                            "Por favor selecciona una película."));

            return (null);
        }

        this.genreManagedBean.createFilteredGenresList(this.selectedMovie.getGenresList());

        return (UPDATE_MOVIE);
    }

    public void deleteMovie(ActionEvent actionEvent) {
        if (this.selectedMovie == null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Eliminar Película",
                            "Por favor seleccione una película."));

            return;
        }

        if (this.movieDAO.delete(this.selectedMovie)) {
            this.refreshMoviesList();
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                            "Eliminar Película",
                            "No se ha podido eliminar la película "
                            + this.selectedMovie.getTitle()));
        }
    }

    public String backMovieList(ActionEvent actionEvent) {

        return (BACK_MOVIE_LIST);
    }
}
