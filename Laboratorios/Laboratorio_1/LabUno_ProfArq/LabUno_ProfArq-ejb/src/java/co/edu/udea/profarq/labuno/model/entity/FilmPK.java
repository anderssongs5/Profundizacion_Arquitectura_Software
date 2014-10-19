package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Embeddable()
public class FilmPK implements Serializable {

    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 150)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @NotNull()
    @Column(name = "RELEASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    public FilmPK() {
        super();
    }

    public FilmPK(String title, Date releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {

        return (this.title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {

        return (this.releaseDate);
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getTitle() != null) ? this.getTitle().hashCode() : 0);
        hash += ((this.getReleaseDate() != null)
                ? this.getReleaseDate().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof FilmPK)) {

            return (false);
        }

        FilmPK other = (FilmPK) object;
        if (((this.getTitle() == null) && (other.getTitle() != null))
                || ((this.getTitle() != null)
                && !(this.getTitle().equals(other.getTitle())))) {

            return (false);
        }

        if (((this.getReleaseDate() == null)
                && (other.getReleaseDate() != null))
                || ((this.getReleaseDate() != null)
                && !(this.getReleaseDate().equals(other.getReleaseDate())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.FilmPK[ title="
                + this.title + ", releaseDate=" + this.releaseDate + " ]");
    }
}
