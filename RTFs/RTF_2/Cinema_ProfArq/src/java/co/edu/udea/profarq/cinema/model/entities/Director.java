package co.edu.udea.profarq.cinema.model.entities;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
    @NamedQuery(name = "Director.findAll",
            query = "SELECT d FROM Director d"),
    @NamedQuery(name = "Director.findByFullName",
            query = "SELECT d FROM Director d WHERE d.fullName = :fullName")})
@Table(name = "DIRECTOR")
@XmlAccessorType(value = XmlAccessType.PROPERTY)
@XmlRootElement()
public class Director implements IEntity, Serializable {

    private static final long serialVersionUID = -3608758315142538465L;
    @Id()
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 55)
    @Column(name = "full_name")
    private String fullName;
    @ManyToMany(mappedBy = "directorList")
    private List<Film> filmList;

    public Director() {
        super();
    }

    public Director(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {

        return (this.fullName);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @XmlTransient()
    public List<Film> getFilmList() {

        return (this.filmList);
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    @Override()
    public Serializable getPrimaryKey() {

        return (this.getFullName());
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getFullName() != null) ? this.getFullName().hashCode()
                : 0);

        return (hash);
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Director)) {

            return (false);
        }

        Director other = (Director) object;
        if (((this.getFullName() == null) && (other.getFullName() != null))
                || ((this.getFullName() != null)
                && !(this.getFullName().equals(other.getFullName())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.cinema.model.entities.Director[ fullName="
                + this.getFullName() + " ]");
    }
}
