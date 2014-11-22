package co.edu.udea.profarq.cinema.persistence.exception;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CinemaPersistenceException extends Throwable {

    public CinemaPersistenceException() {
        super();
    }

    public CinemaPersistenceException(String message) {
        super(message);
    }

    public CinemaPersistenceException(Throwable cause) {
        super(cause);
    }

    public CinemaPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public CinemaPersistenceException(String message,
            Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
