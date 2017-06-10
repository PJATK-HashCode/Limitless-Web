package pl.limitless.model;

import lombok.Data;
import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author Lelental on 09.06.2017.
 */
@Data
@Entity
public class Client  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Please enter your name")
    private String name;

    @NotEmpty(message = "Please enter your last name")
    private String lastName;

    private String profileImage;

    private String clientId;

    @Email(message = "*Please enter a valid Email")
    @NotEmpty(message = "*Please enter an email")
    private String email;

    @Length(min = 8, message = "*Your password must have at least 8 characters")
    @NotEmpty(message = "*Please enter your password")
    @Transient
    private String password;

    @Length(min = 11, max = 11, message = "Please enter a valid pesel number")
    private String pesel;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ClientDisabilitiesDetails> clientDisabilitiesDetails;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Flight> flights;

    @ManyToMany
    private Set<Role> roles;


    public Client() {
    }

    public Client(String name, String lastName, String email, String password, String pesel) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        String encryptedPass = DigestUtils.sha1Hex(password);
        this.password = encryptedPass;
        this.pesel = pesel;
    }

    public void setPassword(String password) {
        String encryptedPass = DigestUtils.sha1Hex(password);;
        this.password =encryptedPass;
    }
}
