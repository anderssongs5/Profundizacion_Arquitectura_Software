package co.edu.udea.profarq.cinema.webservice.soap.impl;

import co.edu.udea.profarq.cinema.model.entities.City;
import co.edu.udea.profarq.cinema.model.entities.Theater;
import co.edu.udea.profarq.cinema.model.entities.TheaterPK;
import co.edu.udea.profarq.cinema.persistence.dao.ITheaterDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import co.edu.udea.profarq.cinema.util.TextUtil;
import co.edu.udea.profarq.cinema.webservice.soap.ITheaterWebService;
import co.edu.udea.profarq.cinema.webservice.soap.contract.SOAPWebServiceContract;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Clase que implementa una interfaz, la cual le provee un Servicio Web para ser
 * ejecutado a trav&eacute;s de la tecnolog&iacute;a <b>S.O.A.P</b>, permitiendo
 * en este caso el paso de mensajes entre dos o más sistemas.
 * <p>
 * La funci&oacute;n de esta clase es implementar los m&eacute;todos expuestos
 * por la interfaz de manera que ofrezcan el acceso a las funciones orientadas
 * al manejo de la entidad {@code Theater}.
 * <p>
 * Al ser un Servicio Web a trav&eacute;s de S.O.A.P., todos los m&eacute;todos
 * o funciones aqu&iacute; implementadas est&aacute;n orientadas al acceso o
 * invocaci&oacute;n de m&eacute;todos o funciones relacionados con la
 * l&oacute;gica de la aplicaci&oacute;n y los procesos del negocio del Cinema
 * orientados al manejo de la entidad {@code Theater}.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@WebService(
        serviceName = SOAPWebServiceContract.TheaterWebService.WEB_SERVICE_NAME)
@XmlSeeAlso(value = {City.class, Theater.class, TheaterPK.class})
public final class TheaterWebServiceImpl implements ITheaterWebService {

    /**
     * Variable global final est&aacute;tica que representa un tag que
     * identifica la clase, de manera que pueda ser identificada en diversos
     * procesos que se lleven a cabo dentro de la aplicaci&oacute;n.
     */
    private static final String TAG = TheaterWebServiceImpl.class.getName();

    /**
     * Entidad inyectada que es utilizada para el manejo a nivel de la capa de
     * persistencia en la aplicaci&oacute;n orientada a cada una de las
     * operaciones que puedan realizarse sobre la entidad {@code Theater}.
     */
    @Autowired()
    private ITheaterDAO theaterDAO;

    /**
     * Constructor p&uacute;blico que permite generaci&oacute;n de instancias de
     * esta clase. De es modo, crea un nuevo servicio web orientado a las
     * operaciones que pueden realizarse sobre la entidad {@code Theater} y que
     * son expuestas para que sean consumidas por un cliente.
     */
    public TheaterWebServiceImpl() {
        super();
    }

    /**
     * M&eacute;todo que se llama desde el constructor del Objeto, de forma que
     * todo el contenido alojado en el interior de este m&eacute;todo es llamado
     * una vez, cuando la clase es instanciada, es decir que cada que se
     * instanc&iacute;a esta clase el m&eacute;todo init es llamado.
     */
    @PostConstruct()
    @WebMethod(exclude = true)
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    /**
     * M&eacute;todo que permite obtener una instancia de la clase
     * {@code TheaterDAO} para permitir de esta manera realizar cada una de las
     * operaciones que tengan que ver con la entidad {@code Theater} y sus
     * funciones en la capa de persistencia.
     *
     * @return Interfaz que representa las operaciones a nivel de la capa de
     * persistencia que pueden realizarse sobre la entidad {@code Theater}.
     */
    @WebMethod(exclude = true)
    public ITheaterDAO getTheaterDAO() {

        return (this.theaterDAO);
    }

    /**
     * M&eacute;todo que permite asignar una nueva instancia de la clase
     * {@code TheaterDAO} para permitir de esta manera realizar cada una de las
     * operaciones que tengan que ver con la entidad {@code Theater} y sus
     * funciones en la capa de persistencia.
     *
     * @param theaterDAO Interfaz que representa las operaciones a nivel de la
     * capa de persistencia que pueden realizarse sobre la entidad
     * {@code Theater}.
     */
    @WebMethod(exclude = true)
    public void setTheaterDAO(ITheaterDAO theaterDAO) {
        this.theaterDAO = theaterDAO;
    }

    /**
     * M&eacute;todo o funci&oacute;n del Servicio Web que implementa un punto
     * de invocaci&oacute;n al m&eacute;todo o proceso relacionados con las
     * instancias o entidades {@code Theater}, las cuales representan los
     * Teatros ubicados en cierta Ciudad de inter&eacute;s.
     * <p>
     * El m&eacute;todo retorna una lista de objetos que definen los Teatros
     * activos en cierta Ciudad, y los retorna como recurso en caso de encontrar
     * valores en el repositorio de datos asociado a la aplicacio&acute;n. En el
     * caso que no hayan registros asociados y encontrados, el m&eacute;todo o
     * funci&oacute;n devolver&aacute; una lista vac&iacute;a sin datos.
     *
     * @param cityCode Objeto que representa el c&oacute;digo de la Ciudad en la
     * cual se desea efectuar la b&uacute;squeda de sus Teatros o localidadas.
     * @return Lista que contiene toda la informaci&oacute;n de los Teatros
     * encontrados exitosamente en la Ciudad de inter&eacute;s.
     */
    @Override()
    @WebMethod(
            operationName = SOAPWebServiceContract.TheaterWebService.FIND_THEATERS_BY_CITY_OPERATION)
    public List<Theater> findTheatersByCity(
            @WebParam(name = SOAPWebServiceContract.TheaterWebService.CITY_WEB_PARAM_NAME) String cityCode) {
        List<Theater> theatersList = null;

        if (!TextUtil.isEmpty(cityCode)) {
            try {
                theatersList = this.getTheaterDAO().findByCity(cityCode);

                if (theatersList != null) {
                    for (Theater theater : theatersList) {
                        theater.setBillboardList(null);
                    }
                }
            } catch (CinemaPersistenceException ex) {
                Logger.getLogger(TAG).log(Level.SEVERE, null, ex);
            }
        }

        return (theatersList);
    }
}
