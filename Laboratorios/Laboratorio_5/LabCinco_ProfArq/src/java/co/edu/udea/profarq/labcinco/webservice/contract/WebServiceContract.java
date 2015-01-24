package co.edu.udea.profarq.labcinco.webservice.contract;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public final class WebServiceContract {

    private WebServiceContract() {
        super();
    }

    public static final class ProductWebServiceContract {

        /*
         * Parameters
         */
        public static final String PRODUCT_ID_PARAM = "productId";

        /*
         * Web Service
         */
        public static final String DELETE_OPERATION_NAME = "delete";
        public static final String FIND_OPERATION_NAME = "find";
        public static final String FIND_ALL_OPERATION_NAME = "findAll";
        public static final String SAVE_OPERATION_NAME = "save";
        public static final String UPDATE_OPERATION_NAME = "update";
        public static final String WEB_SERVICE_NAME = "ProductWebService";

        private ProductWebServiceContract() {
            super();
        }
    }
}
