package day14_classworks;

import java.util.Scanner;

public class StatingTheObvious {
	public static void main(String[] args) {
	//what is your email
	//...gmail.com
	//oh so u have gmail.
	
	
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter yor email: ");
	String entry = scan.nextLine();
	
	//donaldthedck@gmail.com
	
	
	//1 find the location of the '@sign'
	//2 find location of the '.'
	//3 substring sing those two locations
	
	int start = entry.indexOf("@")+1;//it is getting the location of the'@'sign and adding 1
									// if we dont add 1, it will include @ sign in the subsstring
	
	
	System.out.println(start);
	
	int end = entry.indexOf(".");
	System.out.println("Oh u have a: " + entry.substring(start,end));
}
}
