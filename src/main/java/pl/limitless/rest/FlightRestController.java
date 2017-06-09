package pl.limitless.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.limitless.dao.IFlightRepository;
import pl.limitless.model.Flight;

import java.util.List;

/**
 * @author Lelental on 09.06.2017.
 */
@RestController
public class FlightRestController {

    @Autowired
    private IFlightRepository flightRepository;

    @RequestMapping(value = "/rest/flight/{flightId}", method = RequestMethod.GET)
    public Flight getByFlightId(@PathVariable String flightId) {
        return flightRepository.findByFlightId(flightId);
    }

    @RequestMapping(value = "/rest/flight/{airportFrom}", method = RequestMethod.GET)
    public List<Flight> getByAirportFrom(@PathVariable String airportFrom) {
        return flightRepository.findByAirportFrom(airportFrom);
    }

    @RequestMapping(value = "/rest/flight/{aurPortTo}", method = RequestMethod.GET)
    public List<Flight> getByAirportTo(@PathVariable String airportTo) {
        return flightRepository.findByAirportTo(airportTo);
    }

    @RequestMapping(value = "/rest/flight/{flightNumber}", method = RequestMethod.GET)
    public Flight getByFlightNumber(@PathVariable String flightNumber) {
        return flightRepository.findByFlightNumber(flightNumber);
    }

    @RequestMapping(value = "/rest/flight/{flightName}", method = RequestMethod.GET)
    public Flight getByFlightName(@PathVariable String flightName) {
        return flightRepository.findByFlightName(flightName);
    }

    @RequestMapping(value = "/rest/flight/{flightIStartDate}", method = RequestMethod.GET)
    public List<Flight> getByFlightStartDate(@PathVariable String flightStartDate) {
        return flightRepository.findByStartDate(flightStartDate);
    }

    @RequestMapping(value = "/rest/flight/{flightLandingDate}", method = RequestMethod.GET)
    public List<Flight> getByFlightLandingDate(@PathVariable String fligtLandingDate) {
        return flightRepository.findByLandDate(fligtLandingDate);
    }
}
