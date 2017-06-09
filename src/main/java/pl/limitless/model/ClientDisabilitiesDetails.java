package pl.limitless.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

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
    @Length(min = 2, max = 16)
    @NotEmpty(message = "Please enter a name for cart name")
    private String cartName;
    private String medicinesInformation;
    private boolean guideDog;
    private boolean isGuideDogTravelWithYou;
    private boolean wheelChair;
    private boolean foldingWheelChair;
    private boolean nonFoldingWheelChair;

    public ClientDisabilitiesDetails() {
    }

    public ClientDisabilitiesDetails(boolean guideDog, boolean isGuideDogTravelWithYou,
                                     boolean wheelChair, boolean foldingWheelChair, boolean nonFoldingWheelChair,
                                     String cartName, String disabilityInformation) {
        this.guideDog = guideDog;
        this.isGuideDogTravelWithYou = isGuideDogTravelWithYou;
        this.wheelChair = wheelChair;
        this.foldingWheelChair = foldingWheelChair;
        this.nonFoldingWheelChair = nonFoldingWheelChair;
        this.cartName = cartName;
        this.disabilityInformation = disabilityInformation;
    }
}
