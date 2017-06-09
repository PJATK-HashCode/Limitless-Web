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
    private Airport airports;

    @ManyToMany
    private List<StaffFlight> acceptedStaffFlights;


    public Staff() {
    }

    public Staff(String password, String name, String surname, String staffId) {
        this.password = DigestUtils.sha1Hex(password);
        this.name = name;
        this.surname = surname;
        this.staffId = staffId;
    }

    public void setPassword(String password) {
        this.password = DigestUtils.sha1Hex(password);
    }
}
