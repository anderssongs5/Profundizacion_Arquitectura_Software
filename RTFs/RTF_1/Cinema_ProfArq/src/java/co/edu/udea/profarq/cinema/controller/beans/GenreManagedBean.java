package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.GenreManagerBean;
import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Genre;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class GenreManagedBean implements Serializable {

    private static final long serialVersionUID = 1249911944890228782L;

    private GenreManagerBean genreManagerBean;
    private List<Genre> genresList;

    public GenreManagedBean() {
        super();
    }

    public GenreManagerBean getGenreManagerBean() {

        return (this.genreManagerBean);
    }

    public void setGenreManagerBean(
            GenreManagerBean genreManagerBean) {
        this.genreManagerBean = genreManagerBean;
    }

    public List<Genre> getGenresList() {
        if ((this.genresList == null) || (this.genresList.isEmpty())) {
            try {
                this.genresList = this.genreManagerBean.findAll();
            } catch (CinemaBusinessException e) {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_FATAL,
                                "Genre Error", e.getMessage()));
            }
        }

        return (this.genresList);
    }

    public void setGenresList(List<Genre> genresList) {
        this.genresList = genresList;
    }
}
