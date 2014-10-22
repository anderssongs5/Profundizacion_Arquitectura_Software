package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Billboard;
import co.edu.udea.profarq.labuno.model.entity.Film;
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
public class BillboardManagerSessionBean {

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public BillboardManagerSessionBean() {
        super();
    }

    public void save(Billboard billboard) {
        this.entityManager.persist(billboard);
    }

    public List<Billboard> findAll() {

        return (this.entityManager.createNamedQuery("Billboard.findAll")
                .getResultList());
    }

    public List<Billboard> findByFilm(Film film) {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Billboard> criteriaQuery = criteriaBuilder.createQuery(Billboard.class);
        Root<Billboard> root = criteriaQuery.from(Billboard.class);

//        ParameterExpression<String> filmNameParameterExpression = criteriaBuilder.parameter(String.class);
//        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("billboardPK").get("filmTitle"),
//                film.getFilmPK().getTitle()));
//        TypedQuery<Billboard> typedQuery = this.entityManager.createQuery(criteriaQuery);
//        typedQuery.setParameter(filmNameParameterExpression, film.getFilmPK().getTitle());
        criteriaQuery.select(root).where(criteriaBuilder.and(
                criteriaBuilder.equal(root.get("billboardPK").get("filmReleaseDate"),
                        film.getFilmPK().getReleaseDate()),
                criteriaBuilder.equal(root.get("billboardPK").get("filmTitle"),
                        film.getFilmPK().getTitle())));

        return (this.entityManager.createQuery(criteriaQuery).getResultList());
    }
}
