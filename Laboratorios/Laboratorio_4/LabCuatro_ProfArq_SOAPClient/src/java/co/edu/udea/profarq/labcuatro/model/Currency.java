package co.edu.udea.profarq.labcuatro.model;

import java.io.Serializable;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class Currency implements Serializable {

    private static final long serialVersionUID = 8560332155469210975L;
    private String acronym;
    private String symbol;
    private String description;

    public Currency() {
        super();
    }

    public Currency(String acronym, String symbol, String description) {
        this.acronym = acronym;
        this.symbol = symbol;
        this.description = description;
    }

    public String getAcronym() {
        return (this.acronym);
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getSymbol() {
        return (this.symbol);
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return (this.description);
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
