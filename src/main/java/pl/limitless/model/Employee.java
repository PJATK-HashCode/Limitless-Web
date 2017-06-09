package pl.limitless.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kuba on 09.06.2017.
 */
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private String password;
    private String name;
    private String surname;
    private String personelId;
    @ManyToOne
    private Airport airports;

    @ManyToMany
    private List<EmployeesFlight> acceptedEmployeesFlights;



}
