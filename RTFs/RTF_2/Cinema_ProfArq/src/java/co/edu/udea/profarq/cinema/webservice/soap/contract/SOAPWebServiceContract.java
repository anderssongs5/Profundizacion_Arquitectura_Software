package co.edu.udea.profarq.cinema.webservice.soap.contract;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public final class SOAPWebServiceContract {

    private SOAPWebServiceContract() {
        super();
    }

    public static final class TheaterWebService {

        /*
         * Web Service Operations Parameters Names
         */
        public static final String CITY_WEB_PARAM_NAME = "city";
        
        /*
         * Web Service Definition
         */
        public static final String FIND_THEATERS_BY_CITY_OPERATION = "findTheatersByCity";
        public static final String WEB_SERVICE_NAME = "TheaterWebServiceImpl";

        private TheaterWebService() {
            super();
        }
    }
}
