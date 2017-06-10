package pl.limitless.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import pl.limitless.model.Client;
import pl.limitless.service.IClientService;

/**
 * Created by Kuba on 10.06.2017.
 */
@Component
public class ClientValidator implements Validator {
    @Autowired
    private IClientService clientService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Client.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

        Client client = (Client) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email","NotEmpty");
        if (client.getEmail().length() < 6 || client.getEmail().length() > 40) {
            errors.rejectValue("email", "Size.userForm.username");
        }
        if (clientService.findClientByEmail(client.getEmail()) != null) {
            errors.rejectValue("email", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (client.getPassword().length() < 8 || client.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

    }
}
