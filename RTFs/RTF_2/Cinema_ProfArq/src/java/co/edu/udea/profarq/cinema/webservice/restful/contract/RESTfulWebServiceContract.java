package co.edu.udea.profarq.cinema.webservice.restful.contract;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public final class RESTfulWebServiceContract {

    private RESTfulWebServiceContract() {
        super();
    }

    public static final class BillboardWebService {

        /*
         * Web Service Query Parameters
         */
        public static final String CITY_CODE_PARAM = "cityCode";
        public static final String THEATER_PARAM = "theater";
        
        /*
         * Web Service Paths
         */
        public static final String ROOT_PATH = "billboard";
        public static final String FIND_BILLBOARDS_BY_THEATER_PATH = "theater";

        private BillboardWebService() {
            super();
        }
    }
}
