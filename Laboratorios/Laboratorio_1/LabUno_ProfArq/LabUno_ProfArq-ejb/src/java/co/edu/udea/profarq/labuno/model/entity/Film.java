package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
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
@NamedQueries({
    @NamedQuery(name = "Film.findAll",
            query = "SELECT f FROM Film f"),
    @NamedQuery(name = "Film.findByTitle",
            query = "SELECT f FROM Film f WHERE f.filmPK.title = :title"),
    @NamedQuery(name = "Film.findByReleaseDate",
            query = "SELECT f FROM Film f WHERE f.filmPK.releaseDate = :releaseDate"),
    @NamedQuery(name = "Film.findBySypnosis",
            query = "SELECT f FROM Film f WHERE f.sypnosis = :sypnosis"),
    @NamedQuery(name = "Film.findByPseudonym",
            query = "SELECT f FROM Film f WHERE f.pseudonym = :pseudonym"),
    @NamedQuery(name = "Film.findByDuration",
            query = "SELECT f FROM Film f WHERE f.duration = :duration"),
    @NamedQuery(name = "Film.findByImage",
            query = "SELECT f FROM Film f WHERE f.image = :image")})
@Table(name = "FILM")
@XmlRootElement()
public class Film implements Serializable {

    private static final long serialVersionUID = -6417161713676501094L;

    @EmbeddedId()
    protected FilmPK filmPK;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 255)
    @Column(name = "SYPNOSIS")
    private String sypnosis;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 150)
    @Column(name = "PSEUDONYM")
    private String pseudonym;
    @Basic(optional = false)
    @NotNull()
    @Column(name = "DURATION")
    private long duration;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 55)
    @Column(name = "IMAGE")
    private String image;
    @JoinTable(name = "GENRE_BY_FILM", joinColumns = {
        @JoinColumn(name = "FILM_TITLE", referencedColumnName = "TITLE"),
        @JoinColumn(name = "FILM_RELEASE_DATE",
                referencedColumnName = "RELEASE_DATE")}, inverseJoinColumns = {
                @JoinColumn(name = "GENRE", referencedColumnName = "GENRE")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Genre> genreList;
    @JoinTable(name = "FILMS_DIRECTORS", joinColumns = {
        @JoinColumn(name = "FILM_TITLE", referencedColumnName = "TITLE"),
        @JoinColumn(name = "FILM_RELEASE_DATE",
                referencedColumnName = "RELEASE_DATE")}, inverseJoinColumns = {
                @JoinColumn(name = "DIRECTOR_FULL_NAME",
                        referencedColumnName = "FULL_NAME")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Director> directorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "film")
    private List<Billboard> billboardList;
    @JoinColumn(name = "COUNTRY", referencedColumnName = "ISO_CODE")
    @ManyToOne(optional = false)
    private Country country;
    @JoinColumn(name = "CLASSIFICATION", referencedColumnName = "AGE")
    @ManyToOne(optional = false)
    private Classification classification;
    @Transient()
    private String fullNamesDirectors;

    public Film() {
        super();
    }

    public Film(FilmPK filmPK) {
        this.filmPK = filmPK;
    }

    public Film(FilmPK filmPK, String sypnosis, String pseudonym,
            long duration, String image) {
        this.filmPK = filmPK;
        this.sypnosis = sypnosis;
        this.pseudonym = pseudonym;
        this.duration = duration;
        this.image = image;
    }

    public Film(String title, Date releaseDate) {
        this.filmPK = new FilmPK(title, releaseDate);
    }

    public FilmPK getFilmPK() {

        return (this.filmPK);
    }

    public void setFilmPK(FilmPK filmPK) {
        this.filmPK = filmPK;
    }

    public String getSypnosis() {

        return (this.sypnosis);
    }

    public void setSypnosis(String sypnosis) {
        this.sypnosis = sypnosis;
    }

    public String getPseudonym() {

        return (this.pseudonym);
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public long getDuration() {

        return (this.duration);
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getImage() {

        return (this.image);
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFullNamesDirectors() {

        return (this.fullNamesDirectors);
    }

    public void setFullNamesDirectors(String fullNamesDirectors) {
        this.fullNamesDirectors = fullNamesDirectors;
    }

    @XmlTransient()
    public List<Genre> getGenreList() {

        return (this.genreList);
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    @XmlTransient()
    public List<Director> getDirectorList() {

        return (this.directorList);
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }

    @XmlTransient()
    public List<Billboard> getBillboardList() {

        return (this.billboardList);
    }

    public void setBillboardList(List<Billboard> billboardList) {
        this.billboardList = billboardList;
    }

    public Country getCountry() {

        return (this.country);
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Classification getClassification() {

        return (this.classification);
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getFilmPK() != null) ? this.getFilmPK().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof Film)) {

            return (false);
        }

        Film other = (Film) object;
        if (((this.getFilmPK() == null) && (other.getFilmPK() != null))
                || ((this.getFilmPK() != null)
                && !(this.getFilmPK().equals(other.getFilmPK())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.Film[ filmPK="
                + this.filmPK + " ]");
    }
}
