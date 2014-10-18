/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Tests
 */
@Embeddable
public class BillboardPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "FILM_TITLE")
    private String filmTitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FILM_RELEASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date filmReleaseDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "THEATER_CITY")
    private String theaterCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "THEATER")
    private String theater;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "VIDEO_FORMAT_DIMENSION")
    private String videoFormatDimension;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "VIDEO_FORMAT_MEAN")
    private String videoFormatMean;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "AUDIO_LANGUAGE")
    private String audioLanguage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "SUBTITLE_LANGUAGE")
    private String subtitleLanguage;

    public BillboardPK() {
    }

    public BillboardPK(String filmTitle, Date filmReleaseDate, String theaterCity, String theater, String videoFormatDimension, String videoFormatMean, String audioLanguage, String subtitleLanguage) {
        this.filmTitle = filmTitle;
        this.filmReleaseDate = filmReleaseDate;
        this.theaterCity = theaterCity;
        this.theater = theater;
        this.videoFormatDimension = videoFormatDimension;
        this.videoFormatMean = videoFormatMean;
        this.audioLanguage = audioLanguage;
        this.subtitleLanguage = subtitleLanguage;
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

    public String getVideoFormatDimension() {
        return videoFormatDimension;
    }

    public void setVideoFormatDimension(String videoFormatDimension) {
        this.videoFormatDimension = videoFormatDimension;
    }

    public String getVideoFormatMean() {
        return videoFormatMean;
    }

    public void setVideoFormatMean(String videoFormatMean) {
        this.videoFormatMean = videoFormatMean;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmTitle != null ? filmTitle.hashCode() : 0);
        hash += (filmReleaseDate != null ? filmReleaseDate.hashCode() : 0);
        hash += (theaterCity != null ? theaterCity.hashCode() : 0);
        hash += (theater != null ? theater.hashCode() : 0);
        hash += (videoFormatDimension != null ? videoFormatDimension.hashCode() : 0);
        hash += (videoFormatMean != null ? videoFormatMean.hashCode() : 0);
        hash += (audioLanguage != null ? audioLanguage.hashCode() : 0);
        hash += (subtitleLanguage != null ? subtitleLanguage.hashCode() : 0);
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
        if ((this.videoFormatDimension == null && other.videoFormatDimension != null) || (this.videoFormatDimension != null && !this.videoFormatDimension.equals(other.videoFormatDimension))) {
            return false;
        }
        if ((this.videoFormatMean == null && other.videoFormatMean != null) || (this.videoFormatMean != null && !this.videoFormatMean.equals(other.videoFormatMean))) {
            return false;
        }
        if ((this.audioLanguage == null && other.audioLanguage != null) || (this.audioLanguage != null && !this.audioLanguage.equals(other.audioLanguage))) {
            return false;
        }
        if ((this.subtitleLanguage == null && other.subtitleLanguage != null) || (this.subtitleLanguage != null && !this.subtitleLanguage.equals(other.subtitleLanguage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.labuno.model.entity.BillboardPK[ filmTitle=" + filmTitle + ", filmReleaseDate=" + filmReleaseDate + ", theaterCity=" + theaterCity + ", theater=" + theater + ", videoFormatDimension=" + videoFormatDimension + ", videoFormatMean=" + videoFormatMean + ", audioLanguage=" + audioLanguage + ", subtitleLanguage=" + subtitleLanguage + " ]";
    }
    
}
