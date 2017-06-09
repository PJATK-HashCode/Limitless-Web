package pl.limitless.validator;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author Lelental on 09.06.2017.
 */
public class PeselValidatorTest {

    @Test
    public void test_correct_pesel(){
        assertEquals(true, PeselValidator.checkPesel("95031010513"));
    }

    @Test
    public void test_incorrect_pesel(){
        assertEquals(false,PeselValidator.checkPesel("95023333123"));
    }
}
