package pl.limitless.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Kuba on 10.06.2017.
 */
@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    private Set<Client> users;

}