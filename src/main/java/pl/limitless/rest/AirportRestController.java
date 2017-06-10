package pl.limitless.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.limitless.dao.IAirportRepository;
import pl.limitless.model.Airport;

import java.util.List;

/**
 * @author Lelental on 10.06.2017.
 */
@RestController
public class AirportRestController {

    @Autowired
    private IAirportRepository airportRepository;

    @RequestMapping(value = "rest/airport", method = RequestMethod.GET)
    public List<Airport> getAll() {
        return airportRepository.findAll();
    }

    @RequestMapping(value = "rest/airport/{name}", method = RequestMethod.GET)
    public Airport getByName(@PathVariable String name) {
        return airportRepository.getByName(name);
    }
}
