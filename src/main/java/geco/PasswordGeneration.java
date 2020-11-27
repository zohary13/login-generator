package geco;

import java.nio.charset.Charset;
import java.util.Random;

public class PasswordGeneration {

    private static final String symbols =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$&@?<>~!%#-_.:";
    private static final int passwordLength = 8;

    public static String getRandomPassword() {
        StringBuilder newPassword = new StringBuilder();
        Random r = new Random();
        for (int i = 0 ; i<passwordLength ; i++) {
            char ch = symbols.charAt(r.nextInt(symbols.length()));
            newPassword.append(ch);
        }
        return newPassword.toString();
    }


}
