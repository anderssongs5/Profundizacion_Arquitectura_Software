package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.VideoFormat;
import co.edu.udea.profarq.cinema.persistence.dao.IVideoFormatDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class VideoFormatManagerBean implements Serializable {

    private static final long serialVersionUID = 5745425374594567736L;

    private IVideoFormatDAO videoFormatDAO;

    public VideoFormatManagerBean() {
        super();
    }

    public IVideoFormatDAO getVideoFormatDAO() {

        return (this.videoFormatDAO);
    }

    public void setVideoFormatDAO(IVideoFormatDAO videoFormatDAO) {
        this.videoFormatDAO = videoFormatDAO;
    }

    public List<VideoFormat> findAll() throws CinemaBusinessException {
        try {

            return (this.getVideoFormatDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}