package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.ClassificationManagerBean;
import co.edu.udea.profarq.cinema.model.entities.Classification;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ClassificationManagedBean implements Serializable {

    private static final long serialVersionUID = -2782719886298733534L;

    private ClassificationManagerBean classificationManagerBean;
    private SelectItem[] classificationsSelectItems;

    public ClassificationManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
//        List<Classification> classificationsList
//                = this.classificationManagerSessionBean.findAll();
//        SelectItem[] selectItems = null;
//
//        if ((classificationsList != null) && (!classificationsList.isEmpty())) {
//            selectItems = new SelectItem[classificationsList.size()];
//
//            for (int position = 0; position < classificationsList.size(); position++) {
//                Classification classification = classificationsList.get(position);
//
//                selectItems[position] = new SelectItem(classification.getAge(),
//                        this.formatClassification(classification));
//            }
//        }
//
//        this.setClassificationsSelectItems(selectItems);
    }

    public ClassificationManagerBean getClassificationManagerBean() {

        return (this.classificationManagerBean);
    }

    public void setClassificationManagerBean(
            ClassificationManagerBean classificationManagerBean) {
        this.classificationManagerBean = classificationManagerBean;
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