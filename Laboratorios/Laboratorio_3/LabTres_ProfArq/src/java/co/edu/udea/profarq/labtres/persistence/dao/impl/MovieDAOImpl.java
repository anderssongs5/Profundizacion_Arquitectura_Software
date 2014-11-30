package co.edu.udea.profarq.labtres.persistence.dao.impl;

import co.edu.udea.profarq.labtres.model.entities.Movie;
import co.edu.udea.profarq.labtres.persistence.dao.IMovieDAO;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.WriteResult;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class MovieDAOImpl implements IMovieDAO {

    private static IMovieDAO instance;
    private final DBCollection collection;

    private static final String TITLE = "title";
    private static final String RELEASE_DATE = "releaseDate";
    private static final String SYNOPSIS = "synopsis";
    private static final String PSEUDONYM = "pseudonym";
    private static final String LANGUAGE = "language";
    private static final String COUNTRY = "country";
    private static final String CLASSIFICATION = "classification";
    private static final String DIRECTOR = "director";
    private static final String DURATION = "duration";

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

        dbCursor.toArray().stream().forEach((dbo) -> {
            moviesList.add(Movie.fromDBObject(dbo));
        });

        return (moviesList);
    }

    @Override
    public void insert(Movie movie) {
        BasicDBObject basicDBObject = movie.toDBObject();
        WriteResult wr = this.collection.insert(basicDBObject);
    }

    @Override
    public Movie update(Movie movie) {
        BasicDBObject searchingBasicDBObject = new BasicDBObject(TITLE,
                movie.getTitle());
        BasicDBObject updatingBasicDBObject = new BasicDBObject("$set",
                movie.toDBObject());

        WriteResult wr = this.collection.update(searchingBasicDBObject,
                updatingBasicDBObject, false, true);

        return (movie);
    }

    @Override
    public void delete(Movie movie) {

        WriteResult wr = this.collection.remove(movie.toDBObject());
    }
}
