package co.edu.udea.profarq.labcuatro.webservice.soap;

import co.edu.udea.profarq.labcuatro.business.Process;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@WebService(serviceName = "LabCuatroWebService")
public class LabCuatroWebService {

    @WebMethod(operationName = "convertCurrency")
    public Double convertCurrency(@WebParam(name = "sourceCurrency") String sourceCurrency,
            @WebParam(name = "targetCurrency") String targetCurrency,
            @WebParam(name = "amount") double amount) {

        return (Process.convertCurrency(sourceCurrency, targetCurrency, amount));
    }

    @WebMethod(operationName = "validateCreditCard")
    public String validateCreditCard(@WebParam(name = "creditCardNumber") String creditCardNumber,
            @WebParam(name = "ccvNumber") String ccvNumber,
            @WebParam(name = "expirationYear") int expirationYear,
            @WebParam(name = "expirationMonth") int expirationMonth) {

        return (Process.validateCreditCard(creditCardNumber, ccvNumber,
                expirationYear, expirationMonth));
    }
}
