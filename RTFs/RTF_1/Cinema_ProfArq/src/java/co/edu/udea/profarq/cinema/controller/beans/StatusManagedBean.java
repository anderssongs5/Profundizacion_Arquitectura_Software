package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.StatusManagerBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class StatusManagedBean implements Serializable {

    private static final long serialVersionUID = 6107535119484435328L;

    private StatusManagerBean statusManagerSessionBean;
    private SelectItem[] statusSelectItems;

    public StatusManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
//        List<Status> statusesList = this.statusManagerSessionBean.findAll();
//
//        SelectItem[] selectItems = null;
//
//        if ((statusesList != null) && (!statusesList.isEmpty())) {
//            selectItems = new SelectItem[statusesList.size()];
//
//            for (int position = 0; position < statusesList.size(); position++) {
//                Status status = statusesList.get(position);
//                selectItems[position] = new SelectItem(
//                        status.getStatus(), status.getStatus(),
//                        status.getDescription());
//            }
//        }
//
//        this.setStatusSelectItems(selectItems);
    }

    public StatusManagerBean getStatusManagerSessionBean() {

        return statusManagerSessionBean;
    }

    public void setStatusManagerSessionBean(
            StatusManagerBean statusManagerSessionBean) {
        this.statusManagerSessionBean = statusManagerSessionBean;
    }

    public SelectItem[] getStatusSelectItems() {

        return (this.statusSelectItems);
    }

    public void setStatusSelectItems(SelectItem[] statusSelectItems) {
        this.statusSelectItems = statusSelectItems;
    }
}
