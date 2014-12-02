package co.edu.udea.profarq.cinema.model.entities;

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

    private static final long serialVersionUID = -2752664990515277338L;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 150)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull()
    @Column(name = "release_date")
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmPK)) {

            return (false);
        }

        FilmPK other = (FilmPK) object;
        if (((this.getTitle() == null) && (other.getTitle() != null))
                || ((this.getTitle() != null)
                && !(this.getTitle().equals(other.getTitle())))) {

            return (false);
        }

        if (((this.getReleaseDate() == null) && (other.getReleaseDate() != null))
                || ((this.getReleaseDate() != null)
                && !(this.getReleaseDate().equals(other.getReleaseDate())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.cinema.model.entities.FilmPK[ title="
                + this.getTitle() + ", releaseDate=" + this.getReleaseDate()
                + " ]");
    }
}