package co.edu.udea.profarq.cinema.webservice.soap.contract;

/**
 * Clase que contiene las constantes, nombres de operaciones y nombres
 * &uacute;nicos a ser asignados o usados durante la construcci&oacute;n del
 * Servicio Web <b>S.O.A.P.</b>.
 * <p>
 * Los valores aqu&iacute; contenidos ser&aacute;n usados para definir los
 * nombres de los par&aacute;metros enviados a los m&eacute;todos que exponene
 * los diversos recursos del Servicio Web. Por otro lado, se definen los nombres
 * &uacute;nicos de las operaciones o funciones que ser&aacute;n usadas para
 * definir las operaciones &uacute;nica de todos los mensajes definidos para
 * todos los m&eacute;todos del Servicio Web asociados a las diversas entidades
 * a ser gestionadas.
 * <p>
 * Esta clase contiene internamente otras clases est&aacute;ticas que
 * definir&aacute;n las constantes o valores est&aacute;ticos y &uacute;nicos
 * por cada entidad o instancia a ser gestionada por medio de los Servicios Web
 * S.O.A.P.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public final class SOAPWebServiceContract {

    /**
     * Constructor privado para evitar la construcci&oacute;n o
     * generaci&oacute;n de instancias de esta clase. De es modo, se evita la
     * instanciaci&oacute;n innecesaria e in&uacute;til de objetos de esta
     * clase.
     */
    private SOAPWebServiceContract() {
        super();
    }

    /**
     * Clase que contiene las constantes, nombres de las funciones y nombres
     * &uacute;nicos a ser asignados o usados durante la construcci&oacute;n del
     * Servicio Web <b>S.O.A.P.</b> asociado a la entidad {@code Theater} y a
     * sus funciones o mensajes a ser expuestos.
     * <p>
     * Esta clase define todos los nombres &uacute;nicos a ser asigandos por
     * cada uno de los m&eacute;todos o funciones que ser&aacute;n implementados
     * para el Servicio Web referente a la entidad que modela los Teatros o
     * salas del Cinema. Por otro lado, la clase ofrece un acceso fiable a los
     * nombres de los par&aacute;metros a ser usados durante las diversas
     * peticiones realizadas a las operaciones del Servicio Web.
     *
     * @author Andersson Garc&iacute;a Sotelo
     * @author Miguel &Aacute;ngel Ossa Ruiz
     * @author Neiber Padierna P&eacute;rez
     */
    public static final class TheaterWebService {

        /**
         * Constante est&aacute;tica que define el nombre de par&aacute;metro a
         * ser usado cuando se van a invocar m&eacute;todos o mensajes
         * relacionados con el c&oacute;digo de una Ciudad en particular.
         * <p>
         * Esta constante deber&aacute; ser utilizada &uacute;nicamente para el
         * nombramiento de los par&aacute;metros a ser usados en las funciones,
         * ya que no define el nombre de alg&uacute;n m&eacute;todo o recurso
         * expuesto por el Servicio Web.
         */
        public static final String CITY_WEB_PARAM_NAME = "cityCode";

        /**
         * Constante est&aacute;tica que define el nombre de una funci&oacute;n
         * o m&eacute;todo a ser usado cuando se van a invocar procedimientos o
         * funciones relacionadas con la obtenci&oacute;n de informaci&oacute;n
         * asociada a la entidad {@code Theater}, la cual modela los Teatros o
         * salas de cine asociadas al Cinema.
         * <p>
         * Esta constante deber&aacute; ser utilizada &uacute;nicamente para el
         * nombramiento de los m&eacute;todos o funciones, ya que no define el
         * nombre de alg&uacute;n par&aacute;metro a ser usado por alguna
         * funci&oacute;n del Servicio Web.
         */
        public static final String FIND_THEATERS_BY_CITY_OPERATION = "findTheatersByCity";
        /**
         * Constante est&aacute;tica que define el nombre del Servicio Web que
         * gestionar&aacute; los m&eacute;todos o procedimientos asociados a la
         * entidad {@code Theater}, la cual modela los Teatros o salas de cine
         * asociadas al Cinema.
         * <p>
         * Esta constante deber&aacute; ser utilizada &uacute;nicamente para
         * nombrar el Servicio Web a ser construido e implementado, ya que no
         * define el nombre de alg&uacute;n par&aacute;metro o funci&oacute;n a
         * ser utilizado durante el desarrollo del Servicio Web como tal.
         */
        public static final String WEB_SERVICE_NAME = "TheaterWebServiceImpl";

        /**
         * Constructor privado para evitar la construcci&oacute;n o
         * generaci&oacute;n de instancias de esta clase. De es modo, se evita
         * la instanciaci&oacute;n innecesaria e in&uacute;til de objetos de
         * esta clase.
         */
        private TheaterWebService() {
            super();
        }
    }
}
