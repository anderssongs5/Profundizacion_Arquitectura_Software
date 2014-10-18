/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tests
 */
@Entity
@Table(name = "BILLBOARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billboard.findAll", query = "SELECT b FROM Billboard b"),
    @NamedQuery(name = "Billboard.findByFilmTitle", query = "SELECT b FROM Billboard b WHERE b.billboardPK.filmTitle = :filmTitle"),
    @NamedQuery(name = "Billboard.findByFilmReleaseDate", query = "SELECT b FROM Billboard b WHERE b.billboardPK.filmReleaseDate = :filmReleaseDate"),
    @NamedQuery(name = "Billboard.findByTheaterCity", query = "SELECT b FROM Billboard b WHERE b.billboardPK.theaterCity = :theaterCity"),
    @NamedQuery(name = "Billboard.findByTheater", query = "SELECT b FROM Billboard b WHERE b.billboardPK.theater = :theater"),
    @NamedQuery(name = "Billboard.findByVideoFormatDimension", query = "SELECT b FROM Billboard b WHERE b.billboardPK.videoFormatDimension = :videoFormatDimension"),
    @NamedQuery(name = "Billboard.findByVideoFormatMean", query = "SELECT b FROM Billboard b WHERE b.billboardPK.videoFormatMean = :videoFormatMean"),
    @NamedQuery(name = "Billboard.findByAudioLanguage", query = "SELECT b FROM Billboard b WHERE b.billboardPK.audioLanguage = :audioLanguage"),
    @NamedQuery(name = "Billboard.findBySubtitleLanguage", query = "SELECT b FROM Billboard b WHERE b.billboardPK.subtitleLanguage = :subtitleLanguage"),
    @NamedQuery(name = "Billboard.findByOutDate", query = "SELECT b FROM Billboard b WHERE b.outDate = :outDate")})
public class Billboard implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BillboardPK billboardPK;
    @Column(name = "OUT_DATE")
    @Temporal(TemporalType.DATE)
    private Date outDate;
    @JoinColumns({
        @JoinColumn(name = "VIDEO_FORMAT_DIMENSION", referencedColumnName = "DIMENSION", insertable = false, updatable = false),
        @JoinColumn(name = "VIDEO_FORMAT_MEAN", referencedColumnName = "MEAN", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private VideoFormat videoFormat;
    @JoinColumns({
        @JoinColumn(name = "THEATER_CITY", referencedColumnName = "CITY_CODE", insertable = false, updatable = false),
        @JoinColumn(name = "THEATER", referencedColumnName = "THEATER", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Theater theater1;
    @JoinColumn(name = "STATUS", referencedColumnName = "STATUS")
    @ManyToOne(optional = false)
    private Status status;
    @JoinColumns({
        @JoinColumn(name = "FILM_TITLE", referencedColumnName = "TITLE", insertable = false, updatable = false),
        @JoinColumn(name = "FILM_RELEASE_DATE", referencedColumnName = "RELEASE_DATE", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Film film;
    @JoinColumns({
        @JoinColumn(name = "AUDIO_LANGUAGE", referencedColumnName = "AUDIO_LANGUAGE", insertable = false, updatable = false),
        @JoinColumn(name = "SUBTITLE_LANGUAGE", referencedColumnName = "SUBTITLE_LANGUAGE", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AudioFormat audioFormat;

    public Billboard() {
    }

    public Billboard(BillboardPK billboardPK) {
        this.billboardPK = billboardPK;
    }

    public Billboard(String filmTitle, Date filmReleaseDate, String theaterCity, String theater, String videoFormatDimension, String videoFormatMean, String audioLanguage, String subtitleLanguage) {
        this.billboardPK = new BillboardPK(filmTitle, filmReleaseDate, theaterCity, theater, videoFormatDimension, videoFormatMean, audioLanguage, subtitleLanguage);
    }

    public BillboardPK getBillboardPK() {
        return billboardPK;
    }

    public void setBillboardPK(BillboardPK billboardPK) {
        this.billboardPK = billboardPK;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public VideoFormat getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(VideoFormat videoFormat) {
        this.videoFormat = videoFormat;
    }

    public Theater getTheater1() {
        return theater1;
    }

    public void setTheater1(Theater theater1) {
        this.theater1 = theater1;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormat audioFormat) {
        this.audioFormat = audioFormat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billboardPK != null ? billboardPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Billboard)) {
            return false;
        }
        Billboard other = (Billboard) object;
        if ((this.billboardPK == null && other.billboardPK != null) || (this.billboardPK != null && !this.billboardPK.equals(other.billboardPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.labuno.model.entity.Billboard[ billboardPK=" + billboardPK + " ]";
    }
    
}
