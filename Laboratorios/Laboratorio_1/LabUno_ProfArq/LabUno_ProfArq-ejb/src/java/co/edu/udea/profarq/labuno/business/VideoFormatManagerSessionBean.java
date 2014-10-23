package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.VideoFormat;
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
public class VideoFormatManagerSessionBean implements Serializable {

    private static final long serialVersionUID = 5745425374594567736L;

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public VideoFormatManagerSessionBean() {
        super();
    }

    public List<VideoFormat> findAll() {

        return (this.entityManager.createNamedQuery("VideoFormat.findAll").
                getResultList());
    }
}
