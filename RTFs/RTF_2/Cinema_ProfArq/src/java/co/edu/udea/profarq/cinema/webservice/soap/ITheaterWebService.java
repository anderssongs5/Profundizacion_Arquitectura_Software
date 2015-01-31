package co.edu.udea.profarq.cinema.webservice.soap;

import co.edu.udea.profarq.cinema.model.entities.Theater;
import java.util.List;

/**
 * Interfaz que expone un Servicio Web para ser ejecutado a trav&eacute;s de la
 * tecnolog&iacute;a <b>S.O.A.P</b>, el cual es un protocolo orientado a
 * mensajes de Servicios Web y definido por el acceso o peticiones a funciones o
 * m&eacute;todos de un Servicio.
 * <p>
 * La funci&oacute;n de esta interfaz es definir las firmas de los
 * m&eacute;todos que deber&aacute;n ser implementados para ofrecer el acceso a
 * las funciones destinadas u orientadas al manejo de las entidades
 * {@code Theater}, la cual representa los Teatros o sedes del Cinema ubicados
 * en diversos lugares o ciudades.
 * <p>
 * Al ser un Servicio Web a trav&eacute;s de S.O.A.P., todos los m&eacute;todos
 * o funciones aqu&iacute; definidas est&aacute;n orientadas al acceso de o
 * invocaci&oacute;n de m&eacute;todos o funciones relacionados con la
 * l&oacute;gica de la aplicaci&oacute;n y los procesos del negocio del Cinema.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface ITheaterWebService {

    /**
     * M&eacute;todo o funci&oacute;n del Servicio Web que expone una punto de
     * invocaci&oacute;n al m&eacute;todo o procesos relacionados con las
     * instancias o entidades {@code Theater}, las cuales representan los
     * Teatros ubicados en cierta Ciudad de inter&eacute;s.
     * <p>
     * El m&eacute;todo retorna una lista de objetos que definen los Teatros
     * activos en cierta Ciudad, y los retorna como recurso en caso de encontrar
     * valores en el repositorio de datos asociado a la aplicacio&acute;n. En el
     * caso que no hayan registros asociados y encontrados, el m&eacute;todo o
     * funci&oacute;n devolver&aacute; una lista vac&iacute;a sin datos
     * espectivos.
     *
     * @param cityCode Objeto que representa el c&oacute;digo de la Ciudad en la
     * cual se desea efectuar la b&uacute;squeda de sus Teatros o localidadas.
     * @return Lista que contiene toda la informaci&oacute;n de los Teatros
     * encontrados exitosamente en la Ciudad de inter&eacute;s.
     */
    public List<Theater> findTheatersByCity(String cityCode);
}
