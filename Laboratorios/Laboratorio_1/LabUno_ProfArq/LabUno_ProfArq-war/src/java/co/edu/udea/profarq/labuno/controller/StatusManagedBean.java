package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.StatusManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Status;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class StatusManagedBean implements Serializable {

    private static final long serialVersionUID = 6107535119484435328L;

    @EJB()
    private StatusManagerSessionBean statusManagerSessionBean;
    private SelectItem[] statusSelectItems;

    public StatusManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<Status> statusesList = this.statusManagerSessionBean.findAll();

        SelectItem[] selectItems = null;

        if ((statusesList != null) && (!statusesList.isEmpty())) {
            selectItems = new SelectItem[statusesList.size()];

            for (int position = 0; position < statusesList.size(); position++) {
                Status status = statusesList.get(position);
                selectItems[position] = new SelectItem(
                        status.getStatus(), status.getDescription());
            }
        }

        this.setStatusSelectItems(selectItems);
    }

    public SelectItem[] getStatusSelectItems() {

        return (this.statusSelectItems);
    }

    public void setStatusSelectItems(SelectItem[] statusSelectItems) {
        this.statusSelectItems = statusSelectItems;
    }
}
