package co.edu.udea.profarq.cinema.model.entities;

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
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Entity
@Table(name = "billboard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billboard.findAll", query = "SELECT b FROM Billboard b"),
    @NamedQuery(name = "Billboard.findByFilmTitle", query = "SELECT b FROM Billboard b WHERE b.billboardPK.filmTitle = :filmTitle"),
    @NamedQuery(name = "Billboard.findByFilmReleaseDate", query = "SELECT b FROM Billboard b WHERE b.billboardPK.filmReleaseDate = :filmReleaseDate"),
    @NamedQuery(name = "Billboard.findByTheaterCity", query = "SELECT b FROM Billboard b WHERE b.billboardPK.theaterCity = :theaterCity"),
    @NamedQuery(name = "Billboard.findByTheater", query = "SELECT b FROM Billboard b WHERE b.billboardPK.theater = :theater"),
    @NamedQuery(name = "Billboard.findByAudioLanguage", query = "SELECT b FROM Billboard b WHERE b.billboardPK.audioLanguage = :audioLanguage"),
    @NamedQuery(name = "Billboard.findBySubtitleLanguage", query = "SELECT b FROM Billboard b WHERE b.billboardPK.subtitleLanguage = :subtitleLanguage"),
    @NamedQuery(name = "Billboard.findByVideoFormat", query = "SELECT b FROM Billboard b WHERE b.billboardPK.videoFormat = :videoFormat"),
    @NamedQuery(name = "Billboard.findByOutDate", query = "SELECT b FROM Billboard b WHERE b.outDate = :outDate")})
public class Billboard implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BillboardPK billboardPK;
    @Column(name = "out_date")
    @Temporal(TemporalType.DATE)
    private Date outDate;
    @JoinColumn(name = "video_format", referencedColumnName = "video_format", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private VideoFormat videoFormat1;
    @JoinColumns({
        @JoinColumn(name = "theater_city", referencedColumnName = "city_code", insertable = false, updatable = false),
        @JoinColumn(name = "theater", referencedColumnName = "theater", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Theater theater1;
    @JoinColumn(name = "status", referencedColumnName = "status")
    @ManyToOne(optional = false)
    private Status status;
    @JoinColumns({
        @JoinColumn(name = "film_title", referencedColumnName = "title", insertable = false, updatable = false),
        @JoinColumn(name = "film_release_date", referencedColumnName = "release_date", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Film film;
    @JoinColumns({
        @JoinColumn(name = "audio_language", referencedColumnName = "audio_language", insertable = false, updatable = false),
        @JoinColumn(name = "subtitle_language", referencedColumnName = "subtitle_language", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AudioFormat audioFormat;

    public Billboard() {
    }

    public Billboard(BillboardPK billboardPK) {
        this.billboardPK = billboardPK;
    }

    public Billboard(String filmTitle, Date filmReleaseDate, String theaterCity, String theater, String audioLanguage, String subtitleLanguage, String videoFormat) {
        this.billboardPK = new BillboardPK(filmTitle, filmReleaseDate, theaterCity, theater, audioLanguage, subtitleLanguage, videoFormat);
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

    public VideoFormat getVideoFormat1() {
        return videoFormat1;
    }

    public void setVideoFormat1(VideoFormat videoFormat1) {
        this.videoFormat1 = videoFormat1;
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
        return "co.edu.udea.profarq.cinema.model.entities.Billboard[ billboardPK=" + billboardPK + " ]";
    }
    
}
