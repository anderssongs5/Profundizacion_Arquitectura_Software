package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Director;
import java.io.Serializable;
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
public class DirectorManagerSessionBean implements Serializable {

    private static final long serialVersionUID = 1087624594924099346L;

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public DirectorManagerSessionBean() {
        super();
    }

    public Director find(Serializable directorPK) {

        return (this.entityManager.find(Director.class, directorPK));
    }

    public void save(Director director) {
        this.entityManager.persist(director);
        this.entityManager.flush();
    }
}
