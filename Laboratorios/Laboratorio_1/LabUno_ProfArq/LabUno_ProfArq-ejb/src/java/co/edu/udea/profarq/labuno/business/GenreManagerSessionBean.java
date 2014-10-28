package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Genre;
import java.io.Serializable;
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
public class GenreManagerSessionBean implements Serializable {

    private static final long serialVersionUID = 2531572387145448163L;

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public GenreManagerSessionBean() {
        super();
    }

    public List<Genre> findAll() {

        return (this.entityManager.createNamedQuery("Genre.findAll").
                getResultList());
    }
}
