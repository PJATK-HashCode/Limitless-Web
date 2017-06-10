package pl.limitless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.limitless.dao.IAirportRepository;
import pl.limitless.model.Airport;

/**
 * @author Lelental on 10.06.2017.
 */
@Service
public class AirportService implements IAirportService{

    @Autowired
    private IAirportRepository airportRepository;

    @Override
    public Airport getByName(String name) {
        return airportRepository.getByName(name);
    }

    @Override
    public void save(Airport airport) {
        airportRepository.save(airport);
    }
}
