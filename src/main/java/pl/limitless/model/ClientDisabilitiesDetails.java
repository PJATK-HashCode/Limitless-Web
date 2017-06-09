package pl.limitless.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * @author Lelental on 09.06.2017.
 */
@Data
@Entity
public class ClientDisabilitiesDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Please enter information about your disabilities")
    private String disabilityInformation;
    @ManyToOne
    private Client client;
    private String medicinesInformation;
    private boolean guideDog;
    private boolean isGuideDogTravelWithYou;
    private boolean wheelChair;
    private boolean foldingWheelChair;
    private boolean nonFoldingWheelChair;
}
