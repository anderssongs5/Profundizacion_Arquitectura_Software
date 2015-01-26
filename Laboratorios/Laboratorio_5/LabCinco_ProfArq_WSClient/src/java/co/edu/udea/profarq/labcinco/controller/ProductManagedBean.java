package co.edu.udea.profarq.labcinco.controller;

import co.edu.udea.profarq.labcinco.business.ProductProcess;
import co.edu.udea.profarq.labcinco.util.TextUtil;
import co.edu.udea.profarq.labcinco.webservice.client.LabCincoProfArqWebServiceException_Exception;
import co.edu.udea.profarq.labcinco.webservice.client.Product;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ProductManagedBean implements Serializable {

    private static final long serialVersionUID = 1199439270657795858L;
    private List<Product> productList;
    private Product selectedProduct;
    private Product foundProduct;
    private Product newProduct;
    private String code;
    private int amountProduct = 0;
    private static final String CREATE_PRODUCT = "CREATE_PRODUCT";
    private static final String FOUND_PRODUCT = "FOUND_PRODUCT";
    private static final String UPDATE_PRODUCT = "UPDATE_PRODUCT";
    private static final String HOME = "HOME";

    public ProductManagedBean() {
        super();
    }

    @PostConstruct
    private void init() {
        this.newProduct = new Product();

        try {
            this.productList = ProductProcess.findAll();
        } catch (LabCincoProfArqWebServiceException_Exception ex) {
            Logger.getLogger(ProductManagedBean.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Product newProduct) {
        this.newProduct = newProduct;
    }

    public Product getFoundProduct() {
        return (this.foundProduct);
    }

    public void setFoundProduct(Product foundProduct) {
        this.foundProduct = foundProduct;
    }

    public int getAmountProduct() {
        if (this.productList != null && !this.productList.isEmpty()) {

            this.setAmountProduct(this.productList.size());
        }

        return (this.amountProduct);
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public void refreshProductList()
            throws LabCincoProfArqWebServiceException_Exception {
        this.setProductList(ProductProcess.findAll());
    }

    public String navigateToCreateProduct() {

        return (CREATE_PRODUCT);
    }

    private String navigateToFoundProduct() {
        return (FOUND_PRODUCT);
    }

    public String navigateToUpdateProduct() {
        if (this.selectedProduct == null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Actualizar Producto",
                    "Por favor seleccione un producto."));

            return (null);
        }

        return (UPDATE_PRODUCT);
    }

    public String navigateToHome() {

        return (HOME);
    }

    public String backToUpdatedProductList()
            throws LabCincoProfArqWebServiceException_Exception {
        this.selectedProduct = null;
        this.refreshProductList();

        return (this.navigateToHome());
    }

    public void saveProduct()
            throws LabCincoProfArqWebServiceException_Exception {
        if (ProductProcess.validateProduct(this.newProduct)) {
            if (ProductProcess.save(this.newProduct) != null) {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Crear Producto",
                        "Producto guardado satisfactoriamente."));

                this.recreateAttributes();
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_FATAL,
                        "Crear Producto",
                        "No se ha podido guardar el producto."));
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Crear Producto",
                    "Por favor ingrese valores correctos."));
        }
    }

    public void updateProduct()
            throws LabCincoProfArqWebServiceException_Exception {
        if (this.selectedProduct == null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Actualizar Producto",
                    "Por favor seleccione un producto."));

            return;
        }

        if (ProductProcess.update(this.selectedProduct) != null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Actualizar Producto",
                    "Producto actualizado exitosamente."));
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                    "Actualizar Producto",
                    "No se ha podido actualizar el producto."
                    + this.selectedProduct.getName()));
        }
    }

    public String findProduct()
            throws LabCincoProfArqWebServiceException_Exception {
        if (this.code != null && !this.code.isEmpty()) {
            this.foundProduct = ProductProcess.find(this.code);
            if (this.foundProduct != null) {

                return (this.navigateToFoundProduct());
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "Buscar Producto",
                        "No se ha podido encontrar un producto con el código "
                        + "ingresado."));
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Buscar Producto",
                    "Por favor ingrese un código."));
        }

        return null;
    }

    public void deleteProduct()
            throws LabCincoProfArqWebServiceException_Exception {
        if (this.selectedProduct == null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Eliminar Producto",
                    "Por favor seleccione un producto."));

            return;
        }

        if (ProductProcess.delete(this.selectedProduct.getCode()) != null) {
            this.refreshProductList();
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL,
                    "Eliminar Producto",
                    "No se ha podido eliminar el producto."
                    + this.selectedProduct.getName()));
        }
    }

    private void recreateAttributes() {
        this.newProduct = new Product();
        this.newProduct.setCode("");
        this.newProduct.setDescription("");
        this.newProduct.setName("");
        this.newProduct.setPrice(0.0f);
        this.newProduct.setStock(0L);
    }
}