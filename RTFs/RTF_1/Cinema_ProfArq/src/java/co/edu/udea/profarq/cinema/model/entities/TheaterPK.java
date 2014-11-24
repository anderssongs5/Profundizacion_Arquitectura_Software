package co.edu.udea.profarq.cinema.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Embeddable()
public class TheaterPK implements Serializable {

    private static final long serialVersionUID = -1209518005074183224L;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 5)
    @Column(name = "city_code")
    private String cityCode;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 55)
    @Column(name = "theater")
    private String theater;

    public TheaterPK() {
        super();
    }

    public TheaterPK(String cityCode, String theater) {
        this.cityCode = cityCode;
        this.theater = theater;
    }

    public String getCityCode() {

        return (this.cityCode);
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getTheater() {

        return (this.theater);
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getCityCode() != null) ? this.getCityCode().hashCode()
                : 0);
        hash += ((this.getTheater() != null) ? this.getTheater().hashCode()
                : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TheaterPK)) {

            return (false);
        }

        TheaterPK other = (TheaterPK) object;
        if (((this.getCityCode() == null) && (other.getCityCode() != null))
                || ((this.getCityCode() != null)
                && !(this.getCityCode().equals(other.getCityCode())))) {

            return (false);
        }

        if (((this.getTheater() == null) && (other.getTheater() != null))
                || ((this.getTheater() != null)
                && !(this.getTheater().equals(other.getTheater())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.cinema.model.entities.TheaterPK[ cityCode="
                + this.getCityCode() + ", theater=" + this.getTheater() + " ]");
    }
}