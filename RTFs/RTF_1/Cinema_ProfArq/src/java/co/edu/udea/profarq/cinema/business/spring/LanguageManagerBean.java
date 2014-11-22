package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Languages;
import co.edu.udea.profarq.cinema.persistence.dao.ILanguageDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class LanguageManagerBean implements Serializable {

    private static final long serialVersionUID = 1601836894834404981L;

    private ILanguageDAO languageDAO;

    public LanguageManagerBean() {
        super();
    }

    public ILanguageDAO getLanguageDAO() {

        return languageDAO;
    }

    public void setLanguageDAO(ILanguageDAO languageDAO) {
        this.languageDAO = languageDAO;
    }

    public List<Languages> findAll() throws CinemaBusinessException {
        try {

            return (this.getLanguageDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}
