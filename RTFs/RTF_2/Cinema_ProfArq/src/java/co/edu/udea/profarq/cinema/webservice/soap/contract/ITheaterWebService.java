package co.edu.udea.profarq.cinema.webservice.soap.contract;

import co.edu.udea.profarq.cinema.model.entities.City;
import co.edu.udea.profarq.cinema.model.entities.Theater;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface ITheaterWebService {

    public List<Theater> findTheatersByCity(City city);
}
