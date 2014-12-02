package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Billboard;
import co.edu.udea.profarq.cinema.model.entities.Film;
import co.edu.udea.profarq.cinema.persistence.dao.IBillboardDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class BillboardManagerBean implements Serializable {

    private static final long serialVersionUID = 2202708647974728283L;

    private IBillboardDAO billboardDAO;

    public BillboardManagerBean() {
        super();
    }

    public IBillboardDAO getBillboardDAO() {

        return (this.billboardDAO);
    }

    public void setBillboardDAO(IBillboardDAO billboardDAO) {
        this.billboardDAO = billboardDAO;
    }

    public List<Billboard> findAll() throws CinemaBusinessException {
        try {

            return (this.getBillboardDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }

    public List<Billboard> findByFilm(Film film) throws CinemaBusinessException {
        try {

            return (this.getBillboardDAO().findByFilm(film));
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }

    public void save(Billboard billboard) throws CinemaBusinessException {
        try {
            this.getBillboardDAO().save(billboard);
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }

    public Billboard update(Billboard billboard) throws CinemaBusinessException {
        try {

            return (this.getBillboardDAO().update(billboard));
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}