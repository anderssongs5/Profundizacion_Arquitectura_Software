package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.LanguageManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Languages;
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
public class LanguageManagedBean implements Serializable {

    private static final long serialVersionUID = -1741073586122441355L;

    @EJB()
    private LanguageManagerSessionBean languageManagerSessionBean;
    private SelectItem[] languagesSelectItems;

    public LanguageManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<Languages> languagesList = this.languageManagerSessionBean.
                findAll();
        SelectItem[] selectItems = null;

        if ((languagesList != null) && (!languagesList.isEmpty())) {
            selectItems = new SelectItem[languagesList.size()];

            for (int position = 0; position < languagesList.size(); position++) {
                Languages language = languagesList.get(position);
                selectItems[position] = new SelectItem(language.getIsoCode(),
                        String.format("[%s] %s",
                                language.getIsoCode(),
                                language.getLanguageName()));
            }
        }

        this.setLanguagesSelectItems(selectItems);
    }

    public SelectItem[] getLanguagesSelectItems() {

        return (this.languagesSelectItems);
    }

    public void setLanguagesSelectItems(SelectItem[] languagesSelectItems) {
        this.languagesSelectItems = languagesSelectItems;
    }
}
