package co.edu.udea.profarq.cinema.webservice.soap.impl;

import co.edu.udea.profarq.cinema.model.entities.City;
import co.edu.udea.profarq.cinema.model.entities.Theater;
import co.edu.udea.profarq.cinema.webservice.soap.contract.ITheaterWebService;
import co.edu.udea.profarq.cinema.webservice.soap.contract.SOAPWebServiceContract;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@WebService(
        serviceName = SOAPWebServiceContract.TheaterWebService.WEB_SERVICE_NAME)
public final class TheaterWebServiceImpl implements ITheaterWebService {

    public TheaterWebServiceImpl() {
        super();
    }

    @Override()
    @WebMethod(
            operationName = SOAPWebServiceContract.TheaterWebService.FIND_THEATERS_BY_CITY_OPERATION)
    public List<Theater> findTheatersByCity(
            @WebParam(name = SOAPWebServiceContract.TheaterWebService.CITY_WEB_PARAM_NAME) City city) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
