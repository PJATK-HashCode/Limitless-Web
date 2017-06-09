package pl.limitless.model;

import lombok.Data;

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
    private  long id;

    private String password;
    private String name;
    private String surname;
    private String staffId;
    @ManyToOne
    private Airport airports;

    @ManyToMany
    private List<StaffFlight> acceptedStaffFlights;



}
