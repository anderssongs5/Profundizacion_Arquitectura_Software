/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.profarq.labseis.dao;

import co.edu.udea.profarq.labseis.dao.exception.LabSeisProfArqDAOException;
import co.edu.udea.profarq.labseis.dto.Customer;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface ICustomerDAO {

    public List<Customer> findAll() throws LabSeisProfArqDAOException;
}
