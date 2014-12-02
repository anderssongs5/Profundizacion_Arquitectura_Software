package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.DirectorManagerBean;
import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Director;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DirectorManagedBean implements Serializable {

    private static final long serialVersionUID = 2495933381372360074L;

    private DirectorManagerBean directorManagerBean;

    public DirectorManagedBean() {
        super();
    }

    public DirectorManagerBean getDirectorManagerBean() {

        return (this.directorManagerBean);
    }

    public void setDirectorManagerBean(
            DirectorManagerBean directorManagerBean) {
        this.directorManagerBean = directorManagerBean;
    }

    public Director find(String directorPK) {
        try {

            return (this.directorManagerBean.find(directorPK));
        } catch (CinemaBusinessException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                            "Finding Film", e.getMessage()));
        }

        return (null);
    }

    public void save(Director director) {
        try {
            this.directorManagerBean.save(director);
        } catch (CinemaBusinessException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                            "Saving Film", e.getMessage()));
        }
    }
}
