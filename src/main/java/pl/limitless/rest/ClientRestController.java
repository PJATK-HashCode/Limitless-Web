package pl.limitless.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.limitless.dao.IClientRepository;
import pl.limitless.model.Client;
import pl.limitless.model.ClientDisabilitiesDetails;

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
    public Client getByClientId(@PathVariable String clientId){
        return clientRepository.findClientByClientId(clientId);
    }

    @RequestMapping(value = "rest/client/new", method = RequestMethod.POST)
    public Client setFirstClient(){
        Client client = new Client();
        client.setClientId("12312asda");
        client.setEmail("22@wewqe.pl");
        client.setName("Jan");
        client.setPesel("1111111111111");
        List<ClientDisabilitiesDetails> clientDisabilitiesDetailsList = new ArrayList<>();
        ClientDisabilitiesDetails clientDisabilitiesDetails = new ClientDisabilitiesDetails();
        clientDisabilitiesDetailsList.add(clientDisabilitiesDetails);
        client.setClientDisabilitiesDetails(clientDisabilitiesDetailsList);
        return clientRepository.save(client);
    }
}
