package pl.limitless.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.limitless.dao.IClientRepository;
import pl.limitless.model.Client;
import pl.limitless.model.ClientDisabilitiesDetails;
import pl.limitless.model.Flight;
import pl.limitless.model.LOG_ACTIVITY;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lelental on 09.06.2017.
 */
@RestController
public class ClientRestController {

    @Autowired
    private IClientRepository clientRepository;

    @RequestMapping(value = "rest/client", method = RequestMethod.GET)
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @RequestMapping(value = "rest/client/{clientId}", method = RequestMethod.GET)
    public Client getByClientId(@PathVariable String clientId) {
        return clientRepository.findClientByClientId(clientId);
    }

    @RequestMapping(value = "/rest/client/{clientId}/{flightId}/{logActivity}", method = RequestMethod.PUT)
    public Flight updateClientArrivalStatusToImHereOrDecline(@PathVariable String clientId,
                                                             @PathVariable String flightId,
                                                             @PathVariable LOG_ACTIVITY logActivity) {
        if (clientRepository.findClientByClientId(clientId) != null) {
            Client client = clientRepository.findClientByClientId(clientId);
            if (client.getFlights() != null) {
                for (Flight flight : client.getFlights()) {
                    if (flight.getFlightId().equalsIgnoreCase(flightId)) {
                        flight.setLog_activity(logActivity);
                        return flight;
                    }
                }
            }
        }
        return null;
    }

    @RequestMapping(value = "/rest/client/{clientId}/{flightId}/{logActivity}/{dateOfArrival}",
            method = RequestMethod.PUT)
    public Flight updateClientArrivalStatusToIWillBe(@PathVariable String clientId,
                                                     @PathVariable String flightId,
                                                     @PathVariable LOG_ACTIVITY logActivity,
                                                     @PathVariable String dateOfArrival) {
        if (clientRepository.findClientByClientId(clientId) != null) {
            Client client = clientRepository.findClientByClientId(clientId);
            if (client.getFlights() != null) {
                for (Flight flight : client.getFlights()) {
                    if (flight.getFlightId().equalsIgnoreCase(flightId)) {
                        flight.setLog_activity(logActivity);
                        flight.setClientArrivalDate(dateOfArrival);
                        return flight;
                    }
                }
            }
        }
        return null;
    }

    @RequestMapping(value = "rest/client/new", method = RequestMethod.POST)
    public Client setFirstClient() {
        Client client = new Client("Jan", "Kowalski",
                "jankowalksi@gmail.com", "haslo1239", "95031010513");
        List<ClientDisabilitiesDetails> clientDisabilitiesDetailsList = new ArrayList<>();
        ClientDisabilitiesDetails clientDisabilitiesDetails = new ClientDisabilitiesDetails();
        clientDisabilitiesDetails.setCartName("Karta1");
        clientDisabilitiesDetails.setDisabilityInformation("info");
        clientDisabilitiesDetailsList.add(clientDisabilitiesDetails);
        client.setClientDisabilitiesDetails(clientDisabilitiesDetailsList);
        return clientRepository.save(client);
    }
}
