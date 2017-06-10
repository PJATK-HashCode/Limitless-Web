package pl.limitless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.limitless.dao.IClientRepository;
import pl.limitless.model.Client;
import pl.limitless.model.Role;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kuba on 10.06.2017.
 */
@Service
public class ClientDetailsService implements UserDetailsService {
    @Autowired
    private IClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Client client = clientRepository.findClientByEmail(email);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role :
                client.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));


        }
        return new org.springframework.security.core.userdetails.User(client.getEmail(), client.getPassword(), grantedAuthorities);

    }
}
