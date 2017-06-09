package pl.limitless.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.limitless.model.Staff;

/**
 * @author Lelental on 09.06.2017.
 */
@Repository("staffRepository")
public interface IStaffRepository extends JpaRepository<Staff, Long> {

    Staff findStaffByStaffId(String staffId);

    Staff findStaffByNameAndSurname(String name, String surname);
}
