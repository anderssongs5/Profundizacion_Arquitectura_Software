package co.edu.udea.profarq.labcinco.business;

import co.edu.udea.profarq.labcinco.util.TextUtil;
import co.edu.udea.profarq.labcinco.webservice.client.LabCincoProfArqWebServiceException_Exception;
import co.edu.udea.profarq.labcinco.webservice.client.Product;
import co.edu.udea.profarq.labcinco.webservice.client.ProductWebService;
import co.edu.udea.profarq.labcinco.webservice.client.ProductWebServiceImpl;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ProductProcess {

    private ProductProcess() {
        super();
    }

    public static boolean validateProduct(Product product) {
        if ((product != null) && (ProductProcess.
                validateProductId(product.getCode()))) {

            return (!(TextUtil.isEmtpy(product.getName()))
                    && (product.getPrice() > 0.0F)
                    && (product.getStock() >= 0L));
        }

        return (false);
    }

    private static boolean validateProductId(String productId) {

        return (!(TextUtil.isEmtpy(productId)) && (productId.length() <= 20)
                && ((TextUtil.hasOnlyLowerLetters(productId))
                || (TextUtil.hasOnlyUpperLetters(productId))
                || (TextUtil.hasOnlyNumbers(productId))));
    }

    public static String delete(String productId)
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.delete(productId);
    }

    public static Product find(String productId)
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.find(productId);
    }

    public static List<Product> findAll()
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.findAll();
    }

    public static String save(Product product)
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.save(product);
    }

    public static Product update(Product product)
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.update(product);
    }
}