package pl.limitless.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.limitless.model.Airport;

/**
 * @author Lelental on 10.06.2017.
 */
@Repository("airportRepository")
public interface IAirportRepository extends JpaRepository<Airport,Long> {

    Airport getByName(String name);
}
