package co.edu.udea.profarq.cinema.persistence.dao.hibernate;

import co.edu.udea.profarq.cinema.model.entities.IEntity;
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
public class VideoFormatDAOImpl extends AbstractEntityDAO
        implements IVideoFormatDAO {

    public VideoFormatDAOImpl() {
        super();
    }

    @Override()
    public List<VideoFormat> findAll() throws CinemaPersistenceException {
        List<VideoFormat> videoFormatsList = new ArrayList<>();
        List<IEntity> entitiesList = super.findAll(VideoFormat.class);

        if ((entitiesList != null) && (!entitiesList.isEmpty())) {
            for (IEntity entity : entitiesList) {
                videoFormatsList.add((VideoFormat) entity);
            }
        }

        return (videoFormatsList);
    }
}
