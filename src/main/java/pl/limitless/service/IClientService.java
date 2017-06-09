package pl.limitless.service;

import pl.limitless.model.Client;

/**
 * @author Lelental on 09.06.2017.
 */
public interface IClientService {

    Client findClientByClientId(String clientId);
    Client findClientByPesel(String pesel);
    Client findClientByNameAndLastName(String name, String lastName);
    Client findClientByEmail(String email);

    void saveClient(Client client);

}
