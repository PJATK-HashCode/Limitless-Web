package pl.limitless.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.limitless.model.Client;

/**
 * @author Lelental on 09.06.2017.
 */

@Repository("clientRepository")
public interface IClientRepository extends JpaRepository<Client, Long> {

    Client findClientByClientId(String clientId);

    Client findClientByPesel(String pesel);

    Client findClientByNameAndLastName(String name, String lastName);

    Client findClientByEmail(String email);
}
