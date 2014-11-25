package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.DirectorManagerBean;
import co.edu.udea.profarq.cinema.model.entities.Director;
import java.io.Serializable;

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

//        return (this.directorManagerSessionBean.find(directorPK));
        return (null);
    }

    public void save(Director director) {
//        this.directorManagerSessionBean.save(director);
    }
}