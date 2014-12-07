import co.edu.udea.profarq.labtres.model.entities.Casting;
import co.edu.udea.profarq.labtres.model.entities.Genre;
import co.edu.udea.profarq.labtres.model.entities.Movie;
import co.edu.udea.profarq.labtres.persistence.dao.IMovieDAO;
import co.edu.udea.profarq.labtres.persistence.dao.impl.MovieDAOImpl;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            IMovieDAO movieDAO = MovieDAOImpl.getInstance();

//            Movie movie = movieDAO.find("THE HUNGER GAMES: MOCKINGJAY PART 1");
//            System.out.println("Movie: " + movie.toString());
//            
//            List<Movie> moviesList = movieDAO.findAll();
//            moviesList.stream().forEach((movie) -> {
//                System.out.println("Movie: " + movie.toString());
//            });
            
            List<Genre> genresList
                    = Arrays.asList(new Genre("Oelo1"), new Genre("Oelo2"));
            List<Casting> castingsList
                    = Arrays.asList(new Casting("Oelo1.1"), new Casting("Oelo2.2"));

            Movie movie = new Movie("title", "Neiber", "synopsis", "pseudonym",
                    "language", "country", "Luismi", "director", 25,
                    genresList, castingsList);
            movieDAO.insert(movie);
//            movieDAO.update(movie);
            movieDAO.delete(movie);
            
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
