package pl.limitless.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Lelental on 09.06.2017.
 */
@Data
@Entity
public class ClientDisabilitiesDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String disabilityInformation;
    private String medicinesInformation;
    private boolean guideDog;
    private boolean isGuideDogTravelWithYou;
    private boolean wheelChair;
    private boolean foldingWheelChair;
    private boolean nonFoldingWheelChair;
}
