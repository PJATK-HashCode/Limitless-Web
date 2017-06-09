package pl.limitless.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.limitless.service.StaffService;

/**
 * @author Lelental on 09.06.2017.
 */
@Controller
public class StaffController {

    @Autowired
    private StaffService staffService;
}
