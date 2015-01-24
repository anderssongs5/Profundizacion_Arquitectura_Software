package co.edu.udea.profarq.labcinco.util;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class TextUtil {

    private TextUtil() {
        super();
    }

    public static final boolean hasOnlyLowerLetters(String s) {
        char lowerA = 'a';
        char lowerZ = 'z';

        if (!isEmtpy(s)) {
            for (int index = 0; index < s.length(); index++) {
                char c = s.charAt(index);

                if ((c < lowerA) || (c > lowerZ)) {

                    return (false);
                }
            }

            return (true);
        }

        return (true);
    }

    public static final boolean hasOnlyUpperLetters(String s) {
        char lowerA = 'A';
        char lowerZ = 'Z';

        if (!isEmtpy(s)) {
            for (int index = 0; index < s.length(); index++) {
                char c = s.charAt(index);

                if ((c < lowerA) || (c > lowerZ)) {

                    return (false);
                }
            }

            return (true);
        }

        return (false);
    }

    public static final boolean hasOnlyNumbers(String s) {
        try {
            Double.valueOf(s);
        } catch (NumberFormatException e) {

            return (false);
        }

        return (true);
    }

    public static final boolean isEmtpy(String s) {

        return ((s == null) || (s.trim().isEmpty()));
    }
}
