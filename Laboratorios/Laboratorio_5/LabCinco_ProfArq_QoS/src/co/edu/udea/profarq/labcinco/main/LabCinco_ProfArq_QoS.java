package co.edu.udea.profarq.labcinco.main;

import co.edu.udea.profarq.labcinco.webservice.soap.client.LabCincoProfArqWebServiceException_Exception;
import co.edu.udea.profarq.labcinco.webservice.soap.client.Product;
import co.edu.udea.profarq.labcinco.webservice.soap.client.ProductWebService;
import co.edu.udea.profarq.labcinco.webservice.soap.client.ProductWebServiceImpl;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class LabCinco_ProfArq_QoS {

    public static void main(String[] args)
            throws LabCincoProfArqWebServiceException_Exception {

        List<Product> productList = findAll();
        if (productList != null && !productList.isEmpty()) {
            System.out.println("Listado de productos:\n");
            for (Product p : productList) {
                showProduct(p);
            }
        } else {
            System.out.println("No existen productos.\n\n");
        }

        Product product = find("1234567890");
        if (product != null) {
            showProduct(product);
        } else {
            System.out.println("No se ha encontrado el producto.\n\n");
        }

        product = new Product();
        product.setCode("8755767547");
        product.setName("Product #6");
        product.setDescription("Description for the Product #6 in the Products Data Base.");
        product.setPrice(134.7f);
        product.setStock(56);
        if (save(product).equals("8755767547")) {
            System.out.println("Producto insertado satisfactoriamente.\n\n");
        } else {
            System.out.println("El producto no ha sido insertado.\n\n");
        }

        product.setStock(10);
        product.setName("Product N. 6");
        if (update(product) != null) {
            System.out.println("Actualización satisfactoria.\n\n");
        } else {
            System.out.println("No se ha podido realizar la actualización.\n\n");
        }

        if (delete("8755767547").equals("8755767547")) {
            System.out.println("Borrado satisfactorio.\n\n");
        } else {
            System.out.println("No se ha podido realizar el borrado.\n\n");
        }
    }

    private static void showProduct(Product product) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Código: ");
        stringBuilder.append(product.getCode());
        stringBuilder.append("\n");

        stringBuilder.append("Nombre: ");
        stringBuilder.append(product.getName());
        stringBuilder.append("\n");

        stringBuilder.append("Descripción: ");
        stringBuilder.append(product.getDescription());
        stringBuilder.append("\n");

        stringBuilder.append("Precio: ");
        stringBuilder.append(product.getPrice());
        stringBuilder.append("\n");

        stringBuilder.append("Existencias en bodega: ");
        stringBuilder.append(product.getStock());
        stringBuilder.append("\n\n");

        System.out.println(stringBuilder.toString());
    }

    private static List<Product> findAll()
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.findAll();
    }

    private static String delete(String productId)
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.delete(productId);
    }

    private static Product find(String productId)
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.find(productId);
    }

    private static String save(Product product)
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();

        return port.save(product);
    }

    private static Product update(Product product)
            throws LabCincoProfArqWebServiceException_Exception {
        ProductWebService service = new ProductWebService();
        ProductWebServiceImpl port = service.getProductWebServiceImplPort();
        return port.update(product);
    }
}
