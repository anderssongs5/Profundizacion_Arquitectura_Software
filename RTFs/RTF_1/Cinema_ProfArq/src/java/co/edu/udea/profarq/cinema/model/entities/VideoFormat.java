package co.edu.udea.profarq.cinema.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Entity()
@Table(name = "video_format")
@XmlRootElement()
@NamedQueries({
    @NamedQuery(name = "VideoFormat.findAll",
            query = "SELECT v FROM VideoFormat v"),
    @NamedQuery(name = "VideoFormat.findByVideoFormat",
            query = "SELECT v FROM VideoFormat v WHERE v.videoFormat = :videoFormat"),
    @NamedQuery(name = "VideoFormat.findByDescription",
            query = "SELECT v FROM VideoFormat v WHERE v.description = :description")})
public class VideoFormat implements IEntity, Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "video_format")
    private String videoFormat;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "videoFormat1")
    private List<Billboard> billboardList;

    public VideoFormat() {
    }

    public VideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    public String getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
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

    @Override()
    public Serializable getPrimaryKey() {

        return (this.getVideoFormat());
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (videoFormat != null ? videoFormat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VideoFormat)) {
            return false;
        }
        VideoFormat other = (VideoFormat) object;
        if ((this.videoFormat == null && other.videoFormat != null) || (this.videoFormat != null && !this.videoFormat.equals(other.videoFormat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.cinema.model.entities.VideoFormat[ videoFormat=" + videoFormat + " ]";
    }
}
