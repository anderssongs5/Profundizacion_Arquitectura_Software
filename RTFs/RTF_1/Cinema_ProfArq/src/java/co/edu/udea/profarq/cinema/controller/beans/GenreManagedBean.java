package co.edu.udea.profarq.cinema.controller.beans;

import co.edu.udea.profarq.cinema.business.spring.GenreManagerBean;
import co.edu.udea.profarq.cinema.model.entities.Genre;
import java.io.Serializable;
import java.util.List;

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
//        if ((this.genresList == null) || (this.genresList.isEmpty())) {
//            this.genresList = this.genreManagerSessionBean.findAll();
//        }

        return (this.genresList);
    }

    public void setGenresList(List<Genre> genresList) {
        this.genresList = genresList;
    }
}