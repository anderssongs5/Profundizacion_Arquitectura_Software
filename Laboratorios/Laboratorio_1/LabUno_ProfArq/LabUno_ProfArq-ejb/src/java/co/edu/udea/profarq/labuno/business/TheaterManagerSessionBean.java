/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.profarq.labuno.business;

import co.edu.udea.profarq.labuno.model.entity.Theater;
import java.io.Serializable;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@LocalBean()
@Stateless()
public class TheaterManagerSessionBean implements Serializable {

    private static final long serialVersionUID = -2529949619130674787L;

    @PersistenceContext(unitName = "LabUno_ProfArq-ejbPU")
    private EntityManager entityManager;

    public TheaterManagerSessionBean() {
        super();
    }

    public List<Theater> findAll() {

        return (this.entityManager.createNamedQuery("Theater.findAll").
                getResultList());
    }
}
