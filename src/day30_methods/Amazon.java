package day30_methods;

import java.util.Scanner;

public class Amazon {
public static void main(String[] args) {
	System.out.println("This is Amazon aplication");
	System.out.println("Please login: ");
	System.out.println("username: ");
	Scanner input = new Scanner(System.in);
	String username = input.nextLine();
	System.out.println("password: ");
	String pass = input.nextLine();
	
	welcome(username);
	System.out.println(username);
	System.out.println(username.hashCode());
	System.out.println("\n\nEnd of Amazon program");
	
	
}
//create a method that accepts String and says "Welcome user"

public static void welcome(String user){
	System.out.println("welcome, " + user + "!!!");
	
	System.out.println(user.hashCode());
	System.out.println("modified user:" + user);
}



}
