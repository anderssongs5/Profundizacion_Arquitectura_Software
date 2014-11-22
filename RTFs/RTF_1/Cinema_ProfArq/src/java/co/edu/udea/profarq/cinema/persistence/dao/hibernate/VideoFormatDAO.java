package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.VideoFormat;
import co.edu.udea.profarq.cinema.persistence.dao.IVideoFormatDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class VideoFormatDAO extends AbstractEntityDAO
        implements IVideoFormatDAO {

    @Override()
    public List<VideoFormat> findAll() throws CinemaPersistenceException {
        List<VideoFormat> videoFormatsList = new ArrayList<>();

        return (videoFormatsList);
    }
}
