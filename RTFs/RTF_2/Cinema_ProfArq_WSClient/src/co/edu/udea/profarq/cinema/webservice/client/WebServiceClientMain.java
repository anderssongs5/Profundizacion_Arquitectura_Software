package co.edu.udea.profarq.cinema.webservice.client;

import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class WebServiceClientMain {

    public static void main(String[] args) {
        List<Theater> theaters;
        theaters = findTheatersByCity("05001");
        for(Theater theater:theaters){
            System.out.println(theater.getTheaterPK().getTheater());
        }
    }

    private static List<Theater> findTheatersByCity(String city) {
        TheaterWebServiceImpl_Service service = new TheaterWebServiceImpl_Service();
        TheaterWebServiceImpl port = service.getTheaterWebServiceImplPort();
        return port.findTheatersByCity(city);
    }
}
