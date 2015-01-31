package co.edu.udea.profarq.cinema.business.exception;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CinemaControllerException extends Throwable {

    private static final long serialVersionUID = -4157971079322174346L;

    public CinemaControllerException() {
        super();
    }

    public CinemaControllerException(String message) {
        super(message);
    }

    public CinemaControllerException(Throwable cause) {
        super(cause);
    }

    public CinemaControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CinemaControllerException(String message,
            Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
