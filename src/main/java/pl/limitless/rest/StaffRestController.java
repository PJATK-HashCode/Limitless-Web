package pl.limitless.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.limitless.dao.IStaffRepository;
import pl.limitless.model.Staff;

import java.util.List;

/**
 * @author Lelental on 09.06.2017.
 */
@RestController
public class StaffRestController {

    @Autowired
    private IStaffRepository staffRepository;

    @RequestMapping(value = "rest/staff", method = RequestMethod.GET)
    public List<Staff> getAll(){
        return staffRepository.findAll();
    }

    @RequestMapping(value = "rest/staff/{staffId}", method = RequestMethod.GET)
    public Staff getByStaffId(@RequestParam String staffId){
        return staffRepository.findStaffByStaffId(staffId);
    }
}
