package co.edu.udea.profarq.labtres.persistence.dao.impl;

import co.edu.udea.profarq.labtres.model.entities.Movie;
import co.edu.udea.profarq.labtres.persistence.dao.IMovieDAO;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class MovieDAOImpl implements IMovieDAO {

    private static IMovieDAO instance;
    private final DBCollection collection;
    public static final Map<String, String> INEQUALITIES = new HashMap<>();

    private static final String TITLE = "title";

    static {
        INEQUALITIES.put("<", "$lt");
        INEQUALITIES.put("<=", "$lte");
        INEQUALITIES.put(">", "$gt");
        INEQUALITIES.put(">=", "$gte");
        INEQUALITIES.put("!=", "$ne");
    }

    private MovieDAOImpl() throws UnknownHostException {
        this.collection = MongoDBConnector.connect();
    }

    public static synchronized IMovieDAO getInstance() throws UnknownHostException {
        if (instance == null) {
            instance = new MovieDAOImpl();
        }

        return (instance);
    }

    @Override
    public Movie find(String title) {
        BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.put(TITLE, title);
        DBCursor dbCursor = this.collection.find(basicDBObject);

        return (Movie.fromDBObject(dbCursor.one()));
    }

    @Override
    public List<Movie> findAll() {
        List<Movie> moviesList = new ArrayList<>();
        DBCursor dbCursor = this.collection.find();

        for (DBObject dbo : dbCursor) {
            moviesList.add(Movie.fromDBObject(dbo));
        }

        return (moviesList);
    }

    @Override
    public boolean insert(Movie movie) {
        BasicDBObject basicDBObject = movie.toDBObject();
        WriteResult wr = this.collection.insert(basicDBObject);

        return (wr.getField("ok").equals(Double.valueOf("1.0")));
    }

    @Override
    public Movie update(Movie movie) {
        BasicDBObject searchingBasicDBObject = new BasicDBObject(TITLE,
                movie.getTitle());
        BasicDBObject updatingBasicDBObject = new BasicDBObject("$set",
                movie.toDBObject());

        WriteResult wr = this.collection.update(searchingBasicDBObject,
                updatingBasicDBObject, false, true);

        return ((wr.getN() != 0) ? movie : null);
    }

    @Override
    public boolean delete(Movie movie) {
        WriteResult wr = this.collection.remove(new BasicDBObject(
                TITLE, movie.getTitle()));

        return (wr.getN() == 1);
    }

    @Override
    public List<Movie> findByInequality(String inequality, int duration) {
        List<Movie> moviesList = new ArrayList<>();
        DBObject dbObject = new BasicDBObject("duration",
                new BasicDBObject(INEQUALITIES.get(inequality), duration));
        DBCursor dbCursor = this.collection.find(dbObject);

        for (DBObject dbo : dbCursor) {
            moviesList.add(Movie.fromDBObject(dbo));
        }

        return (moviesList);
    }
}
