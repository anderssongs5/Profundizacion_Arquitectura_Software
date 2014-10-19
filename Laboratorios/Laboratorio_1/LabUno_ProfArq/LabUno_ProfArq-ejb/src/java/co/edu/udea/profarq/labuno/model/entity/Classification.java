package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Entity()
@NamedQueries({
    @NamedQuery(name = "Classification.findAll",
            query = "SELECT c FROM Classification c"),
    @NamedQuery(name = "Classification.findByAge",
            query = "SELECT c FROM Classification c WHERE c.age = :age")})
@Table(name = "CLASSIFICATION")
@XmlRootElement()
public class Classification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id()
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 2)
    @Column(name = "AGE")
    private String age;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classification")
    private List<Film> filmList;

    public Classification() {
        super();
    }

    public Classification(String age) {
        this.age = age;
    }

    public String getAge() {

        return (this.age);
    }

    public void setAge(String age) {
        this.age = age;
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

        hash += ((this.getAge() != null) ? this.getAge().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof Classification)) {

            return (false);
        }

        Classification other = (Classification) object;
        if (((this.getAge() == null) && (other.getAge() != null))
                || ((this.getAge() != null)
                && !(this.getAge().equals(other.getAge())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.Classification[ age="
                + this.age + " ]");
    }
}
