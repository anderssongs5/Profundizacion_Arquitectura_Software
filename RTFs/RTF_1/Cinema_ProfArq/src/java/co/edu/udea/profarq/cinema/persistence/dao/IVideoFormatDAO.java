package co.edu.udea.profarq.cinema.persistence.dao;

import co.edu.udea.profarq.cinema.model.entities.VideoFormat;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IVideoFormatDAO {

    public List<VideoFormat> findAll() throws CinemaPersistenceException;
}
