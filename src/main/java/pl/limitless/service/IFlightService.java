package pl.limitless.service;

import pl.limitless.model.Flight;

/**
 * @author Lelental on 09.06.2017.
 */
public interface IFlightService {

    Flight findAllByAirportFrom(String airportFrom);

    Flight findByAirportFrom(String airportFrom);

    Flight findByAirportFromAndAirportTo(String airportFrom, String airportTo);

    Flight findByFlightId(String flightId);

    Flight findByFlightNameAndFlightNumber(String flightName, String flightNumber);

    Flight findByFlightName(String flightName);

    Flight findByFlightNumber(String flightNumber);

    void saveFlight(Flight flight);

}
