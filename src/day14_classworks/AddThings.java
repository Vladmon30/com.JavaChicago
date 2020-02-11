package day14_classworks;

import java.util.Scanner;

public class AddThings {
public static void main(String[] args) {
	//concat--> adds two strings together
	
	
	Scanner scan = new Scanner(System.in);
	String domain = "@cybertekschool.edu";
	
	System.out.println("Please enter yo username: ");
	
	String entry = scan.nextLine();
	
	System.out.println("This is your new email school email: ");
	
	System.out.println(entry.concat(domain));

	//System.out.println(entry+domain);
}
}
