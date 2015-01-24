package co.edu.udea.profarq.labcinco.dto;

import java.io.Serializable;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class Product implements IEntityContext, Serializable {

    private String code;
    private String name;
    private float price;
    private long stock;
    private String description;

    public Product() {
        super();
    }

    public Product(String code, String name, float price, long stock) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String code, String name, float price, long stock,
            String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }

    public String getCode() {

        return (this.code);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {

        return (this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {

        return (this.price);
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getStock() {

        return (this.stock);
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public String getDescription() {

        return (this.description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override()
    public Serializable getPrimaryKey() {

        return (this.getCode());
    }
}
