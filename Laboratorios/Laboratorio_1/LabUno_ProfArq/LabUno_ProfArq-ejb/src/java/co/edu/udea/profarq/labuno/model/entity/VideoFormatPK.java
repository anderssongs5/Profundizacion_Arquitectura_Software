package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Embeddable()
public class VideoFormatPK implements Serializable {

    private static final long serialVersionUID = -3580535537158550469L;

    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 2)
    @Column(name = "DIMENSION")
    private String dimension;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 15)
    @Column(name = "MEAN")
    private String mean;

    public VideoFormatPK() {
        super();
    }

    public VideoFormatPK(String dimension, String mean) {
        this.dimension = dimension;
        this.mean = mean;
    }

    public String getDimension() {

        return (this.dimension);
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getMean() {

        return (this.mean);
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getDimension() != null)
                ? this.getDimension().hashCode() : 0);
        hash += ((this.getMean() != null) ? this.getMean().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof VideoFormatPK)) {

            return (false);
        }

        VideoFormatPK other = (VideoFormatPK) object;
        if (((this.getDimension() == null) && (other.getDimension() != null))
                || ((this.getDimension() != null)
                && !(this.getDimension().equals(other.getDimension())))) {

            return (false);
        }

        if (((this.getMean() == null) && (other.getMean() != null))
                || ((this.getMean() != null)
                && !(this.getMean().equals(other.getMean())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.VideoFormatPK[ dimension="
                + this.dimension + ", mean=" + this.mean + " ]");
    }
}
