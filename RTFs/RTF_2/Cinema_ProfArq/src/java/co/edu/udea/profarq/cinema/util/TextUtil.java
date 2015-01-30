package co.edu.udea.profarq.cinema.util;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public final class TextUtil {

    private TextUtil() {
        super();
    }

    public static final boolean isEmpty(String s) {

        return ((s == null) || (s.trim().isEmpty()));
    }
}
