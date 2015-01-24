package co.edu.udea.profarq.labcuatro.business;

import co.edu.udea.profarq.labcuatro.model.Currency;
import co.edu.udea.profarq.labcuatro.webservice.client.LabCuatroWebService;
import co.edu.udea.profarq.labcuatro.webservice.client.LabCuatroWebService_Service;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class Process {

    public static final Map<String, Currency> CURRENCY_LIST = new HashMap<>();

    static {
        CURRENCY_LIST.put("COP", new Currency("COP", "$", "Pesos colombianos"));
        CURRENCY_LIST.put("USD", new Currency("USD", "US$", "Dólares"));
        CURRENCY_LIST.put("EUR", new Currency("EUR", "€", "Euros"));
        CURRENCY_LIST.put("GBP", new Currency("GBP", "£", "Libras esterlinas"));
    }

    public static Double convertCurrency(String sourceCurrency,
            String targetCurrency, double amount) {
        LabCuatroWebService_Service service = new LabCuatroWebService_Service();
        LabCuatroWebService port = service.getLabCuatroWebServicePort();

        return (port.convertCurrency(sourceCurrency, targetCurrency, amount));
    }

    public static String validateCreditCard(String creditCardNumber,
            String ccvNumber, int expirationYear, int expirationMonth) {
        LabCuatroWebService_Service service = new LabCuatroWebService_Service();
        LabCuatroWebService port = service.getLabCuatroWebServicePort();

        return (port.validateCreditCard(creditCardNumber, ccvNumber,
                expirationYear, expirationMonth));
    }
}
