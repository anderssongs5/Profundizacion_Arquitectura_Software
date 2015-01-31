package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.model.entities.Status;
import co.edu.udea.profarq.cinema.persistence.dao.IStatusDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class StatusDAOImpl extends AbstractEntityDAO implements IStatusDAO {

    public StatusDAOImpl() {
        super();
    }

    @Override()
    public List<Status> findAll() throws CinemaPersistenceException {
        List<Status> statusesList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Status.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                statusesList.add((Status) entity);
            }
        }

        return (statusesList);
    }
}
