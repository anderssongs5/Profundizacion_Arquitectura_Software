package co.edu.udea.profarq.cinema.webservice.restful.contract;

/**
 * Clase que contiene las constantes, rutas y nombres &uacute;nicos a ser
 * asignados o usados durante la construcci&oacute;n del Servicio Web
 * <b>RESTful</b>.
 * <p>
 * Los valores aqu&iacute; contenidos ser&aacute;n usados para definir los
 * nombres de los par&aacute;metros enviados a los m&eacute;todos que exponene
 * los diversos recursos del Servicio Web. Por otro lado, se definen las rutas o
 * <i>paths</i> que ser&aacute;n usados para definir la localizaci&oacute;n
 * &uacute;nica de todos los recursos definidos para todos los m&eacute;todos
 * del Servicio Web asociados a las diversas entidades a ser gestionadas.
 * <p>
 * Esta clase contiene internamente otras clases est&aacute;ticas que
 * definir&aacute;n las constantes o valores est&aacute;ticos y &uacute;nicos
 * por cada entidad o instancia a ser gestionada por medio de los Servicios Web
 * RESTful.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public final class RESTfulWebServiceContract {

    /**
     * Constructor privado para evitar la construcci&oacute;n o
     * generaci&oacute;n de instancias de esta clase. De es modo, se evita la
     * instanciaci&oacute;n innecesaria e in&uacute;til de objetos de esta
     * clase.
     */
    private RESTfulWebServiceContract() {
        super();
    }

    /**
     * Clase que contiene las constantes, rutas y nombres &uacute;nicos a ser
     * asignados o usados durante la construcci&oacute;n del Servicio Web
     * <b>RESTful</b> asociado a la entidad {@code Billboard} y a sus recursos a
     * ser expuestos.
     * <p>
     * Esta clase define todos las rutas &uacute;nicas a ser asigandas por cada
     * uno de los m&eacute;todos o funciones que ser&aacute;n implementados para
     * el Servicio Web referente a la entidad que modela las Carteleras activas
     * en el Cinema. Por otro lado, la clase ofrece un acceso fiable a los
     * nombres de los par&aacute;metros a ser usados durante las diversas
     * peticiones realizadas a las operaciones del Servicio Web.
     *
     * @author Andersson Garc&iacute;a Sotelo
     * @author Miguel &Aacute;ngel Ossa Ruiz
     * @author Neiber Padierna P&eacute;rez
     */
    public static final class BillboardWebService {

        /**
         * Constante est&aacute;tica que define el nombre de par&aacute;metro a
         * ser usado cuando se van a invocar recursos o funciones relacionados
         * con el c&oacute;digo de una Ciudad en particular.
         * <p>
         * Esta constante deber&aacute; ser utilizada &uacute;nicamente para el
         * nombramiento de los par&aacute;metros a ser usados en las funciones,
         * ya que no define el nombre de alg&uacute;n m&eacute;todo o recurso
         * expuesto por el Servicio Web.
         */
        public static final String CITY_CODE_PARAM = "cityCode";
        /**
         * Constante est&aacute;tica que define el nombre de par&aacute;metro a
         * ser usado cuando se van a invocar recursos o funciones relacionados
         * con el nombre de un Teatro en particular.
         * <p>
         * Esta constante deber&aacute; ser utilizada &uacute;nicamente para el
         * nombramiento de los par&aacute;metros a ser usados en las funciones,
         * ya que no define el nombre de alg&uacute;n m&eacute;todo o recurso
         * expuesto por el Servicio Web.
         */
        public static final String THEATER_PARAM = "theater";

        /**
         * Constante est&aacute;tica que define el nombre de una ruta o
         * <i>path</i> a ser usada cuando se van a invocar recursos o funciones
         * relacionadas con la obtenci&oacute;n de informaci&oacute;n asociada a
         * la entidad {@code Billboard}, la cual modela las Carteleras asociadas
         * a los Teatros del Cinema.
         * <p>
         * Esta constante deber&aacute; ser utilizada &uacute;nicamente para el
         * nombramiento de las rutas a ser usados en las funciones, ya que no
         * define el nombre de alg&uacute;n par&aacute;metro a ser usado por
         * alguna funci&oacute;n del Servicio Web.
         */
        public static final String ROOT_PATH = "billboard";
        /**
         * Constante est&aacute;tica que define el nombre de una ruta o
         * <i>path</i> a ser usada cuando se van a invocar recursos o funciones
         * relacionadas con la obtenci&oacute;n de informaci&oacute;n asociada a
         * la entidad {@code Billboard}, pero requiriendo informaci&oacute;n
         * sobre el Teatro o entidad {@code Theater}.
         * <p>
         * Esta constante deber&aacute; ser utilizada &uacute;nicamente para el
         * nombramiento de las rutas a ser usados en las funciones, ya que no
         * define el nombre de alg&uacute;n par&aacute;metro a ser usado por
         * alguna funci&oacute;n del Servicio Web.
         */
        public static final String FIND_BILLBOARDS_BY_THEATER_PATH = "theater";

        /**
         * Constructor privado para evitar la construcci&oacute;n o
         * generaci&oacute;n de instancias de esta clase. De es modo, se evita
         * la instanciaci&oacute;n innecesaria e in&uacute;til de objetos de
         * esta clase.
         */
        private BillboardWebService() {
            super();
        }
    }
}
