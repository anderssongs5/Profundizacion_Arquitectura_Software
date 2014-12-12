package co.edu.udea.profarq.labtres.persistence.dao;

import co.edu.udea.profarq.labtres.model.entities.Movie;
import java.util.List;

public interface IMovieDAO {

    public Movie find(String title);

    public List<Movie> findAll();

    public boolean insert(Movie movie);

    public Movie update(Movie movie);

    public boolean delete(Movie movie);

    public List<Movie> findByInequality(String inequality, int duration);
}
