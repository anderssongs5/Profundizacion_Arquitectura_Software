package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Film;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@LocalBean()
@Stateless()
public class FilmManagerSessionBean {

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public FilmManagerSessionBean() {
        super();
    }

    public boolean delete(Film film) {
        Film foundFilm = this.entityManager.find(Film.class, film.getFilmPK());

        if (foundFilm != null) {
            this.entityManager.remove(foundFilm);
            this.entityManager.flush();

            return (true);
        }

        return (false);
    }

    public List<Film> findAll() {

        return (this.entityManager.createNamedQuery("Film.findAll")
                .getResultList());
    }

    public void save(Film film) {
        this.entityManager.persist(film);
    }
}
