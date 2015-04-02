package model.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>
 * A class used to now about the current logged in user.
 * The <code>User</code> contains id, username, firstname, and isPatient information of the current logged in user
 *</p>
 *
  * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
  * @author Patrizia Zehnder, patriziasusanna.zehnder@students.bfh.ch
  * @version 06-11-2014
 */
public class User {

	private String id = "";
	private String firstname = null;
	private String lastname = null;

    private static final Map<String, User> USERS = new HashMap<String, User>();

    public static User of(String id) {
        User user = USERS.get(id);
        if (user == null) {
            user = new User(id, "","");
            USERS.put(id, user);
        }
        return user;
    }

	public User(){}

	public User(String id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.firstname = lastname;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}
    /**
	 * @return the firstname
	 */
	public String getFirstname() {
		return this.firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return this.lastname;
	}
}
