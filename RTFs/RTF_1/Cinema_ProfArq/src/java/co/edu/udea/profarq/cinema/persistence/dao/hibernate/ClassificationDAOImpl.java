package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.Classification;
import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.dao.IClassificationDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ClassificationDAOImpl extends AbstractEntityDAO
        implements IClassificationDAO {

    public ClassificationDAOImpl() {
        super();
    }

    @Override()
    public List<Classification> findAll() throws CinemaPersistenceException {
        List<Classification> classificationsList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Classification.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                classificationsList.add((Classification) entity);
            }
        }

        return (classificationsList);
    }
}
