package pl.limitless.service;

import pl.limitless.model.Staff;

/**
 * @author Lelental on 09.06.2017.
 */
public interface IStaffService {

    Staff findStaffByStaffId(String staffId);
    Staff findStaffByNameAndSurname(String name, String surname);

    void saveStaff(Staff staff);
}
