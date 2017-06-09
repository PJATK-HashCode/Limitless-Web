package pl.limitless.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.limitless.model.Client;
import pl.limitless.security.PeselValidator;
import pl.limitless.service.ClientService;

import javax.validation.Valid;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author Lelental on 09.06.2017.
 */
@Controller
public class ClientController {

/*
    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        Client client = new Client();
        modelAndView.addObject("client", client);
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView createNewClient(@Valid Client client, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Client clientPesel = clientService.findClientByPesel(client.getPesel());

        if (clientPesel != null) {
            bindingResult.rejectValue("pesel", "error.client", "There is already a client register with" +
                    "that data.");
        }else if(!PeselValidator.checkPesel(client.getPesel())){
        bindingResult.rejectValue("pesel", "error.client", "Wrong pesel number");
        }

        if(bindingResult.hasErrors()){
            modelAndView.setViewName("registerClient");
        }else{
            clientService.saveClient(client);
            modelAndView.addObject("successMessage", "Client has been registered");
            modelAndView.addObject("client", new Client());
            modelAndView.setViewName("register");
        }
        return modelAndView;
    }*/


}
