package co.edu.udea.profarq.labtres.persistence.dao.impl;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
class MongoDBConnector {

    public static String SERVER = "localhost";
    public static int PORT = 27017;
    public static String DATA_BASE_NAME = "LabTres_ProfArq";
    public static String COLLECTION_NAME = "movies";

    private MongoDBConnector() {
        super();
    }

    public static DBCollection connect()
            throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(SERVER, PORT);
        DB db = mongoClient.getDB(DATA_BASE_NAME);
        DBCollection collection = db.getCollection(COLLECTION_NAME);
        if (collection == null) {
            collection = db.createCollection(COLLECTION_NAME, null);
        }

        return (collection);
    }
}
