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
    private boolean guideIsNeeded;

    public ClientDisabilitiesDetails() {
    }

    public ClientDisabilitiesDetails(boolean guideDog, boolean isGuideDogTravelWithYou, boolean guideIsNeeded,
                                     String cartName, String disabilityInformation,
                                     String medicinesInformation) {
        this.guideDog = guideDog;
        this.isGuideDogTravelWithYou = isGuideDogTravelWithYou;
        this.cartName = cartName;
        this.guideIsNeeded = guideIsNeeded;
        this.disabilityInformation = disabilityInformation;
        this.medicinesInformation = medicinesInformation;
    }
}
