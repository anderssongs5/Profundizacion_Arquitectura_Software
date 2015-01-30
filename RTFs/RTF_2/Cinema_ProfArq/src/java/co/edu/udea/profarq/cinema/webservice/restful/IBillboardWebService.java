package co.edu.udea.profarq.cinema.webservice.restful;

import co.edu.udea.profarq.cinema.model.entities.Billboard;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IBillboardWebService {

    public List<Billboard> findBillboardsByTheater(String cityCode,
            String theater);
}
