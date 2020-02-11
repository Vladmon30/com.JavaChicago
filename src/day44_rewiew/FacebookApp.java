package day44_rewiew;

import java.util.ArrayList;
import java.util.List;

public class FacebookApp {
	/*
	 * 4. Create class FacebookAppVariables: Static variable list of Facebook users.
	 * Create static method loadUsers. This method should accept list of
	 * String(names) and void. Logic: loop through each name of given list and
	 * create facebook user with given name.User CustomData class and generate
	 * username and password and set to created user. Then add this user to list of
	 * facebook users.
	 * 
	 */

	static List<FacebookUser> users = new ArrayList<>();

	public static void loadUsers(List<String> names) {
		for (String name : names) {
			String username = CustomData.generateUserName(name);
			String password = CustomData.generatePassword(name);
			FacebookUser user = new FacebookUser(username, password, name);
			users.add(user);
		}
	}
	/*
	 * 5. Create static method seeAllFacebookUsers. This method doesn’t accept
	 * anything. Simply prints out each facebook user’s information.
	 */

	public static void seeAllFacebookUsers() {
		for (FacebookUser user : users) {
			user.userInfo();
		}
	}

	/*
	 * 6. Create static method userExists. Method accepts username and return
	 * boolean. Returns true if given username exists in Facebook database, and
	 * return false if doesn’t exist.
	 * 
	 */
	public static boolean userExists(String username) {
				for(FacebookUser user: users){
					if(user.username.equals(username)) {
						return true;						
					}		
				}
				return false;
}

	/*
	 * 7. Create static method addUser. This method accepts facebook user and adds
	 * to list of Facebook users. Note: before adding the user check if user exists
	 * in data base. If exists then print out “user already exists in the system”
	 * and don’t add. Otherwise simply add to list.
	 */
	public static void addUser(FacebookUser user) {
		if (userExists(user.username)) {
			System.out.println("User llready exist in a system");
		} else {
			users.add(user);
		}
	}
		/*
		 * 8. Create static method removeUser. This method accepts facebook user and
		 * removes from list of facebook users. note: check with username.
		 */
	public static void removeUser(FacebookUser user) {
		for(FacebookUser u: users) {
			if(u.username.equals(user.username)) {
		     users.remove(user);
		     break;
   	  }		
   	}
  }
}
