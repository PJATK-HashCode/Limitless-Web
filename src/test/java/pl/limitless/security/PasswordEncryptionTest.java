package pl.limitless.security;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;

/**
 * @author Lelental on 09.06.2017.
 */
public class PasswordEncryptionTest {

    @Test
    public void test_encrypt() throws NoSuchAlgorithmException {
        String pass = "TravelToCloud";
        String encryptPass = DigestUtils.sha1Hex(pass);
        String encryptPass2 = DigestUtils.sha1Hex(pass);

        assertEquals(encryptPass, encryptPass2);
    }
}
