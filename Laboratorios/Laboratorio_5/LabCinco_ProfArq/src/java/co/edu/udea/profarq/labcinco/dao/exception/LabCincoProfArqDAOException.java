package co.edu.udea.profarq.labcinco.dao.exception;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class LabCincoProfArqDAOException extends Exception {

    public LabCincoProfArqDAOException() {
        super();
    }

    public LabCincoProfArqDAOException(String message) {
        super(message);
    }

    public LabCincoProfArqDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public LabCincoProfArqDAOException(Throwable cause) {
        super(cause);
    }

    public LabCincoProfArqDAOException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
