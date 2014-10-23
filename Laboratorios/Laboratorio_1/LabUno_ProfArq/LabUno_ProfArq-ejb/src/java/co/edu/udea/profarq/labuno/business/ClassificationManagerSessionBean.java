package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Classification;
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
public class ClassificationManagerSessionBean implements Serializable {

    private static final long serialVersionUID = 3675956314327809398L;

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public ClassificationManagerSessionBean() {
        super();
    }

    public List<Classification> findAll() {

        return (this.entityManager.createNamedQuery("Classification.findAll").
                getResultList());
    }
}
