package co.edu.udea.profarq.labcinco.dao;

import co.edu.udea.profarq.labcinco.dao.exception.LabCincoProfArqDAOException;
import co.edu.udea.profarq.labcinco.dto.Product;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IProductDAO {

    public Serializable delete(Product product)
            throws LabCincoProfArqDAOException;

    public Product find(Serializable productId)
            throws LabCincoProfArqDAOException;

    public List<Product> findAll() throws LabCincoProfArqDAOException;

    public Serializable save(Product product)
            throws LabCincoProfArqDAOException;

    public Product update(Product product) throws LabCincoProfArqDAOException;
}
