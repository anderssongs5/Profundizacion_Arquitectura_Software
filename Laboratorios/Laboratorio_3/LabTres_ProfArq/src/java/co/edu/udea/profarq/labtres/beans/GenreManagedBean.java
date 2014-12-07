package co.edu.udea.profarq.labtres.beans;

import co.edu.udea.profarq.labtres.model.entities.Genre;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Stateless()
@Named(value = "genreManagedBean")
public class GenreManagedBean implements Serializable {

    private static final long serialVersionUID = 6374679451045815969L;

    public static final List<Genre> GENRES_LIST;
    private List<Genre> sourceGenresList;

    static {
        GENRES_LIST = Arrays.asList(new Genre("DRAMA"), new Genre("ACCIÓN"),
                new Genre("BÉLICO"), new Genre("VIEJO OESTE"),
                new Genre("TERROR"), new Genre("CIENCIA FICCIÓN"),
                new Genre("FANTASÍA"), new Genre("SUSPENSO"),
                new Genre("ROMÁTICO"), new Genre("PORNOGRÁFICO"),
                new Genre("ANIMACIÓN"), new Genre("COMEDIA"), new Genre("FAMILIAR"));
    }

    public GenreManagedBean() {
    }

    public void createFilteredGenresList(List<Genre> genresList) {
        this.sourceGenresList = new ArrayList<>(GENRES_LIST);

        this.sourceGenresList.removeAll(genresList);
    }
}
