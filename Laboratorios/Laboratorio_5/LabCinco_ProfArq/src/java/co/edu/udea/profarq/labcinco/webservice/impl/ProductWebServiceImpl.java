package co.edu.udea.profarq.labcinco.webservice.impl;

import co.edu.udea.profarq.labcinco.dao.IProductDAO;
import co.edu.udea.profarq.labcinco.dao.exception.LabCincoProfArqDAOException;
import co.edu.udea.profarq.labcinco.dao.hibernate.impl.ProductDAOImpl;
import co.edu.udea.profarq.labcinco.dto.Product;
import co.edu.udea.profarq.labcinco.webservice.IProductWebService;
import co.edu.udea.profarq.labcinco.webservice.contract.WebServiceContract;
import co.edu.udea.profarq.labcinco.webservice.exception.LabCincoProfArqWebServiceException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@WebService(serviceName = WebServiceContract.ProductWebServiceContract.WEB_SERVICE_NAME)
@XmlSeeAlso(value = {Product.class})
public class ProductWebServiceImpl implements IProductWebService {

    private static final String TAG = ProductWebServiceImpl.class.getName();

    private IProductDAO productDAO;

    public ProductWebServiceImpl() {
        this.productDAO = new ProductDAOImpl();
    }

    @Override()
    @WebMethod(operationName = WebServiceContract.ProductWebServiceContract.DELETE_OPERATION_NAME)
    public String delete(@WebParam(name = "productId") String productId)
            throws LabCincoProfArqWebServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override()
    @WebMethod(operationName = WebServiceContract.ProductWebServiceContract.FIND_OPERATION_NAME)
    public Product find(@WebParam(name = "productId") String productId)
            throws LabCincoProfArqWebServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override()
    @WebMethod(operationName = WebServiceContract.ProductWebServiceContract.FIND_ALL_OPERATION_NAME)
    public List<Product> findAll() throws LabCincoProfArqWebServiceException {
        List<Product> productsList = null;

        try {
            productsList = this.productDAO.findAll();
        } catch (LabCincoProfArqDAOException ex) {
            Logger.getLogger(TAG).log(Level.SEVERE, ex.getMessage(), ex);
        }

        return (productsList);
    }

    @Override()
    @WebMethod(operationName = WebServiceContract.ProductWebServiceContract.SAVE_OPERATION_NAME)
    public String save(@WebParam(name = "product") Product product)
            throws LabCincoProfArqWebServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override()
    @WebMethod(operationName = WebServiceContract.ProductWebServiceContract.UPDATE_OPERATION_NAME)
    public Product update(@WebParam(name = "product") Product product)
            throws LabCincoProfArqWebServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
