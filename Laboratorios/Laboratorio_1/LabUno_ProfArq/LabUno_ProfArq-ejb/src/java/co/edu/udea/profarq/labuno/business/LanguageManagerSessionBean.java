package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Languages;
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
public class LanguageManagerSessionBean implements Serializable {

    private static final long serialVersionUID = 1601836894834404981L;

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
