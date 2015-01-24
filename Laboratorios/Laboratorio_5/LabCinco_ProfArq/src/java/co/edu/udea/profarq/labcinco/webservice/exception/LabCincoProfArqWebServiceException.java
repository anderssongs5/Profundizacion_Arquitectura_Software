package co.edu.udea.profarq.labcinco.webservice.exception;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class LabCincoProfArqWebServiceException extends Exception {

    public LabCincoProfArqWebServiceException() {
        super();
    }

    public LabCincoProfArqWebServiceException(String message) {
        super(message);
    }

    public LabCincoProfArqWebServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public LabCincoProfArqWebServiceException(Throwable cause) {
        super(cause);
    }

    public LabCincoProfArqWebServiceException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
