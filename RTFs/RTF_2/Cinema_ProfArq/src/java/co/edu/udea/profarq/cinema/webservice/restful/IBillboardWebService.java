package co.edu.udea.profarq.cinema.webservice.restful;

import co.edu.udea.profarq.cinema.model.entities.Billboard;
import java.util.List;

/**
 * Interfaz que expone un Servicio Web para ser ejecutado a trav&eacute;s de la
 * tecnolog&iacute;a <b>RESTful</b>, la cual es una arquitectura orientada a
 * Servicios Web y definidas por el acceso o peticiones a recursos de un
 * Servicio.
 * <p>
 * La funci&oacute;n de esta interfaz es definir las firmas de los
 * m&eacute;todos que deber&aacute;n ser implementados para ofrecer el acceso a
 * los Recursos destinados u orientados al manejo de las entidades
 * {@code Billboard}, la cual representa las Carteleras activas de ciertas
 * pel&iacute;culas en los diversos Teatros o sedes del Cinema.
 * <p>
 * Al ser un Servicio Web a trav&eacute;s de RESTful, todos los m&eacute;todos o
 * funciones aqu&iacute; definidas est&aacute;n orientadas al acceso de recursos
 * y relacionados directamente con los m&eacute;todos <b>HTTP</b>.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IBillboardWebService {

    /**
     * M&eacute;todo o funci&oacute;n del Servicio Web que expone una punto de
     * acceso al recurso {@code Billboard} asociado a cierto Teatro ubicado en
     * cierta Ciudad de inter&eacute;s para la consulta.
     * <p>
     * El m&eacute;todo retorna una lista de objetos que definen las Carteleras
     * activas en cierto Teatro y las retorna como recurso en caso de encontrar
     * valores en el repositorio de datos asociado a la aplicacio&acute;n. En el
     * caso que no hayan registros asociados y encontrados, el m&eacute;todo o
     * funci&oacute;n devolver&aacute; una lista vac&iacute;a sin datos
     * espectivos.
     *
     * @param cityCode Objeto que representa el c&oacute;digo de la Ciudad en la
     * cual se encuentra ubicado el Teatro de inter&eacute;s.
     * @param theater Objeto que representa el nombre del Teatro al cual se le
     * desea buscar la informaci&oacute;n de sus Carteleras.
     * @return Lista que contiene toda la informaci&oacute;n de las Carteleras
     * encontradas exitosamente en el Teatro de inter&eacute;s.
     */
    public List<Billboard> findBillboardsByTheater(String cityCode,
            String theater);
}
