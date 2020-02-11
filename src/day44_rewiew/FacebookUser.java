package day44_rewiew;

import java.util.ArrayList;
import java.util.List;

public class FacebookUser {

	/*
	 * CHICAGO CONSTRUCTORS TASKS1. Create a class FacebookUserInstance variables:
	 * username, age, name, password, friends —> Create constructor that accepts two
	 * arguments (username, password) and set values to instance variables username
	 * and password Create 2 objects from FacebookUser class 1) Set username and
	 * password only 2) Set values for all four variables
	 */

	String name;
	String username;
	String password;
	int age;
	int numOffriends;
	
	List<Post> posts = new ArrayList<>();
	List<FacebookUser> requests = new ArrayList<>();
	

	public FacebookUser(String username, String password) {

		this.username = username;
		this.password = password;
	}

	/*
	 * 3. Overload FacebookUser constructor that accepts 3 parameters. Name,
	 * username, password. Set all the values to corresponding instance variables.
	 * *** Before setting values check if password contains username. If it contains
	 * username then print “password can’t contain username. Please change password”
	 * and set empty string for password.
	 * 
	 * 
	 */

	public FacebookUser(String username, String password, String name) {

		if (!password.contains(username)) {
			this.password = password;
		} else {
			System.out.println("password can’t contain username. Please change password");
			this.password = "";
		}

		this.username = username;
		this.name = name;

	}
	/*
	 * 4. Add methods to FacebookUser class 1) sendFriendRequest —> accepts
	 * FacebookUser type(target user) * check target user’s friends. If 5000 or more
	 * then print “%targetUserName can’t accept friend request” and return false.
	 * *if target user has less than 5000 friends then print “Friend request sent to
	 * %targetUserName” and return true; 2) userInfo —> no parameter, void method.
	 * Print all the information (except password) about the user in the following
	 * format. Name: James Username: james2018 Age: 26 Friends: 341
	 */

	public boolean sendFriendsRequest(FacebookUser targetUser) {
		if (targetUser.numOffriends < 5000) {
			System.out.println("Friend request sent to " + targetUser.username);
			return true;
		} else {
			System.out.println(targetUser.username + " can’t accept friend request");
			return false;
		}
	}

	public void userInfo() {
		System.out.println("Name " + name);
		System.out.println("Username " + this.username);
		System.out.println("Password " + this.password);
		System.out.println("Number of friends " + numOffriends);
	}

	public static void deleteAccount(FacebookUser user) { // method that delete all user info from account facebook

		user.age = 0;
		user.name = null;
		user.username = null;
		user.password = null;
		user.numOffriends = 0;

	}

	public static void seeUserInfo(FacebookUser user) {
		user.userInfo();
	}
		/*
		 * 3. Add instance variable posts (list of posts) in FacebookUser class.
		 * *add method post. This method accepts post object and print out post details and
		 * adds given post to list of posts.
		 * 
		 */
		
		public void post(Post post) {
			System.out.println("\nYour new post here\n");
			post.postInfo();
			posts.add(post);
		}

	
}