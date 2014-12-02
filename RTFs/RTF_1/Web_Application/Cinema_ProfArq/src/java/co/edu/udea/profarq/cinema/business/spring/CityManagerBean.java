package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.City;
import co.edu.udea.profarq.cinema.persistence.dao.ICityDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CityManagerBean implements Serializable {

    private static final long serialVersionUID = 1605297966422766834L;

    private ICityDAO cityDAO;

    public CityManagerBean() {
        super();
    }

    public ICityDAO getCityDAO() {

        return (this.cityDAO);
    }

    public void setCityDAO(ICityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }

    public List<City> findAll() throws CinemaBusinessException {
        try {

            return (this.getCityDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}