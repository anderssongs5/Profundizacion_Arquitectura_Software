package co.edu.udea.profarq.cinema.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Entity
@Table(name = "film")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Film.findAll", query = "SELECT f FROM Film f"),
    @NamedQuery(name = "Film.findByTitle", query = "SELECT f FROM Film f WHERE f.filmPK.title = :title"),
    @NamedQuery(name = "Film.findByReleaseDate", query = "SELECT f FROM Film f WHERE f.filmPK.releaseDate = :releaseDate"),
    @NamedQuery(name = "Film.findBySypnosis", query = "SELECT f FROM Film f WHERE f.sypnosis = :sypnosis"),
    @NamedQuery(name = "Film.findByPseudonym", query = "SELECT f FROM Film f WHERE f.pseudonym = :pseudonym"),
    @NamedQuery(name = "Film.findByImage", query = "SELECT f FROM Film f WHERE f.image = :image")})
public class Film implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FilmPK filmPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sypnosis")
    private String sypnosis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "pseudonym")
    private String pseudonym;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "duration")
    private String duration;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "image")
    private String image;
    @ManyToMany(mappedBy = "filmList")
    private List<Director> directorList;
    @JoinTable(name = "genre_by_film", joinColumns = {
        @JoinColumn(name = "film_title", referencedColumnName = "title"),
        @JoinColumn(name = "film_release_date", referencedColumnName = "release_date")}, inverseJoinColumns = {
        @JoinColumn(name = "genre", referencedColumnName = "genre")})
    @ManyToMany
    private List<Genre> genreList;
    @JoinColumn(name = "country", referencedColumnName = "iso_code")
    @ManyToOne(optional = false)
    private Country country;
    @JoinColumn(name = "classification", referencedColumnName = "age")
    @ManyToOne(optional = false)
    private Classification classification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "film")
    private List<Billboard> billboardList;

    public Film() {
    }

    public Film(FilmPK filmPK) {
        this.filmPK = filmPK;
    }

    public Film(FilmPK filmPK, String sypnosis, String pseudonym, String duration, String image) {
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
        return filmPK;
    }

    public void setFilmPK(FilmPK filmPK) {
        this.filmPK = filmPK;
    }

    public String getSypnosis() {
        return sypnosis;
    }

    public void setSypnosis(String sypnosis) {
        this.sypnosis = sypnosis;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @XmlTransient
    public List<Director> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }

    @XmlTransient
    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    @XmlTransient
    public List<Billboard> getBillboardList() {
        return billboardList;
    }

    public void setBillboardList(List<Billboard> billboardList) {
        this.billboardList = billboardList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmPK != null ? filmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.filmPK == null && other.filmPK != null) || (this.filmPK != null && !this.filmPK.equals(other.filmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.cinema.model.entities.Film[ filmPK=" + filmPK + " ]";
    }
    
}
