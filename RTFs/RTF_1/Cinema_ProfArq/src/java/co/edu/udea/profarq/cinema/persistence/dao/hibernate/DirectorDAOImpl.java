package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.Director;
import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.dao.IDirectorDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DirectorDAOImpl extends AbstractEntityDAO implements IDirectorDAO {

    public DirectorDAOImpl() {
        super();
    }

    @Override()
    public List<Director> findAll() throws CinemaPersistenceException {
        List<Director> videoFormatsList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Director.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                videoFormatsList.add((Director) entity);
            }
        }

        return (videoFormatsList);
    }

    @Override()
    public Director find(String directorPK) throws CinemaPersistenceException {
        IEntity entity = super.find(Director.class, directorPK);

        return ((entity != null) ? (Director) entity : null);
    }

    @Override()
    public String save(Director director) throws CinemaPersistenceException {
        Serializable directorPK = super.save(director);

        return ((directorPK != null) ? (String) directorPK : null);
    }
}