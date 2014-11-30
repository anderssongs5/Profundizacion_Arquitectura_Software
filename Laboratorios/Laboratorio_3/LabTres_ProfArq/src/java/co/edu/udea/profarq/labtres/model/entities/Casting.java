package co.edu.udea.profarq.labtres.model.entities;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.Objects;
import javax.enterprise.inject.Model;
import javax.validation.constraints.Size;

@Model()
public class Casting {

    private static String FULL_NAME = "fullName";

    @Size(max = 55, min = 3)
    private String fullName;

    public Casting() {
        super();
    }

    public Casting(String fullName) {
        this.fullName = fullName;
    }

    public static Casting fromDBObject(DBObject dbObject) {
        Casting casting = new Casting();

        casting.setFullName((String) dbObject.get(FULL_NAME));

        return (casting);
    }

    public BasicDBObject toDBObject() {
        BasicDBObject basicDBObject = new BasicDBObject();

        basicDBObject.put(FULL_NAME, this.getFullName());

        return (basicDBObject);
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override()
    public int hashCode() {
        int hash = 7;

        hash = 43 * hash + Objects.hashCode(this.fullName);

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

        final Casting other = (Casting) obj;
        if (!Objects.equals(this.fullName, other.fullName)) {

            return false;
        }

        return true;
    }

    @Override()
    public String toString() {

        return "Casting{" + "fullName=" + fullName + '}';
    }
}
