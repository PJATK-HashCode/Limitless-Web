package pl.limitless.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * Created by Kuba on 10.06.2017.
 */
@Service
public class SecurityServiceImpl implements ISecurityService {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ClientDetailsService clientDetailsService;

    private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);



    @Override
    public String findLoggedInEmail() {
        Object clientDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
        if (clientDetails instanceof UserDetails) {
            return ((UserDetails)clientDetails).getUsername();
        }

        return null;
    }

    @Override
    public void autologin(String email, String password) {
        UserDetails userDetails = clientDetailsService.loadUserByUsername(email);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());

        authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        if (usernamePasswordAuthenticationToken.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            logger.debug(String.format("Auto login %s successfully!", email));
        }
    }
}
