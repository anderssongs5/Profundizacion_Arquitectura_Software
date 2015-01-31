package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.Billboard;
import co.edu.udea.profarq.cinema.model.entities.BillboardPK;
import co.edu.udea.profarq.cinema.model.entities.Film;
import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.model.entities.TheaterPK;
import co.edu.udea.profarq.cinema.persistence.dao.IBillboardDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class BillboardDAOImpl extends AbstractEntityDAO
        implements IBillboardDAO {

    public BillboardDAOImpl() {
        super();
    }

    @Override()
    public List<Billboard> findAll() throws CinemaPersistenceException {
        List<Billboard> billboardsList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Billboard.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                billboardsList.add((Billboard) entity);
            }
        }

        return (billboardsList);
    }

    @Override()
    public List<Billboard> findByFilm(Film film)
            throws CinemaPersistenceException {
        try {
            CriteriaBuilder criteriaBuilder = super.getEntityManager().
                    getCriteriaBuilder();
            CriteriaQuery<Billboard> criteriaQuery = criteriaBuilder.createQuery(
                    Billboard.class);
            Root<Billboard> root = criteriaQuery.from(Billboard.class);

            criteriaQuery.select(root).where(criteriaBuilder.and(
                    criteriaBuilder.equal(root.get("billboardPK").
                            get("filmReleaseDate"),
                            film.getFilmPK().getReleaseDate()),
                    criteriaBuilder.equal(root.get("billboardPK").
                            get("filmTitle"), film.getFilmPK().getTitle())));

            return (super.getEntityManager().createQuery(criteriaQuery)
                    .getResultList());
        } catch (Exception e) {
            throw new CinemaPersistenceException(
                    "Fatal error while the DAO was trying count entities", e);
        }
    }

    @Override()
    public List<Billboard> findByTheater(Serializable theaterPK)
            throws CinemaPersistenceException {
        TheaterPK tPK = (TheaterPK) theaterPK;
        Map<String, Serializable> parameteresMap = new HashMap<>();
        parameteresMap.put("theaterCity", tPK.getCityCode());
        parameteresMap.put("theater", tPK.getTheater());
        parameteresMap.put("status", "2");

        List<Billboard> billboardsList = new ArrayList<>();
        List<IEntity> entitiesList = super.executeNamedQuery(
                "Billboard.findByTheaterPK", parameteresMap);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                billboardsList.add((Billboard) entity);
            }
        }

        return (billboardsList);
    }

    @Override()
    public BillboardPK save(Billboard billboard)
            throws CinemaPersistenceException {
        Serializable billboardPK = super.save(billboard);

        return ((billboardPK != null) ? (BillboardPK) billboardPK : null);
    }

    @Override()
    public Billboard update(Billboard billboard)
            throws CinemaPersistenceException {
        IEntity entity = super.update(billboard);

        return ((entity != null) ? (Billboard) entity : null);
    }
}
