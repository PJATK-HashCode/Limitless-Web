package pl.limitless.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import pl.limitless.rest.FlightRestController;

import javax.persistence.*;

/**
 * @author Lelental on 09.06.2017.
 */
@Entity
@Data
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Please enter flight number")
    private String flightNumber;
    @NotEmpty(message = "Please enter flight name")
    private String flightName;
    @NotEmpty(message = "Please enter start date")
    private String startDate;
    @NotEmpty(message = "Please enter land date")
    private String landDate;
    private String airportFrom;
    private String airportTo;
    private String flightId;
    @Enumerated(EnumType.STRING)
    private LOG_ACTIVITY log_activity;
    @Enumerated(EnumType.STRING)
    private LOG_ACTIVITY_STAFF log_activity_staff;
    private String clientArrivalDate;

}
