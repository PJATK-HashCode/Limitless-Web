package pl.limitless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.limitless.dao.IFlightRepository;
import pl.limitless.model.Flight;

/**
 * @author Lelental on 09.06.2017.
 */
@Service("flightService")
public class FlightService implements IFlightService {

    private final IFlightRepository flightRepository;

    @Autowired
    public FlightService(IFlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public Flight findAllByAirportFrom(String airportFrom) {
        return flightRepository.findAllByAirportFrom(airportFrom);
    }

    @Override
    public Flight findByAirportFrom(String airportFrom) {
        return flightRepository.findByAirportFrom(airportFrom);
    }

    @Override
    public Flight findByAirportFromAndAirportTo(String airportFrom, String airportTo) {
        return flightRepository.findByAirportFromAndAirportTo(airportFrom, airportTo);
    }

    @Override
    public Flight findByFlightId(String flightId) {
        return flightRepository.findByFlightId(flightId);
    }

    @Override
    public Flight findByFlightNameAndFlightNumber(String flightName, String flightNumber) {
        return flightRepository.findByFlightNameAndFlightNumber(flightName, flightNumber);
    }

    @Override
    public Flight findByFlightName(String flightName) {
        return flightRepository.findByFlightName(flightName);
    }

    @Override
    public Flight findByFlightNumber(String flightNumber) {
        return flightRepository.findByFlightNumber(flightNumber);
    }

    @Override
    public void saveFlight(Flight flight) {
        flightRepository.save(flight);
    }
}
