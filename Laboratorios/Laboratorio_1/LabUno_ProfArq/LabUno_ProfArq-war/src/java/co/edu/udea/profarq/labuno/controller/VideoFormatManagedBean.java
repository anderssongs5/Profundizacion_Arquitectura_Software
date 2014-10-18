package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.VideoFormatManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.VideoFormat;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class VideoFormatManagedBean {

    @EJB()
    private VideoFormatManagerSessionBean videoFormatManagerSessionBean;
    private SelectItem[] videoFormatSelectItems;

    public VideoFormatManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<VideoFormat> videoFormatsList = this.videoFormatManagerSessionBean.
                findAll();
        SelectItem[] selectItems = null;

        if ((videoFormatsList != null) && (!videoFormatsList.isEmpty())) {
            selectItems = new SelectItem[videoFormatsList.size()];

            for (int position = 0; position < videoFormatsList.size(); position++) {
                VideoFormat videoFormat = videoFormatsList.get(position);
                selectItems[position] = new SelectItem(videoFormat,
                        String.format("%s %s",
                                videoFormat.getVideoFormatPK().getDimension(),
                                videoFormat.getVideoFormatPK().getMean()));
            }
        }

        this.setVideoFormatSelectItems(selectItems);
    }

    public SelectItem[] getVideoFormatSelectItems() {

        return videoFormatSelectItems;
    }

    public void setVideoFormatSelectItems(SelectItem[] videoFormatSelectItems) {
        this.videoFormatSelectItems = videoFormatSelectItems;
    }

}
