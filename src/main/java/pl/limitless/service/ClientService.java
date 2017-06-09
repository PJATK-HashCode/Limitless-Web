package pl.limitless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.limitless.dao.IClientRepository;
import pl.limitless.model.Client;

/**
 * @author Lelental on 09.06.2017.
 */
@Service("clientService")
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository clientRepository;


    @Override
    public Client findClientByClientId(String clientId) {
        return clientRepository.findClientByClientId(clientId);
    }

    @Override
    public Client findClientByPesel(String pesel) {
        return clientRepository.findClientByPesel(pesel);
    }

    @Override
    public Client findClientByNameAndLastName(String name, String lastName) {
        return clientRepository.findClientByNameAndLastName(name,lastName);
    }

    @Override
    public Client findClientByEmail(String email) {
        return clientRepository.findClientByEmail(email);
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }
}
