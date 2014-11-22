package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Film;
import co.edu.udea.profarq.cinema.persistence.dao.IFilmDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class FilmManagerBean implements Serializable {

    private static final long serialVersionUID = 808837768356773194L;

    private IFilmDAO filmDAO;

    public FilmManagerBean() {
        super();
    }

    public IFilmDAO getFilmDAO() {

        return filmDAO;
    }

    public void setFilmDAO(IFilmDAO filmDAO) {
        this.filmDAO = filmDAO;
    }

    public boolean delete(Film film) throws CinemaBusinessException {
        try {
            if (film != null) {
                film = this.getFilmDAO().delete(film);

                return (film != null);
            }
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }

        return (false);
    }

    public List<Film> findAll() throws CinemaBusinessException {
        try {

            return (this.getFilmDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }

    public void save(Film film) throws CinemaBusinessException {
        try {

            this.getFilmDAO().save(film);
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}
