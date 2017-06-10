package pl.limitless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.limitless.model.Flight;


/**
 * @author Lelental on 09.06.2017.
 */
@Controller
public class FlightController {

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public String flights(Model model){
        model.addAttribute("flights", new Flight());
        return "flights";
    }

    @RequestMapping(value = "/adminflights", method = RequestMethod.GET)
    public String adminFlights(Model model){
        model.addAttribute("flights", new Flight());
        return "adminflights";
    }

    @RequestMapping(value = "/userflights", method = RequestMethod.GET)
    public String userflights(Model model){
        model.addAttribute("flights", new Flight());
        return "userflights";
    }
}
