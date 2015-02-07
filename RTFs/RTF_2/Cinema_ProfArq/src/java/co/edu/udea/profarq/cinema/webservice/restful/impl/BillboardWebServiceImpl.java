package co.edu.udea.profarq.cinema.webservice.restful.impl;

import co.edu.udea.profarq.cinema.model.entities.Billboard;
import co.edu.udea.profarq.cinema.model.entities.TheaterPK;
import co.edu.udea.profarq.cinema.persistence.dao.IBillboardDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import co.edu.udea.profarq.cinema.util.TextUtil;
import co.edu.udea.profarq.cinema.webservice.restful.IBillboardWebService;
import co.edu.udea.profarq.cinema.webservice.restful.contract.RESTfulWebServiceContract;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Clase que implementa una interfaz, la cual le provee un Servicio Web para ser
 * ejecutado a trav&eacute;s de la tecnolog&iacute;a <b>RESTful</b>, permitiendo
 * en este caso que dos sistemas heterog&eneos compartan recursos entre
 * s&iacute;.
 * <p>
 * La funci&oacute;n de esta clase es implementar los m&eacute;todos expuestos
 * por la interfaz de manera que ofrezcan el acceso a las funciones orientadas
 * al manejo de la entidad {@code Billboard}.
 * <p>
 * Al ser un Servicio Web a trav&eacute;s de RESTful, todos los m&eacute;todos o
 * funciones aqu&iacute; implementadas est&aacute;n orientadas a compartir o
 * exponer recursos por medio de la invocaci&oacute;n de m&eacute;todos o
 * funciones relacionados con la l&oacute;gica de la aplicaci&oacute;n y los
 * procesos del negocio del Cinema orientados al manejo de la entidad
 * {@code Billboard}.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Path(value = RESTfulWebServiceContract.BillboardWebService.ROOT_PATH)
public final class BillboardWebServiceImpl implements IBillboardWebService {

    /**
     * Variable global final est&aacute;tica que representa un tag que
     * identifica la clase, de manera que pueda ser identificada en diversos
     * procesos que se lleven a cabo dentro de la aplicaci&oacute;n.
     */
    private static final String TAG = BillboardWebServiceImpl.class.getName();

    /**
     * Entidad que es utilizada para el manejo a nivel de la capa de
     * persistencia en la aplicaci&oacute;n orientada a cada una de las
     * operaciones que puedan realizarse sobre la entidad {@code Billboard}.
     */
    private IBillboardDAO billboardDAO;
    /**
     * Entidad inyectada que es utilizada para obtener todas las entidades que
     * actualmente est&aacute;n asociadas al contexto de la aplicaci&oacute;n.
     * Gracias a esta entidad se podr&aacute;n obtener todos aquellos valores de
     * entidades que pueden ser inyectadas en diversos procesos del aplicativo.
     */
    @Context()
    private ServletContext context;

    /**
     * Constructor p&uacute;blico que permite generaci&oacute;n de instancias de
     * esta clase. De es modo, crea un nuevo servicio web orientado a los
     * m&eacute;todos que pueden realizarse sobre la entidad {@code Billboard} y
     * que son expuestas para que sean consumidas por un cliente.
     */
    public BillboardWebServiceImpl() {
        super();
    }

    /**
     * M&eacute;todo para obtener el valor actualmente definido para el atributo
     * que define la instancia que expone todo el acceso a los m&eacute;todos
     * definidos para la persistencia de los datos para la entidad
     * {@code Billbard}.
     *
     * @return Instancia que representa el valor para acceder a todos los
     * m&eacute;todos de persistencia definidos para la entidad
     * {@code Billboard}.
     */
    public IBillboardDAO getBillboardDAO() {

        return (this.billboardDAO);
    }

    /**
     * M&eacute;todo para establecer el valor que se definir&aacute; para el
     * atributo que dispone la instancia que expone todo el acceso a los
     * m&eacute;todos definidos para la persistencia de los datos para la
     * entidad {@code Billboard}.
     *
     * @param billboardDAO Instancia que representa el nuevo valor para acceder
     * a todos los m&eacute;todos de persistencia definidos para la entidad
     * {@code Billboard}.
     */
    public void setBillboardDAO(IBillboardDAO billboardDAO) {
        this.billboardDAO = billboardDAO;
    }

    @Consumes(value = {MediaType.APPLICATION_JSON})
    @GET()
    @Override()
    @Path(value = RESTfulWebServiceContract.BillboardWebService.FIND_BILLBOARDS_BY_THEATER_PATH)
    @Produces(value = {MediaType.APPLICATION_JSON})
    public List<Billboard> findBillboardsByTheater(
            @QueryParam(value = RESTfulWebServiceContract.BillboardWebService.CITY_CODE_PARAM) String cityCode,
            @QueryParam(value = RESTfulWebServiceContract.BillboardWebService.THEATER_PARAM) String theater) {
        WebApplicationContext applicationContext = WebApplicationContextUtils.
                getRequiredWebApplicationContext(this.context);
        this.setBillboardDAO(applicationContext.getBean(IBillboardDAO.class));

        List<Billboard> billboardsList = new ArrayList<>();

        if (!(TextUtil.isEmpty(cityCode)) && !(TextUtil.isEmpty(theater))) {
            try {
                billboardsList = this.getBillboardDAO().findByTheater(
                        new TheaterPK(cityCode, theater));
            } catch (CinemaPersistenceException ex) {
                Logger.getLogger(TAG).log(Level.SEVERE, null, ex);
            }
        }

        return ((billboardsList.isEmpty()) ? null : billboardsList);
    }
}
