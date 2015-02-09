package co.edu.udea.profarq.labseis.dao.hibernate.impl;

import co.edu.udea.profarq.labseis.dao.ICustomerDAO;
import co.edu.udea.profarq.labseis.dao.exception.LabSeisProfArqDAOException;
import co.edu.udea.profarq.labseis.dto.Customer;
import co.edu.udea.profarq.labseis.dto.IEntityContext;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CustomerDAOImpl extends AbstractEntityDAO implements ICustomerDAO {

    public CustomerDAOImpl() {
        super();
    }

    @Override()
    public List<Customer> findAll() throws LabSeisProfArqDAOException {
        List<Customer> customersList = new ArrayList<>();
        List<IEntityContext> entitiesContextList = super.findAll(Customer.class);

        for (IEntityContext entityContext : entitiesContextList) {
            customersList.add((Customer) entityContext);
        }

        return (customersList);
    }
}
