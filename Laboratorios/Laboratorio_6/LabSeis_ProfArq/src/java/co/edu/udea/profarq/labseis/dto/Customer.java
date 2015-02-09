package co.edu.udea.profarq.labseis.dto;

import java.io.Serializable;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class Customer implements IEntityContext, Serializable {

    private int customerId;
    private char discountCode;
    private String zip;
    private String name;
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private String phone;
    private String fax;
    private String email;
    private Integer creditLimit;

    public Customer() {
        super();
    }

    public Customer(int customerId, char discountCode, String zip) {
        this.customerId = customerId;
        this.discountCode = discountCode;
        this.zip = zip;
    }

    public Customer(int customerId, char discountCode, String zip, String name,
            String addressline1, String addressline2, String city, String state,
            String phone, String fax, String email, Integer creditLimit) {
        this.customerId = customerId;
        this.discountCode = discountCode;
        this.zip = zip;
        this.name = name;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    @Override()
    public Serializable getPrimaryKey() {

        return (this.getCustomerId());
    }

    public int getCustomerId() {

        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public char getDiscountCode() {

        return this.discountCode;
    }

    public void setDiscountCode(char discountCode) {
        this.discountCode = discountCode;
    }

    public String getZip() {

        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressline1() {

        return this.addressline1;
    }

    public void setAddressline1(String addressline1) {

        this.addressline1 = addressline1;
    }

    public String getAddressline2() {

        return this.addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getCity() {

        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {

        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {

        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {

        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {

        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCreditLimit() {

        return this.creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }
}
