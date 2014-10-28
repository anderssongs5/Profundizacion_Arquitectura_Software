package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Billboard;
import co.edu.udea.profarq.labuno.model.entity.Film;
import java.io.Serializable;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@LocalBean()
@Stateless()
public class BillboardManagerSessionBean implements Serializable {

    private static final long serialVersionUID = 2202708647974728283L;

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public BillboardManagerSessionBean() {
        super();
    }

    public List<Billboard> findAll() {

        return (this.entityManager.createNamedQuery("Billboard.findAll")
                .getResultList());
    }

    public List<Billboard> findByFilm(Film film) {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Billboard> criteriaQuery = criteriaBuilder.createQuery(
                Billboard.class);
        Root<Billboard> root = criteriaQuery.from(Billboard.class);

        criteriaQuery.select(root).where(criteriaBuilder.and(
                criteriaBuilder.equal(root.get("billboardPK").
                        get("filmReleaseDate"),
                        film.getFilmPK().getReleaseDate()),
                criteriaBuilder.equal(root.get("billboardPK").get("filmTitle"),
                        film.getFilmPK().getTitle())));

        return (this.entityManager.createQuery(criteriaQuery).getResultList());
    }

    public void save(Billboard billboard) {
        this.entityManager.persist(billboard);
        this.entityManager.flush();
    }

    public Billboard update(Billboard billboard) {
        billboard = this.entityManager.merge(billboard);
        this.entityManager.flush();

        return (billboard);
    }
}
