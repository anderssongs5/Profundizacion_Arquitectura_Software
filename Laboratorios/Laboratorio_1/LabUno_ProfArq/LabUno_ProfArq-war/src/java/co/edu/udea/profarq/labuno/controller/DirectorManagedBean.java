package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.DirectorManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Director;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DirectorManagedBean implements Serializable {

    private static final long serialVersionUID = 2495933381372360074L;

    @EJB()
    private DirectorManagerSessionBean directorManagerSessionBean;

    public DirectorManagedBean() {
        super();
    }

    public void save(Director director) {
        this.directorManagerSessionBean.save(director);
    }
}
