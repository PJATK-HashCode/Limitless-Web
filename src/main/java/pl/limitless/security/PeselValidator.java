package pl.limitless.security;

/**
 * @author Lelental on 09.06.2017.
 */
public class PeselValidator {

    static boolean checkPesel(String pesel) {

        int weight[] = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int sum = 0;

        if (pesel.length() != 11) {
            return false;
        }

        for (int i = 0; i < 10; i++) {
            sum += Integer.parseInt(pesel.substring(i, i + 1)) * weight[i];
        }

        int checkNumber = Integer.parseInt(pesel.substring(10, 11));

        sum %= 10;
        sum = 10 - sum;
        sum %= 10;

        return (sum == checkNumber);
    }
}
