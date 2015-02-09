package co.edu.udea.profarq.labseis.dao.hibernate.impl;

import co.edu.udea.profarq.labseis.dao.exception.LabSeisProfArqDAOException;
import co.edu.udea.profarq.labseis.dao.hibernate.HibernateUtil;
import co.edu.udea.profarq.labseis.dto.IEntityContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
abstract class AbstractEntityDAO {

    public AbstractEntityDAO() {
        super();
    }

    public Serializable delete(IEntityContext entityContext)
            throws LabSeisProfArqDAOException {
        Session session;
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(entityContext);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

            throw new LabSeisProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s", "Delete",
                    entityContext.getClass().getSimpleName()), ex);
        }

        return (entityContext.getPrimaryKey());
    }

    public IEntityContext find(Class<? extends IEntityContext> c,
            Serializable primaryKey) throws LabSeisProfArqDAOException {
        IEntityContext entityContext = null;
        Session session;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            entityContext = (IEntityContext) session.get(c, primaryKey);
            session.close();
        } catch (Exception ex) {
            throw new LabSeisProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s", "Find",
                    c.getSimpleName()), ex);
        }

        return (entityContext);
    }

    @SuppressWarnings(value = {"unchecked"})
    public List<IEntityContext> findAll(Class<? extends IEntityContext> c)
            throws LabSeisProfArqDAOException {
        List<IEntityContext> entitesContextFoundList = new ArrayList<>();

        Criteria criteria;
        Session session;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            criteria = session.createCriteria(c);
            entitesContextFoundList = criteria.list();
            session.close();
        } catch (Exception ex) {
            throw new LabSeisProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s",
                    "Find All", c.getSimpleName()), ex);
        }

        return (entitesContextFoundList);
    }

    public Serializable save(IEntityContext entityContext)
            throws LabSeisProfArqDAOException {
        Serializable primaryKey = null;
        Session session;
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            primaryKey = session.save(entityContext);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

            throw new LabSeisProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s", "Save",
                    entityContext.getClass().getSimpleName()), ex);
        }

        return (primaryKey);
    }

    public Serializable update(IEntityContext entityContext)
            throws LabSeisProfArqDAOException {
        Session session;
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(entityContext);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

            throw new LabSeisProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s", "Update",
                    entityContext.getClass().getSimpleName()), ex);
        }

        return (entityContext.getPrimaryKey());
    }
}