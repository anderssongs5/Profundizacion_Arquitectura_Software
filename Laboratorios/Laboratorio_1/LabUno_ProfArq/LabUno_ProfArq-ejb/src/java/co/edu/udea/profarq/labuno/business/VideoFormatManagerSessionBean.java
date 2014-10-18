package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.VideoFormat;
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
public class VideoFormatManagerSessionBean {

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
