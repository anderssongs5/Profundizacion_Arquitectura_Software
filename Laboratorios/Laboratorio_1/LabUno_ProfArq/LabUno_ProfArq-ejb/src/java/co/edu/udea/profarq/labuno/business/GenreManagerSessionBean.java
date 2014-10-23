package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Genre;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Stateless
@LocalBean
public class GenreManagerSessionBean implements Serializable {

    private static final long serialVersionUID = 2531572387145448163L;

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager em;

    public List<Genre> findAll() {
        Query query = this.em.createNamedQuery("Genre.findAll");

        return (query.getResultList());
    }
}
