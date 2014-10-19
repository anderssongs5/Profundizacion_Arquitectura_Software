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
    @NamedQuery(name = "City.findAll",
            query = "SELECT c FROM City c"),
    @NamedQuery(name = "City.findByCode",
            query = "SELECT c FROM City c WHERE c.code = :code"),
    @NamedQuery(name = "City.findByCity",
            query = "SELECT c FROM City c WHERE c.city = :city")})
@Table(name = "CITY")
@XmlRootElement()
public class City implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id()
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 5)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 35)
    @Column(name = "CITY")
    private String city;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<Theater> theaterList;

    public City() {
        super();
    }

    public City(String code) {
        this.code = code;
    }

    public City(String code, String city) {
        this.code = code;
        this.city = city;
    }

    public String getCode() {

        return (this.code);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {

        return (this.city);
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlTransient()
    public List<Theater> getTheaterList() {

        return (this.theaterList);
    }

    public void setTheaterList(List<Theater> theaterList) {
        this.theaterList = theaterList;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getCode() != null) ? this.getCode().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof City)) {

            return (false);
        }

        City other = (City) object;
        if (((this.getCode() == null) && (other.getCode() != null))
                || ((this.getCode() != null)
                && !(this.getCode().equals(other.getCode())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.City[ code="
                + this.code + " ]");
    }
}
