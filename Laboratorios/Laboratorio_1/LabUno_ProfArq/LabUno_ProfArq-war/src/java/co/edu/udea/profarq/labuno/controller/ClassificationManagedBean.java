package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.ClassificationManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Classification;
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
public class ClassificationManagedBean {

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
                String valueForSelectItem;

                if (!classification.getAge().equals("00")) {
                    valueForSelectItem = String.format("%s %s %s", "Mayores de",
                            classification.getAge(), " años");
                } else {
                    valueForSelectItem = String.format("%s",
                            "Todo público");
                }

                selectItems[position] = new SelectItem(classification,
                        valueForSelectItem);
            }
        }

        this.setClassificationsSelectItems(selectItems);
    }

    public SelectItem[] getClassificationsSelectItems() {

        return (this.classificationsSelectItems);
    }

    public void setClassificationsSelectItems(SelectItem[] classificationsSelectItems) {
        this.classificationsSelectItems = classificationsSelectItems;
    }
}
