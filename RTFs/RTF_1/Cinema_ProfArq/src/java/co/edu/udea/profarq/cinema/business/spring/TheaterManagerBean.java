package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Theater;
import co.edu.udea.profarq.cinema.persistence.dao.ITheaterDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class TheaterManagerBean implements Serializable {

    private static final long serialVersionUID = -2529949619130674787L;

    private ITheaterDAO theaterDAO;

    public TheaterManagerBean() {
        super();
    }

    public ITheaterDAO getTheaterDAO() {

        return theaterDAO;
    }

    public void setTheaterDAO(ITheaterDAO theaterDAO) {
        this.theaterDAO = theaterDAO;
    }

    public List<Theater> findAll() throws CinemaBusinessException {
        try {

            return (this.getTheaterDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}
