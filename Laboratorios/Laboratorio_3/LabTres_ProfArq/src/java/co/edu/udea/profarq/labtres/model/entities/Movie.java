package co.edu.udea.profarq.labtres.model.entities;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.enterprise.inject.Model;
import javax.validation.constraints.Size;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Model()
public class Movie implements Serializable {

    private static final long serialVersionUID = 4194165105741765585L;

    private static final String TITLE = "title";
    private static final String RELEASE_DATE = "releaseDate";
    private static final String SYNOPSIS = "synopsis";
    private static final String PSEUDONYM = "pseudonym";
    private static final String LANGUAGE = "language";
    private static final String COUNTRY = "country";
    private static final String CLASSIFICATION = "classification";
    private static final String DIRECTOR = "director";
    private static final String DURATION = "duration";
    private static final String GENRES_LIST = "genres";
    private static final String CASTING_LIST = "casting";

    @Size(max = 150, min = 5)
    private String title;
    @Size(max = 10, min = 10)
    private String releaseDate;
    @Size(max = 555)
    private String synopsis;
    @Size(max = 150, min = 3)
    private String pseudonym;
    @Size(max = 25, min = 3)
    private String language;
    @Size(max = 35, min = 3)
    private String country;
    @Size(max = 2, min = 2)
    private String classification;
    @Size(max = 55, min = 3)
    private String director;
    private int duration;
    private List<Genre> genresList;
    private List<Casting> castingsList;

    public Movie() {
        super();
    }

    public Movie(String title, String releaseDate, String synopsis,
            String pseudonym, String language, String country,
            String classification, String director, int duration,
            List<Genre> genresList, List<Casting> castingsList) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.synopsis = synopsis;
        this.pseudonym = pseudonym;
        this.language = language;
        this.country = country;
        this.classification = classification;
        this.director = director;
        this.duration = duration;
        this.genresList = genresList;
        this.castingsList = castingsList;
    }

    public static Movie fromDBObject(DBObject dbObject) {
        Movie movie = new Movie();

        movie.setTitle((String) dbObject.get(TITLE));
        movie.setReleaseDate((String) dbObject.get(RELEASE_DATE));
        movie.setSynopsis((String) dbObject.get(SYNOPSIS));
        movie.setPseudonym((String) dbObject.get(PSEUDONYM));
        movie.setLanguage((String) dbObject.get(LANGUAGE));
        movie.setCountry((String) dbObject.get(COUNTRY));
        movie.setClassification((String) dbObject.get(CLASSIFICATION));
        movie.setDirector((String) dbObject.get(DIRECTOR));
        movie.setDuration((Integer) dbObject.get(DURATION));

        BasicDBList basicDBList;

        if (dbObject.containsField(GENRES_LIST)) {
            basicDBList = (BasicDBList) dbObject.get(GENRES_LIST);
            movie.setGenresList(new ArrayList<>());
            for (Object object : basicDBList) {
                movie.getGenresList().add(Genre.fromDBObject((BasicDBObject) object));
            }
        }

        if (dbObject.containsField(CASTING_LIST)) {
            basicDBList = (BasicDBList) dbObject.get(CASTING_LIST);
            movie.setCastingsList(new ArrayList<>());
            for (Object object : basicDBList) {
                movie.getCastingsList().add(Casting.fromDBObject((BasicDBObject) object));
            }
        }

        return (movie);
    }

    public BasicDBObject toDBObject() {
        BasicDBObject basicDBObject = new BasicDBObject();
        BasicDBList basicDBList = new BasicDBList();

        basicDBObject.put(TITLE, this.getTitle());
        basicDBObject.put(RELEASE_DATE, this.getReleaseDate());
        basicDBObject.put(SYNOPSIS, this.getSynopsis());
        basicDBObject.put(PSEUDONYM, this.getPseudonym());
        basicDBObject.put(LANGUAGE, this.getLanguage());
        basicDBObject.put(COUNTRY, this.getCountry());
        basicDBObject.put(CLASSIFICATION, this.getClassification());
        basicDBObject.put(DURATION, this.getDuration());
        basicDBObject.put(DIRECTOR, this.getDirector());

        if (this.getGenresList() != null) {
            basicDBList.clear();

            for (Genre genre : this.getGenresList()) {
                basicDBList.add(genre.toDBObject());
            }

            basicDBObject.put(GENRES_LIST, basicDBList);
        }

        if (this.getCastingsList() != null) {
            basicDBList.clear();

            for (Casting casting : this.getCastingsList()) {
                basicDBList.add(casting.toDBObject());
            }

            basicDBObject.put(CASTING_LIST, basicDBList);
        }

        return (basicDBObject);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSynopsis() {

        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Genre> getGenresList() {
        return genresList;
    }

    public void setGenresList(List<Genre> genresList) {
        this.genresList = genresList;
    }

    public List<Casting> getCastingsList() {
        return castingsList;
    }

    public void setCastingsList(List<Casting> castingsList) {
        this.castingsList = castingsList;
    }

    @Override()
    public int hashCode() {
        int hash = 3;

        hash = 37 * hash + Objects.hashCode(this.title);
        hash = 37 * hash + Objects.hashCode(this.releaseDate);
        hash = 37 * hash + Objects.hashCode(this.synopsis);
        hash = 37 * hash + Objects.hashCode(this.pseudonym);
        hash = 37 * hash + Objects.hashCode(this.language);
        hash = 37 * hash + Objects.hashCode(this.country);
        hash = 37 * hash + Objects.hashCode(this.classification);
        hash = 37 * hash + Objects.hashCode(this.director);
        hash = 37 * hash + this.duration;

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

        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {

            return false;
        }

        if (!Objects.equals(this.releaseDate, other.releaseDate)) {

            return false;
        }

        if (!Objects.equals(this.synopsis, other.synopsis)) {

            return false;
        }

        if (!Objects.equals(this.pseudonym, other.pseudonym)) {

            return false;
        }

        if (!Objects.equals(this.language, other.language)) {

            return false;
        }

        if (!Objects.equals(this.country, other.country)) {

            return false;
        }

        if (!Objects.equals(this.classification, other.classification)) {

            return false;
        }

        if (!Objects.equals(this.director, other.director)) {

            return false;
        }

        if (this.duration != other.duration) {

            return false;
        }

        return true;
    }

    @Override()
    public String toString() {

        return "Movie{" + "title=" + title + ", releaseDate=" + releaseDate
                + ", synopsis=" + synopsis + ", pseudonym=" + pseudonym
                + ", language=" + language + ", country=" + country
                + ", classification=" + classification + ", director="
                + director + ", duration=" + duration + ", genresList="
                + genresList + ", castingsList=" + castingsList + '}';
    }
}
