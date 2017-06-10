package pl.limitless.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.limitless.model.Role;

/**
 * Created by Kuba on 10.06.2017.
 */
public interface IRoleRepository extends JpaRepository<Role,Long> {
}
