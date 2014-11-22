package co.edu.udea.profarq.cinema.persistence.dao;

import co.edu.udea.profarq.cinema.model.entities.Film;
import co.edu.udea.profarq.cinema.model.entities.FilmPK;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IFilmDAO {

    public Film delete(Film film) throws CinemaPersistenceException;

    public List<Film> findAll() throws CinemaPersistenceException;

    public FilmPK save(Film film) throws CinemaPersistenceException;
}