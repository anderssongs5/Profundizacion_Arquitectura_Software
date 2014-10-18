package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.BillboardManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Billboard;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class BillboardManagedBean {

    @EJB()
    private BillboardManagerSessionBean billboardManagerSessionBean;
    private List<Billboard> billboardsList;

    public BillboardManagedBean() {
        super();
    }

    public List<Billboard> getBillboardsList() {
     
        return (this.billboardsList);
    }

    public void setBillboardsList(List<Billboard> billboardsList) {
        this.billboardsList = billboardsList;
    }
}