package pl.limitless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.limitless.dao.IStaffRepository;
import pl.limitless.model.Staff;

/**
 * @author Lelental on 09.06.2017.
 */
@Service("staffService")
public class StaffService implements IStaffService {

    private final IStaffRepository staffRepository;

    @Autowired
    public StaffService(IStaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public Staff findStaffByStaffId(String staffId) {
        return staffRepository.findStaffByStaffId(staffId);
    }

    @Override
    public Staff findStaffByNameAndSurname(String name, String surname) {
        return staffRepository.findStaffByNameAndSurname(name,surname);
    }

    @Override
    public void saveStaff(Staff staff) {
        staffRepository.save(staff);
    }
}
