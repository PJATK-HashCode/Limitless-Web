package pl.limitless.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.limitless.model.Flight;

import java.util.List;

/**
 * @author Lelental on 09.06.2017.
 */
public interface IFlightRepository extends JpaRepository<Flight, Long> {

    Flight findAllByAirportFrom(String airportFrom);

    List<Flight> findByAirportFrom(String airportFrom);

    List<Flight> findByAirportFromAndAirportTo(String airportFrom, String airportTo);

    Flight findByFlightId(String flightId);

    List<Flight> findByAirportTo(String airportTo);

    Flight findByFlightNameAndFlightNumber(String flightName, String flightNumber);

    Flight findByFlightName(String flightName);

    Flight findByFlightNumber(String flightNumber);

    List<Flight> findByStartDate(String startDate);

    List<Flight> findByLandDate(String landDate);

}
