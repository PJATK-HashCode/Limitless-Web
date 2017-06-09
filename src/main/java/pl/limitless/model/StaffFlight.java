package pl.limitless.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kuba on 09.06.2017.
 */
@Data
@Entity
public class StaffFlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    private List<Staff> staff;


}
