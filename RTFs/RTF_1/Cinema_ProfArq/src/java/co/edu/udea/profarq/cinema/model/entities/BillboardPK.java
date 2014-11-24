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
public class BillboardPK implements Serializable {

    private static final long serialVersionUID = 7102874025440721171L;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 150)
    @Column(name = "film_title")
    private String filmTitle;
    @Basic(optional = false)
    @NotNull()
    @Column(name = "film_release_date")
    @Temporal(TemporalType.DATE)
    private Date filmReleaseDate;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 5)
    @Column(name = "theater_city")
    private String theaterCity;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 55)
    @Column(name = "theater")
    private String theater;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 3)
    @Column(name = "audio_language")
    private String audioLanguage;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 3)
    @Column(name = "subtitle_language")
    private String subtitleLanguage;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 20)
    @Column(name = "video_format")
    private String videoFormat;

    public BillboardPK() {
        super();
    }

    public BillboardPK(String filmTitle, Date filmReleaseDate,
            String theaterCity, String theater, String audioLanguage,
            String subtitleLanguage, String videoFormat) {
        this.filmTitle = filmTitle;
        this.filmReleaseDate = filmReleaseDate;
        this.theaterCity = theaterCity;
        this.theater = theater;
        this.audioLanguage = audioLanguage;
        this.subtitleLanguage = subtitleLanguage;
        this.videoFormat = videoFormat;
    }

    public String getFilmTitle() {

        return (this.filmTitle);
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public Date getFilmReleaseDate() {

        return (this.filmReleaseDate);
    }

    public void setFilmReleaseDate(Date filmReleaseDate) {
        this.filmReleaseDate = filmReleaseDate;
    }

    public String getTheaterCity() {

        return (this.theaterCity);
    }

    public void setTheaterCity(String theaterCity) {
        this.theaterCity = theaterCity;
    }

    public String getTheater() {

        return (this.theater);
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public String getAudioLanguage() {

        return (this.audioLanguage);
    }

    public void setAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
    }

    public String getSubtitleLanguage() {

        return (this.subtitleLanguage);
    }

    public void setSubtitleLanguage(String subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }

    public String getVideoFormat() {

        return (this.videoFormat);
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getFilmTitle() != null)
                ? this.getFilmTitle().hashCode() : 0);
        hash += ((this.getFilmReleaseDate() != null)
                ? this.getFilmReleaseDate().hashCode() : 0);
        hash += ((this.getTheaterCity() != null)
                ? this.getTheaterCity().hashCode() : 0);
        hash += ((this.getTheater() != null)
                ? this.getTheater().hashCode() : 0);
        hash += ((this.getAudioLanguage() != null)
                ? this.getAudioLanguage().hashCode() : 0);
        hash += ((this.getSubtitleLanguage() != null)
                ? this.getSubtitleLanguage().hashCode() : 0);
        hash += ((this.getVideoFormat() != null)
                ? this.getVideoFormat().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BillboardPK)) {

            return (false);
        }

        BillboardPK other = (BillboardPK) object;
        if (((this.getFilmTitle() == null) && (other.getFilmTitle() != null))
                || ((this.getFilmTitle() != null)
                && !(this.getFilmTitle().equals(other.getFilmTitle())))) {

            return (false);
        }

        if (((this.getFilmReleaseDate() == null)
                && (other.getFilmReleaseDate() != null))
                || ((this.getFilmReleaseDate() != null)
                && !(this.getFilmReleaseDate().equals(other.getFilmReleaseDate())))) {

            return (false);
        }

        if (((this.getTheaterCity() == null) && (other.getTheaterCity() != null))
                || ((this.getTheaterCity() != null)
                && !(this.getTheaterCity().equals(other.getTheaterCity())))) {

            return (false);
        }

        if (((this.getTheater() == null) && (other.getTheater() != null))
                || ((this.getTheater() != null)
                && !(this.getTheater().equals(other.getTheater())))) {

            return (false);
        }

        if (((this.getAudioLanguage() == null)
                && (other.getAudioLanguage() != null))
                || ((this.getAudioLanguage() != null)
                && !(this.getAudioLanguage().equals(other.getAudioLanguage())))) {

            return (false);
        }

        if (((this.getSubtitleLanguage() == null)
                && (other.getSubtitleLanguage() != null))
                || ((this.getSubtitleLanguage() != null)
                && !(this.getSubtitleLanguage().equals(other.getSubtitleLanguage())))) {

            return (false);
        }

        if (((this.getVideoFormat() == null) && (other.getVideoFormat() != null))
                || ((this.getVideoFormat() != null)
                && !(this.getVideoFormat().equals(other.getVideoFormat())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.cinema.model.entities.BillboardPK[ filmTitle="
                + this.getFilmTitle() + ", filmReleaseDate="
                + this.getFilmReleaseDate() + ", theaterCity="
                + this.getTheaterCity() + ", theater=" + this.getTheater()
                + ", audioLanguage=" + this.getAudioLanguage()
                + ", subtitleLanguage=" + this.getSubtitleLanguage()
                + ", videoFormat=" + this.getVideoFormat() + " ]");
    }
}