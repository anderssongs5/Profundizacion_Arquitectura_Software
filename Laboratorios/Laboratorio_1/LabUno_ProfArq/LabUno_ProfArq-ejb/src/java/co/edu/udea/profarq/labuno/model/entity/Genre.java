package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Entity()
@NamedQueries({
    @NamedQuery(name = "Genre.findAll",
            query = "SELECT g FROM Genre g"),
    @NamedQuery(name = "Genre.findByGenre",
            query = "SELECT g FROM Genre g WHERE g.genre = :genre"),
    @NamedQuery(name = "Genre.findByDescription",
            query = "SELECT g FROM Genre g WHERE g.description = :description")})
@Table(name = "GENRE")
@XmlRootElement()
public class Genre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id()
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 25)
    @Column(name = "GENRE")
    private String genre;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToMany(mappedBy = "genreList")
    private List<Film> filmList;

    public Genre() {
        super();
    }

    public Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {

        return (this.genre);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {

        return (this.description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient()
    public List<Film> getFilmList() {

        return (this.filmList);
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getGenre() != null) ? this.getGenre().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof Genre)) {

            return (false);
        }

        Genre other = (Genre) object;
        if (((this.getGenre() == null) && (other.getGenre() != null))
                || ((this.getGenre() != null)
                && !(this.getGenre().equals(other.getGenre())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.Genre[ genre="
                + this.genre + " ]");
    }
}
