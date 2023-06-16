package Banking.Main_Operation;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class security {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    public boolean test (String password){
        if(password.matches(PASSWORD_PATTERN))
            return true;
        return false;
    }
}
