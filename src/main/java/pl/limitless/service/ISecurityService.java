package pl.limitless.service;

/**
 * Created by Kuba on 10.06.2017.
 */
public interface ISecurityService {
    String findLoggedInEmail();

    void autologin(String email, String password);
}
