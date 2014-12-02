package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Classification;
import co.edu.udea.profarq.cinema.persistence.dao.IClassificationDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ClassificationManagerBean implements Serializable {

    private static final long serialVersionUID = 3675956314327809398L;

    private IClassificationDAO classificationDAO;

    public ClassificationManagerBean() {
        super();
    }

    public IClassificationDAO getClassificationDAO() {

        return (this.classificationDAO);
    }

    public void setClassificationDAO(IClassificationDAO classificationDAO) {
        this.classificationDAO = classificationDAO;
    }

    public List<Classification> findAll() throws CinemaBusinessException {
        try {

            return (this.getClassificationDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}