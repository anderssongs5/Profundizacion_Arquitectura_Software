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
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Path(value = RESTfulWebServiceContract.BillboardWebService.ROOT_PATH)
public final class BillboardWebServiceImpl implements IBillboardWebService {

    private static final String TAG = BillboardWebServiceImpl.class.getName();

    private IBillboardDAO billboardDAO;
    @Context()
    private ServletContext context;

    public BillboardWebServiceImpl() {
        super();
    }

    public IBillboardDAO getBillboardDAO() {

        return (this.billboardDAO);
    }

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
