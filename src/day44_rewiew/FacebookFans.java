package day44_rewiew;

import java.util.ArrayList;
import java.util.List;

public class FacebookFans {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("James Bond");
	names.add("Karin Benzema");
	names.add("Cristiano Ronaldo");
	names.add("Steven Gerald");
	names.add("Jon Smoke");
	names.add("Lionel Messi");
	FacebookApp.loadUsers(names);
	FacebookApp.seeAllFacebookUsers();
	
	Post p1 = new Post();
	p1.setBody("I scored today! And I am happy");
	p1.setDate("Nov 11, 2018");
	p1.setLikes(2344);
	
	FacebookUser benzama = FacebookApp.users.get(1);
	benzama.post(p1);
	
	FacebookApp.removeUser(benzama);
	FacebookApp.seeAllFacebookUsers();
	FacebookUser gerrard = FacebookApp.users.get(3);
	FacebookUser smoke = FacebookApp.users.get(4);
	smoke.sendFriendsRequest(gerrard);
	System.out.println(gerrard.requests.get(0).name);
	
}
}
