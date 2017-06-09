package pl.limitless.controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.limitless.model.Client;
import pl.limitless.model.Staff;
import pl.limitless.security.PeselValidator;
import pl.limitless.service.StaffService;

import javax.validation.Valid;

/**
 * @author Lelental on 09.06.2017.
 */
@Controller
public class StaffController {
/*
    @Autowired
    private StaffService staffService;


    @RequestMapping(value = "/staff/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("stafftLogin");
        return modelAndView;
    }

    @RequestMapping(value = "/staff/register", method = RequestMethod.POST)
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        Staff staff = new Staff();
        modelAndView.addObject("staff", staff);
        modelAndView.setViewName("registerStaff");
        return modelAndView;
    }

    @RequestMapping(value = "/staff/register", method = RequestMethod.POST)
    public ModelAndView createNewClient(@Valid Staff staff, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Staff staff2 = staffService.findStaffByStaffId(staff.getStaffId());
        if (staff2 != null) {
            bindingResult.rejectValue("staffId", "error.staff", "There is already a staff register with" +
                    "that data.");
        }
        if(bindingResult.hasErrors()){
            modelAndView.setViewName("registerStaff");
        }else{
            staffService.saveStaff(staff);
            modelAndView.addObject("successMessage", "Staff has been registered");
            modelAndView.addObject("staff", new Staff());
            modelAndView.setViewName("register");
        }
        return modelAndView;
    }*/
}
