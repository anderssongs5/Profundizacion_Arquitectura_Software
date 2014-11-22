package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.model.entities.Languages;
import co.edu.udea.profarq.cinema.persistence.dao.ILanguageDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class LanguageDAOImpl extends AbstractEntityDAO implements ILanguageDAO {

    public LanguageDAOImpl() {
        super();
    }

    @Override()
    public List<Languages> findAll() throws CinemaPersistenceException {
        List<Languages> languaguesList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Languages.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                languaguesList.add((Languages) entity);
            }
        }

        return (languaguesList);
    }
}
