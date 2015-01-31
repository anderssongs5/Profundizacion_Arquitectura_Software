package co.edu.udea.profarq.cinema.persistence.dao;

import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IEntityDAO {

    public Long count(Class<IEntity> clazz) throws CinemaPersistenceException;

    public IEntity delete(IEntity entity)
            throws CinemaPersistenceException;

    public List<IEntity> executeNamedQuery(String namedQuery,
            Map<String, Serializable> parameteresMap)
            throws CinemaPersistenceException;

    public List<IEntity> findAll(Class<IEntity> clazz)
            throws CinemaPersistenceException;

    public List<IEntity> findByAttributes(Class<IEntity> clazz,
            Object... attributesArgs) throws CinemaPersistenceException;

    public IEntity find(Class<IEntity> clazz, Serializable primaryKey)
            throws CinemaPersistenceException;

    public Serializable save(IEntity entity) throws CinemaPersistenceException;

    public IEntity update(IEntity entity) throws CinemaPersistenceException;
}
