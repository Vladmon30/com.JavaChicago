package day41_constructor;

public class SocialMedia {
public static void main(String[] args) {
	
	FacebookUser us1 = new FacebookUser("Vlad", "0000");
	
	us1.numOffriends = 5000;
	
	FacebookUser us2 = new FacebookUser("Dima", "1111");

	us2.age = 2;
	us2.name = "Oleg";
	us2.numOffriends = 300;
	System.out.println(us2.age);
	System.out.println(us2.numOffriends);
	
	FacebookUser us3 = new FacebookUser("John", "John123", "John Doe");
	
	System.out.println(us3.password);
	
	us3.sendFriendsRequest(us1);
	
	boolean check = us3.sendFriendsRequest(us1);
	System.out.println(check);
	System.out.println("------------");
	us1.userInfo();
	us2.userInfo();
	us3.userInfo();
	
	//____________________________________________________________________________
	System.out.println("------DELITING ACCOUNT------");
	
	us1.userInfo();
	
	FacebookUser.deleteAccount(us1);
	
	
	//FacebookUser.seeUserInfo(us3);
}
}
