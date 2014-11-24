package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.VideoFormatManagerBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class VideoFormatManagedBean implements Serializable {

    private static final long serialVersionUID = -6496448230256742707L;

    private VideoFormatManagerBean videoFormatManagerSessionBean;
    private SelectItem[] videoFormatsSelectItems;

    public VideoFormatManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
//        List<VideoFormat> videoFormatsList = this.videoFormatManagerSessionBean.
//                findAll();
//        SelectItem[] selectItems = null;
//
//        if ((videoFormatsList != null) && (!videoFormatsList.isEmpty())) {
//            selectItems = new SelectItem[videoFormatsList.size()];
//
//            for (int position = 0; position < videoFormatsList.size(); position++) {
//                VideoFormat videoFormat = videoFormatsList.get(position);
//                selectItems[position] = new SelectItem(
//                        videoFormat.getVideoFormat(),
//                        videoFormat.getVideoFormat());
//            }
//        }
//
//        this.setVideoFormatsSelectItems(selectItems);
    }

    public VideoFormatManagerBean getVideoFormatManagerSessionBean() {

        return (this.videoFormatManagerSessionBean);
    }

    public void setVideoFormatManagerSessionBean(
            VideoFormatManagerBean videoFormatManagerSessionBean) {
        this.videoFormatManagerSessionBean = videoFormatManagerSessionBean;
    }

    public SelectItem[] getVideoFormatsSelectItems() {

        return (this.videoFormatsSelectItems);
    }

    public void setVideoFormatsSelectItems(SelectItem[] videoFormatsSelectItems) {
        this.videoFormatsSelectItems = videoFormatsSelectItems;
    }
}