package co.edu.udea.profarq.cinema.business.spring;

import co.edu.udea.profarq.cinema.controller.exception.CinemaBusinessException;
import co.edu.udea.profarq.cinema.model.entities.Country;
import co.edu.udea.profarq.cinema.persistence.dao.ICountryDAO;
import co.edu.udea.profarq.cinema.persistence.exception.CinemaPersistenceException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class CountryManagerBean implements Serializable {

    private static final long serialVersionUID = 1827301216778112342L;

    private ICountryDAO countryDAO;

    public CountryManagerBean() {
        super();
    }

    public ICountryDAO getCountryDAO() {

        return (this.countryDAO);
    }

    public void setCountryDAO(ICountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }

    public List<Country> findAll() throws CinemaBusinessException {
        try {

            return (this.getCountryDAO().findAll());
        } catch (CinemaPersistenceException e) {
            throw new CinemaBusinessException(e);
        }
    }
}