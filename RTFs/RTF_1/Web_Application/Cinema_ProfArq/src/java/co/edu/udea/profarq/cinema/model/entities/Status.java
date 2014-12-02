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
    @NamedQuery(name = "Status.findAll",
            query = "SELECT s FROM Status s"),
    @NamedQuery(name = "Status.findByStatus",
            query = "SELECT s FROM Status s WHERE s.status = :status"),
    @NamedQuery(name = "Status.findByDescription",
            query = "SELECT s FROM Status s WHERE s.description = :description")})
@Table(name = "STATUS")
@XmlRootElement()
public class Status implements IEntity, Serializable {

    private static final long serialVersionUID = 1018450144858817296L;
    @Id()
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 1)
    @Column(name = "status")
    private String status;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private List<Billboard> billboardList;

    public Status() {
        super();
    }

    public Status(String status) {
        this.status = status;
    }

    public String getStatus() {

        return (this.status);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {

        return (this.description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient()
    public List<Billboard> getBillboardList() {

        return (this.billboardList);
    }

    public void setBillboardList(List<Billboard> billboardList) {
        this.billboardList = billboardList;
    }

    @Override()
    public Serializable getPrimaryKey() {

        return (this.getStatus());
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getStatus() != null) ? this.getStatus().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Status)) {

            return (false);
        }

        Status other = (Status) object;
        if (((this.getStatus() == null) && (other.getStatus() != null))
                || ((this.getStatus() != null)
                && !(this.getStatus().equals(other.getStatus())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.cinema.model.entities.Status[ status="
                + this.getStatus() + " ]");
    }
}