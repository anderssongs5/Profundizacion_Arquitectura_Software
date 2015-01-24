/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.profarq.labcinco.dao.hibernate.impl;

import co.edu.udea.profarq.labcinco.dao.exception.LabCincoProfArqDAOException;
import co.edu.udea.profarq.labcinco.dao.hibernate.HibernateUtil;
import co.edu.udea.profarq.labcinco.dto.IEntityContext;
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
            throws LabCincoProfArqDAOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(entityContext);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

            throw new LabCincoProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s", "Delete",
                    entityContext.getClass().getSimpleName()), ex);
        }

        return (entityContext.getPrimaryKey());
    }

    public IEntityContext find(Class<? extends IEntityContext> c,
            Serializable primaryKey) throws LabCincoProfArqDAOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        IEntityContext entityContext = null;
        Session session;

        try {
            session = sessionFactory.openSession();
            entityContext = (IEntityContext) session.get(c, primaryKey);
            session.close();
        } catch (Exception ex) {
            throw new LabCincoProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s", "Find",
                    c.getSimpleName()), ex);
        }

        return (entityContext);
    }

    @SuppressWarnings(value = {"unchecked"})
    public List<IEntityContext> findAll(Class<? extends IEntityContext> c)
            throws LabCincoProfArqDAOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        List<IEntityContext> entitesContextFoundList = new ArrayList<>();

        Criteria criteria;
        Session session;

        try {
            session = sessionFactory.openSession();
            criteria = session.createCriteria(c);
            entitesContextFoundList = criteria.list();
            session.close();
        } catch (Exception ex) {
            throw new LabCincoProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s",
                    "Find All", c.getSimpleName()), ex);
        }

        return (entitesContextFoundList);
    }

    public Serializable save(IEntityContext entityContext)
            throws LabCincoProfArqDAOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Serializable primaryKey = null;
        Session session;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            primaryKey = session.save(entityContext);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

            throw new LabCincoProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s", "Save",
                    entityContext.getClass().getSimpleName()), ex);
        }

        return (primaryKey);
    }

    public Serializable update(IEntityContext entityContext)
            throws LabCincoProfArqDAOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(entityContext);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

            throw new LabCincoProfArqDAOException(String.format(
                    "Error during procedure's \"%s\" for class: %s", "Update",
                    entityContext.getClass().getSimpleName()), ex);
        }

        return (entityContext.getPrimaryKey());
    }
}
