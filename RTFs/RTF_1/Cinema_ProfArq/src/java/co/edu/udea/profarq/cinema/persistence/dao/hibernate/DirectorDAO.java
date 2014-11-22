package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.Billboard;
import co.edu.udea.profarq.cinema.model.entities.Director;
import co.edu.udea.profarq.cinema.persistence.dao.IDirectorDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DirectorDAO extends AbstractEntityDAO implements IDirectorDAO {

    @Override()
    public List<Billboard> findAll() throws CinemaPersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override()
    public Director find(Serializable directorPK) throws CinemaPersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override()
    public Director save(Director director) throws CinemaPersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}