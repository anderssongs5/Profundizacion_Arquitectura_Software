package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.StatusManagerBean;
import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Status;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class StatusManagedBean implements Serializable {

    private static final long serialVersionUID = 6107535119484435328L;

    private StatusManagerBean statusManagerBean;
    private SelectItem[] statusSelectItems;

    public StatusManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<Status> statusesList;
        SelectItem[] selectItems = null;

        try {
            statusesList = this.statusManagerBean.findAll();
        } catch (CinemaBusinessException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                            "Status Error", e.getMessage()));
            this.setStatusSelectItems(selectItems);

            return;
        }

        if ((statusesList != null) && (!statusesList.isEmpty())) {
            selectItems = new SelectItem[statusesList.size()];

            for (int position = 0; position < statusesList.size(); position++) {
                Status status = statusesList.get(position);
                selectItems[position] = new SelectItem(
                        status.getStatus(), status.getStatus(),
                        status.getDescription());
            }
        }

        this.setStatusSelectItems(selectItems);
    }

    public StatusManagerBean getStatusManagerBean() {

        return (this.statusManagerBean);
    }

    public void setStatusManagerBean(
            StatusManagerBean statusManagerBean) {
        this.statusManagerBean = statusManagerBean;
    }

    public SelectItem[] getStatusSelectItems() {

        return (this.statusSelectItems);
    }

    public void setStatusSelectItems(SelectItem[] statusSelectItems) {
        this.statusSelectItems = statusSelectItems;
    }
}