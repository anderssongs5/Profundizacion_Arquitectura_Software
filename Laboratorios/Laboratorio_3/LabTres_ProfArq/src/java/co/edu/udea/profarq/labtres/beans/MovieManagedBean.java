package co.edu.udea.profarq.labtres.beans;

import co.edu.udea.profarq.labtres.model.entities.Casting;
import co.edu.udea.profarq.labtres.model.entities.Genre;
import co.edu.udea.profarq.labtres.model.entities.Movie;
import co.edu.udea.profarq.labtres.persistence.dao.IMovieDAO;
import co.edu.udea.profarq.labtres.persistence.dao.impl.MovieDAOImpl;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
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
    private Movie newMovie;
    private int duration;
    private String inequality;
    private DualListModel<Genre> genresDualListModel;
    private List<Genre> sourceGenresList;
    private static final String UPDATE_MOVIE = "UPDATE_MOVIE";
    private static final String BACK_MOVIE_LIST = "BACK_MOVIE_LIST";
    private static final String CREATE_MOVIE = "CREATE_MOVIE";
    private static final String SHOW_MOVIE = "SHOW_MOVIE";
    private static final String BACK_TO_UPDATED_MOVIES_LIST = "BACK_TO_UPDATED_MOVIES_LIST";
    private static final String FILTERED_MOVIES = "FILTERED_MOVIES";
    private SelectItem[] inequalities;

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

        this.inequalities = new SelectItem[6];
        this.inequalities[0] = new SelectItem(null, "Seleccione uno");
        Object[] objects = MovieDAOImpl.INEQUALITIES.keySet().toArray();
        for (int position = 0; position < objects.length; position++) {
            this.inequalities[position + 1] = new SelectItem((String) objects[position],
                    (String) objects[position]);
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

    public Movie getNewMovie() {
        return newMovie;
    }

    public void setNewMovie(Movie newMovie) {
        this.newMovie = newMovie;
    }

    public DualListModel<Genre> getGenresDualListModel() {
        return genresDualListModel;
    }

    public void setGenresDualListModel(DualListModel<Genre> genresDualListModel) {
        this.genresDualListModel = genresDualListModel;
    }

    public String getInequality() {
        return inequality;
    }

    public void setInequality(String inequality) {
        this.inequality = inequality;
    }

    public SelectItem[] getInequalities() {
        return inequalities;
    }

    public void setInequalities(SelectItem[] inequalities) {
        this.inequalities = inequalities;
    }

    public void refreshMoviesList() {

        this.setMoviesList(this.movieDAO.findAll());
    }

    public void createMovie(ActionEvent actionEvent) {

    }

    public void saveMovie(ActionEvent actionEvent) {
        StringTokenizer token = new StringTokenizer(this.newMovie.getCasting(), ";");
        while (token.hasMoreElements()) {
            this.newMovie.getCastingsList().add(new Casting(
                    token.nextToken()));
        }

        for (Object genreName : this.getGenresDualListModel().getTarget()) {
            this.getNewMovie().getGenresList().add(new Genre((String) genreName));
        }

        if (this.movieDAO.insert(this.newMovie)) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Guardar Película",
                            "Película guardada exitosamente."));

            this.recreateAttributes();
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Guardar Película",
                            "Por favor inténtelo de nuevo o contáctese "
                            + "con el administrador."));
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String navigateToUpdateMovieUI() {
        if (this.selectedMovie == null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Actualizar Película",
                            "Por favor selecciona una película."));

            return (null);
        }

        this.sourceGenresList = this.genreManagedBean.createFilteredGenresList(
                this.selectedMovie.getGenresList());

        this.genresDualListModel = new DualListModel<>(sourceGenresList,
                this.selectedMovie.getGenresList());

        return (UPDATE_MOVIE);
    }

    public void updateMovie(ActionEvent actionEvent) {
        if (this.selectedMovie != null) {
            this.getSelectedMovie().getGenresList().clear();
            for (Object genreName : this.getGenresDualListModel().getTarget()) {
                this.getSelectedMovie().getGenresList().add(new Genre((String) genreName));
            }

            if (this.movieDAO.update(this.selectedMovie) != null) {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO,
                                "Actualizar Película",
                                "Película actualizada exitosamente."));

            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_WARN,
                                "Actualizar Película",
                                "Por favor vuelva a intentarlo."));
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Actualizar Película",
                            "Por favor seleccione una película."));
        }
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

    public String backMovieList() {
        this.selectedMovie = null;

        return (BACK_MOVIE_LIST);
    }

    public String navigateToCreateMovieUI() {
        this.newMovie = new Movie();
        this.newMovie.setCastingsList(new ArrayList<>());
        this.newMovie.setGenresList(new ArrayList<>());
        this.createDualListModel();

        return (CREATE_MOVIE);
    }

    public String navigateToShowMovieUI() {
        if (this.selectedMovie == null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Ver Película",
                            "Por favor selecciona una película."));

            return (null);
        }

        return (SHOW_MOVIE);
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

    public String formatCasting(List<Casting> castingList) {
        StringBuilder castingFormat = new StringBuilder();

        if ((castingList != null) && (!castingList.isEmpty())) {
            for (int position = 0; position < castingList.size(); position++) {
                Casting casting = castingList.get(position);
                castingFormat.append(casting.getFullName());

                if (position != (castingList.size() - 1)) {
                    castingFormat.append(", ");
                }
            }
        }

        return (castingFormat.toString());
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

    private void createDualListModel() {
        List<Genre> source = GenreManagedBean.GENRES_LIST;

        this.setGenresDualListModel(new DualListModel<>(source,
                new ArrayList<Genre>()));
    }

    private void recreateAttributes() {
        this.newMovie.setClassification("");
        this.newMovie.setCountry("");
        this.newMovie.setDirector("");
        this.newMovie.setDuration(0);
        this.newMovie.setLanguage("");
        this.newMovie.setPseudonym("");
        this.newMovie.setReleaseDate("");
        this.newMovie.setSynopsis("");
        this.newMovie.setTitle("");
        this.newMovie.setCastingsList(new ArrayList<>());
        this.newMovie.setGenresList(new ArrayList<>());

        this.createDualListModel();
    }

    public String backToUpdatedFilmsList() {
        this.selectedMovie = null;
        this.refreshMoviesList();

        return (BACK_TO_UPDATED_MOVIES_LIST);
    }

    public String findByInequality() {
        if (this.inequality != null && !this.inequality.equals("")) {

            this.moviesList = this.movieDAO.findByInequality(this.inequality,
                    this.duration);
        }

        return (FILTERED_MOVIES);
    }
}
