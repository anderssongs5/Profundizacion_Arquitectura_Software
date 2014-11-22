package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.TheaterManagerBean;
import co.edu.udea.profarq.cinema.model.entities.Theater;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class TheaterManagedBean implements Serializable {

    private static final long serialVersionUID = -8724406385889168684L;

    private TheaterManagerBean theaterManagerSessionBean;
    private List<Theater> theatersList;

    public TheaterManagedBean() {
        super();
    }

    public TheaterManagerBean getTheaterManagerSessionBean() {
        
        return theaterManagerSessionBean;
    }

    public void setTheaterManagerSessionBean(
            TheaterManagerBean theaterManagerSessionBean) {
        this.theaterManagerSessionBean = theaterManagerSessionBean;
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
//        List<Theater> theatersFound = this.theaterManagerSessionBean.findAll();
//
//        this.setTheatersList(theatersFound);
    }
}
