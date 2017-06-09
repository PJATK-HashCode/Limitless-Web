package pl.limitless.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.limitless.dao.IClientRepository;
import pl.limitless.model.Client;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Kuba on 09.06.2017.
 */

@Controller
@RequestMapping("/")
public class HomeController {


    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model)
    {
        return "register";
    }

}
