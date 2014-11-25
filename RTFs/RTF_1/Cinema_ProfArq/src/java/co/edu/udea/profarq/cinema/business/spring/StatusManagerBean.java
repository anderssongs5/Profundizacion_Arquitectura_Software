package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Status;
import co.edu.udea.profarq.cinema.persistence.dao.IStatusDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/* *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class StatusManagerBean implements Serializable {

    private static final long serialVersionUID = -4344873700627880508L;

    public static final String SOON_BILLBOARD = "1";
    public static final String ON_BILLBOARD = "2";
    public static final String OUT_BILLBOARD = "3";

    private IStatusDAO statusDAO;

    public StatusManagerBean() {
        super();
    }

    public IStatusDAO getStatusDAO() {

        return (this.statusDAO);
    }

    public void setStatusDAO(IStatusDAO statusDAO) {
        this.statusDAO = statusDAO;
    }

    public List<Status> findAll() throws CinemaBusinessException {
        try {

            return (this.getStatusDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}
