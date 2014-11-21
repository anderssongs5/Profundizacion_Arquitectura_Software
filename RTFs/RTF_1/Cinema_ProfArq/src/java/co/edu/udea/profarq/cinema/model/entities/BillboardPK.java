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
@Embeddable
public class BillboardPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "film_title")
    private String filmTitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "film_release_date")
    @Temporal(TemporalType.DATE)
    private Date filmReleaseDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "theater_city")
    private String theaterCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "theater")
    private String theater;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "audio_language")
    private String audioLanguage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "subtitle_language")
    private String subtitleLanguage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "video_format")
    private String videoFormat;

    public BillboardPK() {
    }

    public BillboardPK(String filmTitle, Date filmReleaseDate, String theaterCity, String theater, String audioLanguage, String subtitleLanguage, String videoFormat) {
        this.filmTitle = filmTitle;
        this.filmReleaseDate = filmReleaseDate;
        this.theaterCity = theaterCity;
        this.theater = theater;
        this.audioLanguage = audioLanguage;
        this.subtitleLanguage = subtitleLanguage;
        this.videoFormat = videoFormat;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public Date getFilmReleaseDate() {
        return filmReleaseDate;
    }

    public void setFilmReleaseDate(Date filmReleaseDate) {
        this.filmReleaseDate = filmReleaseDate;
    }

    public String getTheaterCity() {
        return theaterCity;
    }

    public void setTheaterCity(String theaterCity) {
        this.theaterCity = theaterCity;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public String getAudioLanguage() {
        return audioLanguage;
    }

    public void setAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
    }

    public String getSubtitleLanguage() {
        return subtitleLanguage;
    }

    public void setSubtitleLanguage(String subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }

    public String getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmTitle != null ? filmTitle.hashCode() : 0);
        hash += (filmReleaseDate != null ? filmReleaseDate.hashCode() : 0);
        hash += (theaterCity != null ? theaterCity.hashCode() : 0);
        hash += (theater != null ? theater.hashCode() : 0);
        hash += (audioLanguage != null ? audioLanguage.hashCode() : 0);
        hash += (subtitleLanguage != null ? subtitleLanguage.hashCode() : 0);
        hash += (videoFormat != null ? videoFormat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BillboardPK)) {
            return false;
        }
        BillboardPK other = (BillboardPK) object;
        if ((this.filmTitle == null && other.filmTitle != null) || (this.filmTitle != null && !this.filmTitle.equals(other.filmTitle))) {
            return false;
        }
        if ((this.filmReleaseDate == null && other.filmReleaseDate != null) || (this.filmReleaseDate != null && !this.filmReleaseDate.equals(other.filmReleaseDate))) {
            return false;
        }
        if ((this.theaterCity == null && other.theaterCity != null) || (this.theaterCity != null && !this.theaterCity.equals(other.theaterCity))) {
            return false;
        }
        if ((this.theater == null && other.theater != null) || (this.theater != null && !this.theater.equals(other.theater))) {
            return false;
        }
        if ((this.audioLanguage == null && other.audioLanguage != null) || (this.audioLanguage != null && !this.audioLanguage.equals(other.audioLanguage))) {
            return false;
        }
        if ((this.subtitleLanguage == null && other.subtitleLanguage != null) || (this.subtitleLanguage != null && !this.subtitleLanguage.equals(other.subtitleLanguage))) {
            return false;
        }
        if ((this.videoFormat == null && other.videoFormat != null) || (this.videoFormat != null && !this.videoFormat.equals(other.videoFormat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.cinema.model.entities.BillboardPK[ filmTitle=" + filmTitle + ", filmReleaseDate=" + filmReleaseDate + ", theaterCity=" + theaterCity + ", theater=" + theater + ", audioLanguage=" + audioLanguage + ", subtitleLanguage=" + subtitleLanguage + ", videoFormat=" + videoFormat + " ]";
    }
    
}
