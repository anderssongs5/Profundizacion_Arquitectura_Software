package co.edu.udea.profarq.cinema.model.entities;

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
    @NamedQuery(name = "Country.findAll",
            query = "SELECT c FROM Country c"),
    @NamedQuery(name = "Country.findByIsoCode",
            query = "SELECT c FROM Country c WHERE c.isoCode = :isoCode"),
    @NamedQuery(name = "Country.findByCountry",
            query = "SELECT c FROM Country c WHERE c.country = :country")})
@Table(name = "COUNTRY")
@XmlRootElement()
public class Country implements IEntity, Serializable {

    private static final long serialVersionUID = -6419898328561689220L;
    @Id()
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 3)
    @Column(name = "iso_code")
    private String isoCode;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 55)
    @Column(name = "country")
    private String country;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    private List<Film> filmList;

    public Country() {
        super();
    }

    public Country(String isoCode) {
        this.isoCode = isoCode;
    }

    public Country(String isoCode, String country) {
        this.isoCode = isoCode;
        this.country = country;
    }

    public String getIsoCode() {

        return (this.isoCode);
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getCountry() {

        return (this.country);
    }

    public void setCountry(String country) {
        this.country = country;
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

        return (this.getIsoCode());
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getIsoCode() != null) ? this.getIsoCode().hashCode()
                : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Country)) {

            return false;
        }

        Country other = (Country) object;
        if (((this.getIsoCode() == null) && (other.getIsoCode() != null))
                || ((this.getIsoCode() != null)
                && !(this.getIsoCode().equals(other.getIsoCode())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.cinema.model.entities.Country[ isoCode="
                + this.getIsoCode() + " ]");
    }
}