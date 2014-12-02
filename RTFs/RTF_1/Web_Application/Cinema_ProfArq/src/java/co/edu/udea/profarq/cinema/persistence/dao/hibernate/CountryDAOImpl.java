package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.Country;
import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.dao.ICountryDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CountryDAOImpl extends AbstractEntityDAO implements ICountryDAO {

    public CountryDAOImpl() {
        super();
    }

    @Override()
    public List<Country> findAll() throws CinemaPersistenceException {
        List<Country> countriesList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Country.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                countriesList.add((Country) entity);
            }
        }

        return (countriesList);
    }
}
