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
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Entity()
@NamedQueries({
    @NamedQuery(name = "Billboard.findAll",
            query = "SELECT b FROM Billboard b"),
    @NamedQuery(name = "Billboard.findByFilmTitle",
            query = "SELECT b FROM Billboard b WHERE b.billboardPK.filmTitle = :filmTitle"),
    @NamedQuery(name = "Billboard.findByFilmReleaseDate",
            query = "SELECT b FROM Billboard b WHERE b.billboardPK.filmReleaseDate = :filmReleaseDate"),
    @NamedQuery(name = "Billboard.findByTheaterCity",
            query = "SELECT b FROM Billboard b WHERE b.billboardPK.theaterCity = :theaterCity"),
    @NamedQuery(name = "Billboard.findByTheater",
            query = "SELECT b FROM Billboard b WHERE b.billboardPK.theater = :theater"),
    @NamedQuery(name = "Billboard.findByAudioLanguage",
            query = "SELECT b FROM Billboard b WHERE b.billboardPK.audioLanguage = :audioLanguage"),
    @NamedQuery(name = "Billboard.findBySubtitleLanguage",
            query = "SELECT b FROM Billboard b WHERE b.billboardPK.subtitleLanguage = :subtitleLanguage"),
    @NamedQuery(name = "Billboard.findByVideoFormat",
            query = "SELECT b FROM Billboard b WHERE b.billboardPK.videoFormat = :videoFormat"),
    @NamedQuery(name = "Billboard.findByOutDate",
            query = "SELECT b FROM Billboard b WHERE b.outDate = :outDate")})
@Table(name = "BILLBOARD")
@XmlRootElement()
public class Billboard implements Serializable {

    private static final long serialVersionUID = -5257078598115825942L;

    @EmbeddedId()
    protected BillboardPK billboardPK;
    @Column(name = "OUT_DATE")
    @Temporal(TemporalType.DATE)
    private Date outDate;
    @JoinColumn(name = "VIDEO_FORMAT", referencedColumnName = "VIDEO_FORMAT",
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private VideoFormat videoFormat1;
    @JoinColumns({
        @JoinColumn(name = "THEATER_CITY", referencedColumnName = "CITY_CODE",
                insertable = false, updatable = false),
        @JoinColumn(name = "THEATER", referencedColumnName = "THEATER",
                insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Theater theater1;
    @JoinColumn(name = "STATUS", referencedColumnName = "STATUS")
    @ManyToOne(optional = false)
    private Status status;
    @JoinColumns({
        @JoinColumn(name = "FILM_TITLE", referencedColumnName = "TITLE",
                insertable = false, updatable = false),
        @JoinColumn(name = "FILM_RELEASE_DATE",
                referencedColumnName = "RELEASE_DATE", insertable = false,
                updatable = false)})
    @ManyToOne(optional = false)
    private Film film;
    @JoinColumns({
        @JoinColumn(name = "AUDIO_LANGUAGE",
                referencedColumnName = "AUDIO_LANGUAGE", insertable = false,
                updatable = false),
        @JoinColumn(name = "SUBTITLE_LANGUAGE",
                referencedColumnName = "SUBTITLE_LANGUAGE", insertable = false,
                updatable = false)})
    @ManyToOne(optional = false)
    private AudioFormat audioFormat;

    public Billboard() {
        super();
    }

    public Billboard(BillboardPK billboardPK) {
        this.billboardPK = billboardPK;
    }

    public Billboard(String filmTitle, Date filmReleaseDate, String theaterCity,
            String theater, String audioLanguage, String subtitleLanguage,
            String videoFormat) {
        this.billboardPK = new BillboardPK(filmTitle, filmReleaseDate,
                theaterCity, theater, audioLanguage, subtitleLanguage,
                videoFormat);
    }

    public BillboardPK getBillboardPK() {

        return (this.billboardPK);
    }

    public void setBillboardPK(BillboardPK billboardPK) {
        this.billboardPK = billboardPK;
    }

    public Date getOutDate() {

        return (this.outDate);
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public VideoFormat getVideoFormat1() {

        return (this.videoFormat1);
    }

    public void setVideoFormat1(VideoFormat videoFormat1) {
        this.videoFormat1 = videoFormat1;
    }

    public Theater getTheater1() {

        return (this.theater1);
    }

    public void setTheater1(Theater theater1) {
        this.theater1 = theater1;
    }

    public Status getStatus() {

        return (this.status);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Film getFilm() {

        return (this.film);
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public AudioFormat getAudioFormat() {

        return (this.audioFormat);
    }

    public void setAudioFormat(AudioFormat audioFormat) {
        this.audioFormat = audioFormat;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getBillboardPK() != null)
                ? this.getBillboardPK().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof Billboard)) {

            return (false);
        }

        Billboard other = (Billboard) object;
        if (((this.getBillboardPK() == null) && (other.getBillboardPK() != null))
                || ((this.getBillboardPK() != null)
                && !(this.getBillboardPK().equals(other.getBillboardPK())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.Billboard[ billboardPK="
                + this.billboardPK + " ]");
    }
}
