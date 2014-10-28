package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Status;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/* *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@LocalBean()
@Stateless()
public class StatusManagerSessionBean {

    private static final long serialVersionUID = -4344873700627880508L;

    public static final String SOON_BILLBOARD = "1";
    public static final String ON_BILLBOARD = "2";
    public static final String OUT_BILLBOARD = "3";

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public StatusManagerSessionBean() {
        super();
    }

    public List<Status> findAll() {

        return (this.entityManager.createNamedQuery("Status.findAll").
                getResultList());
    }
}
