package co.edu.udea.profarq.labcinco.webservice;

import co.edu.udea.profarq.labcinco.dto.Product;
import co.edu.udea.profarq.labcinco.webservice.exception.LabCincoProfArqWebServiceException;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IProductWebService {

    public String delete(String productId)
            throws LabCincoProfArqWebServiceException;

    public Product find(String productId)
            throws LabCincoProfArqWebServiceException;

    public List<Product> findAll() throws LabCincoProfArqWebServiceException;

    public String save(Product product)
            throws LabCincoProfArqWebServiceException;

    public Product update(Product product)
            throws LabCincoProfArqWebServiceException;
}
