package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.LanguageManagerBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class LanguageManagedBean implements Serializable {

    private static final long serialVersionUID = -1741073586122441355L;

    private LanguageManagerBean languageManagerSessionBean;
    private SelectItem[] languagesSelectItems;

    public LanguageManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
//        List<Languages> languagesList = this.languageManagerSessionBean.
//                findAll();
//        SelectItem[] selectItems = null;
//
//        if ((languagesList != null) && (!languagesList.isEmpty())) {
//            selectItems = new SelectItem[languagesList.size()];
//
//            for (int position = 0; position < languagesList.size(); position++) {
//                Languages language = languagesList.get(position);
//                selectItems[position] = new SelectItem(language.getIsoCode(),
//                        String.format("[%s] %s",
//                                language.getIsoCode(),
//                                language.getLanguageName()));
//            }
//        }
//
//        this.setLanguagesSelectItems(selectItems);
    }

    public LanguageManagerBean getLanguageManagerSessionBean() {
        
        return languageManagerSessionBean;
    }

    public void setLanguageManagerSessionBean(
            LanguageManagerBean languageManagerSessionBean) {
        this.languageManagerSessionBean = languageManagerSessionBean;
    }

    public SelectItem[] getLanguagesSelectItems() {

        return (this.languagesSelectItems);
    }

    public void setLanguagesSelectItems(SelectItem[] languagesSelectItems) {
        this.languagesSelectItems = languagesSelectItems;
    }
}
