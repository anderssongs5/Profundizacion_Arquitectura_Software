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
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@WebService(
        serviceName = SOAPWebServiceContract.TheaterWebService.WEB_SERVICE_NAME)
@XmlSeeAlso(value = {City.class, Theater.class, TheaterPK.class})
public final class TheaterWebServiceImpl implements ITheaterWebService {

    private static final String TAG = TheaterWebServiceImpl.class.getName();

    @Autowired()
    private ITheaterDAO theaterDAO;

    public TheaterWebServiceImpl() {
        super();
    }

    @PostConstruct()
    @WebMethod(exclude = true)
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @WebMethod(exclude = true)
    public ITheaterDAO getTheaterDAO() {

        return (this.theaterDAO);
    }

    @WebMethod(exclude = true)
    public void setTheaterDAO(ITheaterDAO theaterDAO) {
        this.theaterDAO = theaterDAO;
    }

    @Override()
    @WebMethod(
            operationName = SOAPWebServiceContract.TheaterWebService.FIND_THEATERS_BY_CITY_OPERATION)
    public List<Theater> findTheatersByCity(
            @WebParam(name = SOAPWebServiceContract.TheaterWebService.CITY_WEB_PARAM_NAME) String cityCode) {
        List<Theater> theatersList = null;

        if (!TextUtil.isEmpty(cityCode)) {
            try {
                // TODO: Esto no es.
                theatersList = this.getTheaterDAO().findAll();

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
