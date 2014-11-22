package co.edu.udea.profarq.cinema.persistence.dao;

import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IEntityDAO {

//    @SuppressWarnings(value = {"rawtypes"})
    public Long count(Class<IEntity> clazz) throws CinemaPersistenceException;

    public IEntity delete(IEntity entity)
            throws CinemaPersistenceException;

    public List<IEntity> executeNamedQuery(String namedQuery,
            String where, Object whereArg) throws CinemaPersistenceException;

//    @SuppressWarnings(value = {"rawtypes"})
    public List<IEntity> findAll(Class<IEntity> clazz)
            throws CinemaPersistenceException;

//    @SuppressWarnings(value = {"rawtypes"})
    public List<IEntity> findByAttributes(Class<IEntity> clazz,
            Object... attributesArgs) throws CinemaPersistenceException;

//    @SuppressWarnings(value = {"rawtypes"})
    public IEntity find(Class<IEntity> clazz, Serializable primaryKey)
            throws CinemaPersistenceException;

    public Serializable save(IEntity entity) throws CinemaPersistenceException;

    public IEntity update(IEntity entity) throws CinemaPersistenceException;
}