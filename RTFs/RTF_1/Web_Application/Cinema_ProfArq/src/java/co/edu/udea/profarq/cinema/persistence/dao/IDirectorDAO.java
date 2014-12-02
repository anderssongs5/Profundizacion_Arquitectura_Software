package co.edu.udea.profarq.cinema.persistence.dao;

import co.edu.udea.profarq.cinema.model.entities.Director;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IDirectorDAO {

    public List<Director> findAll() throws CinemaPersistenceException;

    public Director find(String directorPK) throws CinemaPersistenceException;

    public String save(Director director) throws CinemaPersistenceException;
}