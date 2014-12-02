package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.dao.IEntityDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
abstract class AbstractEntityDAO implements IEntityDAO {

    @PersistenceContext(unitName = "Cinema_ProfArqPU")
    protected EntityManager entityManager;

    public AbstractEntityDAO() {
        super();
    }

    public EntityManager getEntityManager() {

        return (this.entityManager);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override()
    @SuppressWarnings(value = {"rawtypes", "unchecked"})
    public Long count(Class<IEntity> clazz) throws CinemaPersistenceException {
        try {
            CriteriaQuery criteriaQuery = this.getEntityManager()
                    .getCriteriaBuilder().createQuery();
            Root<IEntity> root = criteriaQuery.from(clazz);

            criteriaQuery.select(this.getEntityManager().getCriteriaBuilder()
                    .count(root));

            Query query = this.getEntityManager().createQuery(criteriaQuery);

            return ((Long) query.getSingleResult());
        } catch (Exception e) {
            throw new CinemaPersistenceException(
                    "Fatal error while the DAO was trying count entities", e);
        }
    }

    @Override()
    @SuppressWarnings(value = {"rawtypes"})
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public IEntity delete(IEntity entity) throws CinemaPersistenceException {
        IEntity found = null;

        try {
            found = this.find(entity.getClass(),
                    entity.getPrimaryKey());
            this.getEntityManager().remove(found);
        } catch (Exception e) {
            throw new CinemaPersistenceException(
                    "Fatal error while the DAO was trying delete an entity", e);
        } finally {
            this.getEntityManager().flush();
        }

        return (found);
    }

    @Override()
    @SuppressWarnings(value = {"unchecked"})
    public List<IEntity> executeNamedQuery(String namedQuery, String where,
            Object whereArg) throws CinemaPersistenceException {
        List<IEntity> resultList = null;

        try {
            Query query = this.getEntityManager().createNamedQuery(namedQuery);
            query.setParameter(where, whereArg);
            resultList = query.getResultList();
        } catch (Exception e) {
            throw new CinemaPersistenceException(
                    "Fatal error while the DAO was trying to execute the named query.",
                    e);
        }

        return (resultList);
    }

    @Override()
    @SuppressWarnings(value = {"rawtypes", "unchecked"})
    public List<IEntity> findAll(Class clazz)
            throws CinemaPersistenceException {
        List<IEntity> entities = null;

        try {
            CriteriaQuery criteriaQuery = this.getEntityManager().
                    getCriteriaBuilder().createQuery(clazz);

            criteriaQuery.select(criteriaQuery.from(clazz));
            entities = (List<IEntity>) this.getEntityManager().
                    createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            throw new CinemaPersistenceException(
                    "Fatal error while the DAO was trying to recover a list of entities from Database",
                    e);
        }

        return (entities);
    }

    @Override()
    public List<IEntity> findByAttributes(Class<IEntity> clazz,
            Object... attributesArgs) throws CinemaPersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override()
    @SuppressWarnings(value = {"rawtypes", "unchecked"})
    public IEntity find(Class clazz, Serializable primaryKey)
            throws CinemaPersistenceException {
        IEntity entity = null;

        try {
            entity = (IEntity) this.getEntityManager().find(clazz, primaryKey);
        } catch (Exception e) {
            throw new CinemaPersistenceException(
                    "Fatal error while the DAO was trying to find or search an entity.",
                    e);
        }

        return (entity);
    }

    @Override()
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public Serializable save(IEntity entity) throws CinemaPersistenceException {
        try {
            this.getEntityManager().persist(entity);
            this.getEntityManager().flush();
        } catch (Exception e) {
            throw new CinemaPersistenceException(
                    "Fatal error while the DAO was trying to persist or save an entity.",
                    e);
        }

        return (entity.getPrimaryKey());
    }

    @Override()
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public IEntity update(IEntity entity) throws CinemaPersistenceException {
        try {
            this.getEntityManager().merge(entity);
        } catch (Exception e) {
            throw new CinemaPersistenceException(
                    "Fatal error while the DAO was trying to update or refresh an entity.",
                    e);
        } finally {
            this.getEntityManager().flush();
        }

        return (entity);
    }
}