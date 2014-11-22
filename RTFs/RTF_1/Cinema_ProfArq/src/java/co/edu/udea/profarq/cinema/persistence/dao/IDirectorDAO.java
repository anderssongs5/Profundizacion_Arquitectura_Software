package co.edu.udea.profarq.cinema.persistence.dao;

import co.edu.udea.profarq.cinema.model.entities.Billboard;
import co.edu.udea.profarq.cinema.model.entities.Director;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IDirectorDAO {

    public List<Billboard> findAll() throws CinemaPersistenceException;

    public Director find(Serializable directorPK)
            throws CinemaPersistenceException;

    public Director save(Director director) throws CinemaPersistenceException;
}
