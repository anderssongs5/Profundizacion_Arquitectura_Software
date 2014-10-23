package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Entity()
@NamedQueries({
    @NamedQuery(name = "Theater.findAll",
            query = "SELECT t FROM Theater t"),
    @NamedQuery(name = "Theater.findByCityCode",
            query = "SELECT t FROM Theater t WHERE t.theaterPK.cityCode = :cityCode"),
    @NamedQuery(name = "Theater.findByTheater",
            query = "SELECT t FROM Theater t WHERE t.theaterPK.theater = :theater"),
    @NamedQuery(name = "Theater.findByAddress",
            query = "SELECT t FROM Theater t WHERE t.address = :address")})
@Table(name = "THEATER")
@XmlRootElement()
public class Theater implements Serializable {

    private static final long serialVersionUID = 8117220518743955048L;

    @EmbeddedId()
    protected TheaterPK theaterPK;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 55)
    @Column(name = "ADDRESS")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theater1")
    private List<Billboard> billboardList;
    @JoinColumn(name = "CITY_CODE", referencedColumnName = "CODE",
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private City city;

    public Theater() {
        super();
    }

    public Theater(TheaterPK theaterPK) {
        this.theaterPK = theaterPK;
    }

    public Theater(TheaterPK theaterPK, String address) {
        this.theaterPK = theaterPK;
        this.address = address;
    }

    public Theater(String cityCode, String theater) {
        this.theaterPK = new TheaterPK(cityCode, theater);
    }

    public TheaterPK getTheaterPK() {

        return (this.theaterPK);
    }

    public void setTheaterPK(TheaterPK theaterPK) {
        this.theaterPK = theaterPK;
    }

    public String getAddress() {

        return (this.address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlTransient()
    public List<Billboard> getBillboardList() {

        return (this.billboardList);
    }

    public void setBillboardList(List<Billboard> billboardList) {
        this.billboardList = billboardList;
    }

    public City getCity() {

        return (this.city);
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getTheaterPK() != null)
                ? this.getTheaterPK().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof Theater)) {

            return (false);
        }

        Theater other = (Theater) object;
        if (((this.getTheaterPK() == null) && (other.getTheaterPK() != null))
                || ((this.getTheaterPK() != null)
                && !(this.getTheaterPK().equals(other.getTheaterPK())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.Theater[ theaterPK="
                + this.theaterPK + " ]");
    }
}
