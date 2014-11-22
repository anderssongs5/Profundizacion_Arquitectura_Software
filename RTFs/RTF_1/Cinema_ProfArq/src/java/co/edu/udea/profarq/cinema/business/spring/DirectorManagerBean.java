package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Director;
import co.edu.udea.profarq.cinema.persistence.dao.IDirectorDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DirectorManagerBean implements Serializable {

    private static final long serialVersionUID = 1087624594924099346L;

    private IDirectorDAO directorDAO;

    public DirectorManagerBean() {
        super();
    }

    public IDirectorDAO getDirectorDAO() {

        return directorDAO;
    }

    public void setDirectorDAO(IDirectorDAO directorDAO) {
        this.directorDAO = directorDAO;
    }

    public Director find(String directorPK) throws CinemaBusinessException {
        try {

            return (this.getDirectorDAO().find(directorPK));
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }

    public void save(Director director) throws CinemaBusinessException {
        try {
            this.getDirectorDAO().save(director);
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}
