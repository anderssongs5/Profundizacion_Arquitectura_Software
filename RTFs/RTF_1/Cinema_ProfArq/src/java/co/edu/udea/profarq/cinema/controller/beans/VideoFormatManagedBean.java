package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.VideoFormatManagerBean;
import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.VideoFormat;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class VideoFormatManagedBean implements Serializable {

    private static final long serialVersionUID = -6496448230256742707L;

    private VideoFormatManagerBean videoFormatManagerBean;
    private SelectItem[] videoFormatsSelectItems;

    public VideoFormatManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<VideoFormat> videoFormatsList;
        SelectItem[] selectItems = null;

        try {
            videoFormatsList = this.videoFormatManagerBean.
                    findAll();
        } catch (CinemaBusinessException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                            "Video Format Error", e.getMessage()));

            this.setVideoFormatsSelectItems(selectItems);

            return;
        }

        if ((videoFormatsList != null) && (!videoFormatsList.isEmpty())) {
            selectItems = new SelectItem[videoFormatsList.size()];

            for (int position = 0; position < videoFormatsList.size(); position++) {
                VideoFormat videoFormat = videoFormatsList.get(position);
                selectItems[position] = new SelectItem(
                        videoFormat.getVideoFormat(),
                        videoFormat.getVideoFormat());
            }
        }

        this.setVideoFormatsSelectItems(selectItems);
    }

    public VideoFormatManagerBean getVideoFormatManagerBean() {

        return (this.videoFormatManagerBean);
    }

    public void setVideoFormatManagerBean(
            VideoFormatManagerBean videoFormatManagerBean) {
        this.videoFormatManagerBean = videoFormatManagerBean;
    }

    public SelectItem[] getVideoFormatsSelectItems() {

        return (this.videoFormatsSelectItems);
    }

    public void setVideoFormatsSelectItems(SelectItem[] videoFormatsSelectItems) {
        this.videoFormatsSelectItems = videoFormatsSelectItems;
    }
}
