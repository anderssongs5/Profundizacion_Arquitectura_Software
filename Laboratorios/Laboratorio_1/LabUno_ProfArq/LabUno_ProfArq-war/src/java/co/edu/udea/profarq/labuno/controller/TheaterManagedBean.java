package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.TheaterManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Theater;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class TheaterManagedBean implements Serializable {

    private static final long serialVersionUID = -8724406385889168684L;

    @EJB()
    private TheaterManagerSessionBean theaterManagerSessionBean;
    private List<Theater> theatersList;

    public TheaterManagedBean() {
        super();
    }

    public List<Theater> getTheatersList() {
        if ((this.theatersList == null) || (this.theatersList.isEmpty())) {
            this.refreshPage();
        }

        return theatersList;
    }

    public void setTheatersList(List<Theater> theatersList) {
        this.theatersList = theatersList;
    }

    private void refreshPage() {
        List<Theater> theatersFound = this.theaterManagerSessionBean.findAll();

        this.setTheatersList(theatersFound);
    }
}
