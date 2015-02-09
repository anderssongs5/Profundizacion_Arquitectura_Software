package co.edu.udea.profarq.labseis.dao.exception;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class LabSeisProfArqDAOException extends Exception {

    public LabSeisProfArqDAOException() {
        super();
    }

    public LabSeisProfArqDAOException(String message) {
        super(message);
    }

    public LabSeisProfArqDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public LabSeisProfArqDAOException(Throwable cause) {
        super(cause);
    }

    public LabSeisProfArqDAOException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}