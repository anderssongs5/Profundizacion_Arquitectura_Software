package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Genre;
import co.edu.udea.profarq.cinema.persistence.dao.IGenreDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class GenreManagerBean implements Serializable {

    private static final long serialVersionUID = 2531572387145448163L;

    private IGenreDAO genreDAO;

    public GenreManagerBean() {
        super();
    }

    public IGenreDAO getGenreDAO() {

        return genreDAO;
    }

    public void setGenreDAO(IGenreDAO genreDAO) {
        this.genreDAO = genreDAO;
    }

    public List<Genre> findAll() throws CinemaBusinessException {
        try {

            return (this.getGenreDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}
