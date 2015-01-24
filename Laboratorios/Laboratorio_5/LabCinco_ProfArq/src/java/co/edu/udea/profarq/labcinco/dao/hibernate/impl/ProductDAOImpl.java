package co.edu.udea.profarq.labcinco.dao.hibernate.impl;

import co.edu.udea.profarq.labcinco.dao.IProductDAO;
import co.edu.udea.profarq.labcinco.dao.exception.LabCincoProfArqDAOException;
import co.edu.udea.profarq.labcinco.dto.IEntityContext;
import co.edu.udea.profarq.labcinco.dto.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ProductDAOImpl extends AbstractEntityDAO implements IProductDAO {

    public ProductDAOImpl() {
        super();
    }

    @Override()
    public Serializable delete(Product product)
            throws LabCincoProfArqDAOException {
        Serializable productId = super.delete(product);

        return ((productId != null) ? productId : null);
    }

    @Override()
    public Product find(Serializable productId)
            throws LabCincoProfArqDAOException {

        return ((Product) super.find(Product.class, productId));
    }

    @Override()
    public List<Product> findAll() throws LabCincoProfArqDAOException {
        List<Product> productsFound = new ArrayList<>();
        List<IEntityContext> entitiesContextFoundList = super.findAll(
                Product.class);

        for (IEntityContext entityContext : entitiesContextFoundList) {
            productsFound.add((Product) entityContext);
        }

        return (productsFound);
    }

    @Override()
    public Serializable save(Product product)
            throws LabCincoProfArqDAOException {
        Serializable productId = super.save(product);

        return ((productId != null) ? productId : null);
    }

    @Override()
    public Product update(Product product) throws LabCincoProfArqDAOException {
        Serializable productId = super.update(product);

        return ((productId != null) ? product : null);
    }
}
