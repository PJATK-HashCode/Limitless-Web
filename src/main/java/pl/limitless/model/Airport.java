package pl.limitless.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kuba on 09.06.2017.
 */
@Data
@Entity
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private List<Staff> staff;
}
