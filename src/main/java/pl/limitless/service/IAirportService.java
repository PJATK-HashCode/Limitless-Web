package pl.limitless.service;

import pl.limitless.model.Airport;

/**
 * @author Lelental on 10.06.2017.
 */
public interface IAirportService {

    Airport getByName(String name);

    void save(Airport airport);
}
