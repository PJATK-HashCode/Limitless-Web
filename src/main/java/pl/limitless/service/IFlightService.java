package pl.limitless.service;

import pl.limitless.model.Airport;
import pl.limitless.model.Flight;

import java.util.List;

/**
 * @author Lelental on 09.06.2017.
 */
public interface IFlightService {

    Flight findAllByAirportFrom(Airport airportFrom);

    List<Flight> findByAirportFrom(Airport airportFrom);

    List<Flight> findByAirportFromAndAirportTo(Airport airportFrom, Airport airportTo);

    List<Flight> findByAirportTo(Airport airportTo);

    Flight findByFlightId(String flightId);

    Flight findByFlightNameAndFlightNumber(String flightName, String flightNumber);

    Flight findByFlightName(String flightName);

    Flight findByFlightNumber(String flightNumber);

    List<Flight> findByStartDate(String startDate);

    List<Flight> findByLandDate(String landDate);

    void saveFlight(Flight flight);

}
