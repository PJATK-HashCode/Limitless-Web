package pl.limitless.model;

import lombok.Data;
import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kuba on 09.06.2017.
 */
@Data
@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String password;
    private String name;
    private String surname;
    private String staffId;
    @ManyToOne
    private Airport airport;

    @ManyToMany
    private List<StaffFlight> acceptedStaffFlights;


    public Staff() {
    }

    public Staff(String password, String name, String surname, String staffId) {
        String encryptedPass = DigestUtils.sha1Hex(password);
        this.password = encryptedPass;
        this.name = name;
        this.surname = surname;
        this.staffId = staffId;
    }

    public void setPassword(String password) {
        String encryptedPass = DigestUtils.sha1Hex(password);;
        this.password =encryptedPass;
    }
}
