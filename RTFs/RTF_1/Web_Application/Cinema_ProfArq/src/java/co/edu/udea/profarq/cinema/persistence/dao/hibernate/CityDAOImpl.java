package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.City;
import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.dao.ICityDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CityDAOImpl extends AbstractEntityDAO implements ICityDAO {

    public CityDAOImpl() {
        super();
    }

    @Override()
    public List<City> findAll() throws CinemaPersistenceException {
        List<City> videoFormatsList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(City.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                videoFormatsList.add((City) entity);
            }
        }

        return (videoFormatsList);
    }
}
