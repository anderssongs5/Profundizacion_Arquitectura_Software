package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Languages;
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
public class LanguageManagerSessionBean {

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public LanguageManagerSessionBean() {
        super();
    }

    public List<Languages> findAll() {

        return (this.entityManager.createNamedQuery("Languages.findAll").
                getResultList());
    }
}
