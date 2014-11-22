package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.Film;
import co.edu.udea.profarq.cinema.model.entities.FilmPK;
import co.edu.udea.profarq.cinema.model.entities.IEntity;
import co.edu.udea.profarq.cinema.persistence.dao.IFilmDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class FilmDAOImpl extends AbstractEntityDAO implements IFilmDAO {

    public FilmDAOImpl() {
        super();
    }

    @Override()
    public Film delete(Film film) throws CinemaPersistenceException {
        IEntity entity = super.delete(film);

        return ((entity != null) ? (Film) entity : null);
    }

    @Override()
    public List<Film> findAll() throws CinemaPersistenceException {
        List<Film> filmsList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(Film.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                filmsList.add((Film) entity);
            }
        }

        return (filmsList);
    }

    @Override()
    public FilmPK save(Film film) throws CinemaPersistenceException {
        Serializable filmPK = super.save(film);

        return ((filmPK != null) ? (FilmPK) filmPK : null);
    }

    @Override
    public Film find(FilmPK film) throws CinemaPersistenceException {

        IEntity filmFound = super.find(Film.class, film);

        return ((film != null) ? (Film) filmFound : null);
    }
}
