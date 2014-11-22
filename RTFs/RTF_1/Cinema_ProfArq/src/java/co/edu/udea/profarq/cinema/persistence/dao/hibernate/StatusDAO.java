package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.Status;
import co.edu.udea.profarq.cinema.persistence.dao.IStatusDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class StatusDAO extends AbstractEntityDAO implements IStatusDAO {

    @Override()
    public List<Status> findAll() throws CinemaPersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}