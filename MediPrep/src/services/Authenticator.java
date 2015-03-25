package services;

import java.util.HashMap;
import java.util.Map;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>Authenticator Class that validates the username and password specified by the user.</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 14-11-2014
 */
public class Authenticator {
    private static final Map<String, String> USERS = new HashMap<String, String>();
    static {
        if (!USERS.containsKey("test")) {
            USERS.put("test", "test");
        }
    }
    /*
     * Validates the login credentials of the user.
     * @param user String Username
     * @param password String Password
     * @return boolean True if credentials are valid.
     */
    public static boolean validate(String user, String password){
        String validUserPassword = USERS.get(user);
        return validUserPassword != null && validUserPassword.equals(password);
    }
}
