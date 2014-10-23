package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Entity
@Table(name = "VIDEO_FORMAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VideoFormat.findAll",
            query = "SELECT v FROM VideoFormat v"),
    @NamedQuery(name = "VideoFormat.findByDimension",
            query = "SELECT v FROM VideoFormat v WHERE v.videoFormatPK.dimension = :dimension"),
    @NamedQuery(name = "VideoFormat.findByMean",
            query = "SELECT v FROM VideoFormat v WHERE v.videoFormatPK.mean = :mean"),
    @NamedQuery(name = "VideoFormat.findByDescription",
            query = "SELECT v FROM VideoFormat v WHERE v.description = :description")})
public class VideoFormat implements Serializable {

    private static final long serialVersionUID = 7164537914360909408L;

    @EmbeddedId()
    protected VideoFormatPK videoFormatPK;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "videoFormat")
    private List<Billboard> billboardList;

    public VideoFormat() {
    }

    public VideoFormat(VideoFormatPK videoFormatPK) {
        this.videoFormatPK = videoFormatPK;
    }

    public VideoFormat(String dimension, String mean) {
        this.videoFormatPK = new VideoFormatPK(dimension, mean);
    }

    public VideoFormatPK getVideoFormatPK() {
        return videoFormatPK;
    }

    public void setVideoFormatPK(VideoFormatPK videoFormatPK) {
        this.videoFormatPK = videoFormatPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<Billboard> getBillboardList() {
        return billboardList;
    }

    public void setBillboardList(List<Billboard> billboardList) {
        this.billboardList = billboardList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (videoFormatPK != null ? videoFormatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VideoFormat)) {
            return false;
        }
        VideoFormat other = (VideoFormat) object;
        if ((this.videoFormatPK == null && other.videoFormatPK != null) || (this.videoFormatPK != null && !this.videoFormatPK.equals(other.videoFormatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.labuno.model.entity.VideoFormat[ videoFormatPK=" + videoFormatPK + " ]";
    }

}
