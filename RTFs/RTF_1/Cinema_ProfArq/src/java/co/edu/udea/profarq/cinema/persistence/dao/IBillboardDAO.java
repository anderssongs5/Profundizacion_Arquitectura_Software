package co.edu.udea.profarq.cinema.persistence.dao;

import co.edu.udea.profarq.cinema.model.entities.Billboard;
import co.edu.udea.profarq.cinema.model.entities.Film;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IBillboardDAO {

    public List<Billboard> findAll() throws CinemaPersistenceException;

    public List<Billboard> findByFilm(Film film)
            throws CinemaPersistenceException;

    public Serializable save(Billboard billboard)
            throws CinemaPersistenceException;

    public Billboard update(Billboard billboard)
            throws CinemaPersistenceException;
}
