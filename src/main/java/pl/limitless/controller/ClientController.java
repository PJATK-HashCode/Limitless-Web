package pl.limitless.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.limitless.dao.IClientRepository;
import pl.limitless.model.Client;
import pl.limitless.security.ClientValidator;
import pl.limitless.security.PeselValidator;
import pl.limitless.service.ClientService;

import javax.validation.Valid;

import org.apache.commons.codec.digest.DigestUtils;
import pl.limitless.service.ISecurityService;
import pl.limitless.service.SecurityServiceImpl;

/**
 * @author Lelental on 09.06.2017.
 */
@Controller
public class ClientController {
    @Autowired
    private IClientRepository clientRepository;
    @Autowired
    private ClientValidator clientValidator;
    @Autowired
    private SecurityServiceImpl securityService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");


        return "login";
    }




    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(Model model) {
        model.addAttribute("clientForm",new Client());

        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String createNewClient(@ModelAttribute("clientForm") Client clientForm, BindingResult bindingResult, Model model) {

        //clientValidator.validate(clientForm,bindingResult);

        if (bindingResult.hasErrors()){
            return "register";
        }
        clientRepository.save(clientForm);

        securityService.autologin(clientForm.getEmail(),clientForm.getPassword());

        return "redirect:/index";
    }



}
