package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.BillboardManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Billboard;
import co.edu.udea.profarq.labuno.model.entity.Film;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class BillboardManagedBean implements Serializable {

    private static final long serialVersionUID = 4143438520136358109L;

    @EJB()
    private BillboardManagerSessionBean billboardManagerSessionBean;
    private FilmManagedBean filmManagedBean;
    private List<Billboard> billboardsList;

    public BillboardManagedBean() {
        super();
    }

    public FilmManagedBean getFilmManagedBean() {

        return (this.filmManagedBean);
    }

    public void setFilmManagedBean(FilmManagedBean filmManagedBean) {
        this.filmManagedBean = filmManagedBean;
    }

    public List<Billboard> getBillboardsList() {
        if ((this.billboardsList == null) || (this.billboardsList.isEmpty())) {
            this.refreshPage();
        }

        return (this.billboardsList);
    }

    public void setBillboardsList(List<Billboard> billboardsList) {
        this.billboardsList = billboardsList;
    }

    private void refreshPage() {
        if ((this.filmManagedBean != null)
                && (this.filmManagedBean.getSelectedFilm() != null)) {
            Film selectedFilm = this.getFilmManagedBean().getSelectedFilm();

            this.billboardsList = this.billboardManagerSessionBean.findByFilm(
                    selectedFilm);
        }
    }
}
