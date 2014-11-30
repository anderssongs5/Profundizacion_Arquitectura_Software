package co.edu.udea.profarq.labtres.model.entities;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.Objects;
import javax.enterprise.inject.Model;
import javax.validation.constraints.Size;

@Model()
public class Genre {

    private static String GENRE = "genre";

    @Size(max = 35, min = 3)
    private String genre;

    public Genre() {
        super();
    }

    public Genre(String genere) {
        this.genre = genere;
    }

    public static Genre fromDBObject(DBObject dbObject) {
        Genre genre = new Genre();

        genre.setGenre((String) dbObject.get(GENRE));

        return (genre);
    }

    public BasicDBObject toDBObject() {
        BasicDBObject basicDBObject = new BasicDBObject();

        basicDBObject.put(GENRE, this.getGenre());

        return (basicDBObject);
    }

    public String getGenre() {

        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override()
    public int hashCode() {
        int hash = 3;

        hash = 73 * hash + Objects.hashCode(this.genre);

        return hash;
    }

    @Override()
    public boolean equals(Object obj) {
        if (obj == null) {

            return false;
        }

        if (getClass() != obj.getClass()) {

            return false;
        }

        final Genre other = (Genre) obj;
        if (!Objects.equals(this.genre, other.genre)) {

            return false;
        }

        return true;
    }

    @Override()
    public String toString() {

        return "Genre{" + "genere=" + genre + '}';
    }
}
