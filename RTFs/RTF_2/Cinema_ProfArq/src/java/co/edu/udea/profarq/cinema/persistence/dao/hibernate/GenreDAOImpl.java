package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.Genre;
import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.dao.IGenreDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class GenreDAOImpl extends AbstractEntityDAO implements IGenreDAO {

    public GenreDAOImpl() {
        super();
    }

    @Override()
    public List<Genre> findAll() throws CinemaPersistenceException {
        List<Genre> genresList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Genre.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                genresList.add((Genre) entity);
            }
        }

        return (genresList);
    }
}
