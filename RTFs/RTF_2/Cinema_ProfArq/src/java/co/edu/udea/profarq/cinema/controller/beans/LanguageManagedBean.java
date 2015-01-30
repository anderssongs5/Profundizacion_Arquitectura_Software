package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.LanguageManagerBean;
import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Languages;
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
public class LanguageManagedBean implements Serializable {

    private static final long serialVersionUID = -1741073586122441355L;

    private LanguageManagerBean languageManagerBean;
    private SelectItem[] languagesSelectItems;

    public LanguageManagedBean() {
        super();
    }

    @PostConstruct()
    private void init() {
        List<Languages> languagesList;
        SelectItem[] selectItems = null;

        try {
            languagesList = this.languageManagerBean.
                    findAll();
        } catch (CinemaBusinessException e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                            "Language Error", e.getMessage()));

            this.setLanguagesSelectItems(selectItems);

            return;
        }

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

    public LanguageManagerBean getLanguageManagerBean() {

        return (this.languageManagerBean);
    }

    public void setLanguageManagerBean(
            LanguageManagerBean languageManagerBean) {
        this.languageManagerBean = languageManagerBean;
    }

    public SelectItem[] getLanguagesSelectItems() {

        return (this.languagesSelectItems);
    }

    public void setLanguagesSelectItems(SelectItem[] languagesSelectItems) {
        this.languagesSelectItems = languagesSelectItems;
    }
}
