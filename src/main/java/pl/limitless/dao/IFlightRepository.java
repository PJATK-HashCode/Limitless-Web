package pl.limitless.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.limitless.model.Flight;

/**
 * @author Lelental on 09.06.2017.
 */
public interface IFlightRepository extends JpaRepository<Flight, Long> {

    Flight findAllByAirportFrom(String airportFrom);

    Flight findByAirportFrom(String airportFrom);

    Flight findByAirportFromAndAirportTo(String airportFrom, String airportTo);

    Flight findByFlightId(String flightId);

    Flight findByFlightNameAndFlightNumber(String flightName, String flightNumber);

    Flight findByFlightName(String flightName);

    Flight findByFlightNumber(String flightNumber);


}
