package co.edu.udea.profarq.cinema.controller.exception;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CinemaBusinessException extends Throwable {

    private static final long serialVersionUID = -2263769641743234323L;

    public CinemaBusinessException() {
        super();
    }

    public CinemaBusinessException(String message) {
        super(message);
    }

    public CinemaBusinessException(Throwable cause) {
        super(cause);
    }

    public CinemaBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public CinemaBusinessException(String message,
            Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
