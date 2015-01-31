package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.model.entities.Theater;
import co.edu.udea.profarq.cinema.persistence.dao.ITheaterDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class TheaterDAOImpl extends AbstractEntityDAO implements ITheaterDAO {

    public TheaterDAOImpl() {
        super();
    }

    @Override()
    public List<Theater> findAll() throws CinemaPersistenceException {
        List<Theater> theatersList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Theater.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                theatersList.add((Theater) entity);
            }
        }

        return (theatersList);
    }

    @Override()
    public List<Theater> findByCity(Serializable cityPK)
            throws CinemaPersistenceException {
        Map<String, Serializable> parameteresMap = new HashMap<>();
        parameteresMap.put("cityCode", cityPK);

        List<Theater> theatersList = new ArrayList<>();
        List<IEntity> entitiesList = super.executeNamedQuery(
                "Theater.findByCityCode", parameteresMap);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                theatersList.add((Theater) entity);
            }
        }

        return (theatersList);
    }
}
