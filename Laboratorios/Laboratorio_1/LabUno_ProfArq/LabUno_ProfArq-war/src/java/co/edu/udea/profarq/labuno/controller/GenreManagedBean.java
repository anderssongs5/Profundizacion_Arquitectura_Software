package co.edu.udea.profarq.labuno.controller;

import co.edu.udea.profarq.labuno.business.GenreManagerSessionBean;
import co.edu.udea.profarq.labuno.model.entity.Genre;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class GenreManagedBean implements Serializable {

    private static final long serialVersionUID = 1249911944890228782L;

    @EJB()
    private GenreManagerSessionBean genreManagerSessionBean;
    private List<Genre> genresList;

    public GenreManagedBean() {
        super();
    }

    public List<Genre> getGenresList() {
        if ((this.genresList == null) || (this.genresList.isEmpty())) {
            this.genresList = this.genreManagerSessionBean.findAll();
        }

        return (this.genresList);
    }

    public void setGenresList(List<Genre> genresList) {
        this.genresList = genresList;
    }
}
