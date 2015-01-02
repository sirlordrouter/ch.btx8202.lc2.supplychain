package services;

import java.util.HashMap;
import java.util.Map;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * Modul </br>
 *
 *<p>Class Description</p>
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

    public static boolean validate(String user, String password){
        String validUserPassword = USERS.get(user);
        return validUserPassword != null && validUserPassword.equals(password);
    }
}
