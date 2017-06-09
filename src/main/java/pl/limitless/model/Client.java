package pl.limitless.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Lelental on 09.06.2017.
 */
@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastName;
    private String profileImage;
    private String clientId;
    private String email;
    private String password;
    private String pesel;
    private ClientDisabilitiesDetails clientDisabilitiesDetails;

}