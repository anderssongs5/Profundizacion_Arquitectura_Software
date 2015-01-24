/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.profarq.labcuatro.business;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class Process {

    public static final Map<String, Double> CURRENCIES = new HashMap<>();
    private static final int LENGTH_CREDIT_CARD_NUMBER = 16;
    private static final int LENGTH_CCV_3 = 3;
    private static final int LENGTH_CCV_4 = 4;
    private static final String MASTERCARD = "MASTERCARD";
    private static final String VISA = "VISA";
    private static final String AMEX = "AMEX";
    private static final String DINERS = "DINERS";

    static {
        CURRENCIES.put("COP", 1.0);
        CURRENCIES.put("USD", 2385.50);
        CURRENCIES.put("EUR", 2673.31);
        CURRENCIES.put("GBP", 3575.75);
    }

    public static Double convertCurrency(String sourceCurrency,
            String targetCurrency, double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");

        if (sourceCurrency != null && targetCurrency != null && amount >= 0.0) {
            Double source = Process.CURRENCIES.get(sourceCurrency);
            Double target = Process.CURRENCIES.get(targetCurrency);

            if (source != null && target != null) {

                if (sourceCurrency.equals(targetCurrency)) {

                    return (amount);
                }

                return (Double.parseDouble(decimalFormat.format(
                        (source * amount) / target).replace(',', '.')));
            }
        }

        return (Double.NaN);
    }

    public static String validateCreditCard(String creditCardNumber,
            String ccvNumber, int expirationYear, int expirationMonth) {
        boolean flag = true;
        StringBuilder stringBuilder = new StringBuilder();

        if ((creditCardNumber.length() == LENGTH_CREDIT_CARD_NUMBER)
                && (ccvNumber.length() == LENGTH_CCV_3
                || ccvNumber.length() == LENGTH_CCV_4) && (expirationYear > 0)
                && (expirationMonth > 0 && expirationMonth <= 12)) {

            if (checkOnlyNumbers(creditCardNumber)
                    && checkOnlyNumbers(ccvNumber)) {
                int firstFourDigits = Integer.valueOf(creditCardNumber.
                        subSequence(0, 4).toString());
                stringBuilder.append("La tarjeta es del tipo: ");

                if (firstFourDigits <= 4000) {
                    stringBuilder.append(VISA);
                } else if (firstFourDigits > 4000 && firstFourDigits <= 7000) {
                    stringBuilder.append(MASTERCARD);
                } else if (firstFourDigits > 7000 && firstFourDigits <= 8000) {
                    stringBuilder.append(AMEX);
                } else {
                    stringBuilder.append(DINERS);
                    flag = false;
                }
                stringBuilder.append(", ");

                if ((flag && ccvNumber.length() == LENGTH_CCV_3)
                        || (!flag && ccvNumber.length() == LENGTH_CCV_4)) {
                    if (Process.validateCCVNumber(ccvNumber)) {
                        stringBuilder.append("el número CCV es correcto");
                    } else {
                        stringBuilder.append("el número CCV no es correcto");
                    }
                } else {
                    stringBuilder.append("la longitud del número CCV no es la adecuada");
                }
                stringBuilder.append(", ");

                if (checkValidExpirationDate(expirationYear, expirationMonth)) {
                    stringBuilder.append("su tarjeta no ha expirado.");
                } else {
                    stringBuilder.append("su tarjeta ya ha expirado.");
                }

                return (stringBuilder.toString());
            } else {
                return ("Algunos números no son válidos.");
            }
        }

        return ("La longitud de algunos o ambos números no es la adecuada "
                + "o no son válidos.");
    }

    // Verdadera si está buena
    private static boolean validateCCVNumber(String ccvNumber) {
        int i = 0;
        while (i != (ccvNumber.length() - 1)) {
            char c = (char) (ccvNumber.charAt(i) + 1);
            if (c == ccvNumber.charAt(i + 1)) {

                return (false);
            }

            i++;
        }

        i = 0;
        StringBuilder stringBuilder;
        while (i < ccvNumber.length()) {
            char c = ccvNumber.charAt(i);
            stringBuilder = new StringBuilder(ccvNumber);
            stringBuilder.deleteCharAt(i);
            if (stringBuilder.indexOf(String.valueOf(c)) != -1) {

                return (false);
            }

            i++;
        }

        return (true);
    }

    // Verdadero si solo tiene números
    private static boolean checkOnlyNumbers(String creditCardNumber) {
        for (int i = 0; i < creditCardNumber.length(); i++) {
            char c = creditCardNumber.charAt(i);
            if (c < '0' || c > '9') {

                return (false);
            }
        }

        return (true);
    }

    // Verdadero si la fecha de expiración es después de la de hoy
    private static boolean checkValidExpirationDate(int expirationYear,
            int expirationMonth) {
        Calendar calendar = Calendar.getInstance();

        if ((expirationYear < calendar.get(Calendar.YEAR))
                || (expirationYear == calendar.get(Calendar.YEAR)
                && expirationMonth < calendar.get(Calendar.MONTH))) {

            return (false);
        }

        return (true);
    }
}
