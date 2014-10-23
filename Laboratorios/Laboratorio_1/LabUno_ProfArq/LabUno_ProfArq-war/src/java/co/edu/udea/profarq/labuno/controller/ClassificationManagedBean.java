package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.ClassificationManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Classification;
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
public class ClassificationManagedBean implements Serializable {

    private static final long serialVersionUID = -2782719886298733534L;

    @EJB()
    private ClassificationManagerSessionBean classificationManagerSessionBean;
    private SelectItem[] classificationsSelectItems;

    public ClassificationManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<Classification> classificationsList
                = this.classificationManagerSessionBean.findAll();
        SelectItem[] selectItems = null;

        if ((classificationsList != null) && (!classificationsList.isEmpty())) {
            selectItems = new SelectItem[classificationsList.size()];

            for (int position = 0; position < classificationsList.size(); position++) {
                Classification classification = classificationsList.get(position);

                selectItems[position] = new SelectItem(classification.getAge(),
                        this.formatClassification(classification));
            }
        }

        this.setClassificationsSelectItems(selectItems);
    }

    public String formatClassification(Classification classification) {
        String formatedValue;

        if (!classification.getAge().equals("00")) {
            formatedValue = String.format("%s %s %s", "Mayores de",
                    classification.getAge(), " años");
        } else {
            formatedValue = String.format("%s", "Todo público");
        }

        return (formatedValue);
    }

    public SelectItem[] getClassificationsSelectItems() {

        return (this.classificationsSelectItems);
    }

    public void setClassificationsSelectItems(SelectItem[] classificationsSelectItems) {
        this.classificationsSelectItems = classificationsSelectItems;
    }
}
