package pl.limitless.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.limitless.model.Client;
import pl.limitless.service.ClientService;

import javax.validation.Valid;

/**
 * @author Lelental on 09.06.2017.
 */
@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/client/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("clientLogin");
        return modelAndView;
    }

    @RequestMapping(value = "/client/register", method = RequestMethod.POST)
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        Client client = new Client();
        modelAndView.addObject("client", client);
        modelAndView.setViewName("registerClient");
        return modelAndView;
    }

    @RequestMapping(value = "/client/register", method = RequestMethod.POST)
    public ModelAndView createNewClient(@Valid Client client, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Client clientExists = clientService.findClientByPesel(client.getPesel());

        if (clientExists != null) {
            bindingResult.rejectValue("pesel", "error.client", "There is already a client register with" +
                    "that data.");
        }
        if(bindingResult.hasErrors()){
            modelAndView.setViewName("registerClient");
        }else{
            clientService.saveClient(client);
            modelAndView.addObject("succesMessage", "Client has been registered");
            modelAndView.addObject("client", new Client());
            modelAndView.setViewName("register");
        }
        return modelAndView;
    }

}
