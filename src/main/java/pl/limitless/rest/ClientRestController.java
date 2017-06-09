package pl.limitless.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.limitless.dao.IClientRepository;
import pl.limitless.model.Client;

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
}
