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

    private TheaterManagerBean theaterManagerBean;
    private List<Theater> theatersList;

    public TheaterManagedBean() {
        super();
    }

    public TheaterManagerBean getTheaterManagerBean() {
        
        return (this.theaterManagerBean);
    }

    public void setTheaterManagerBean(
            TheaterManagerBean theaterManagerBean) {
        this.theaterManagerBean = theaterManagerBean;
    }

    public List<Theater> getTheatersList() {
        if ((this.theatersList == null) || (this.theatersList.isEmpty())) {
            this.refreshPage();
        }

        return (this.theatersList);
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