package day41_constructor;

import java.util.Scanner;

public class CatOwner {
public static void main(String[] args) {
	
	
	Cat c = new Cat("mail", "regular american");
	
					//c.eat();
					//Scanner s = new Scanner(System.in);			
		System.out.println(c.gender);  // mail
					// c.gender = "female";  // its gonna change gender to femail 
		
	Cat c2 = new Cat("female", "British", 5);
	
		System.out.println(c.breed);   // regular american
		System.out.println(c2.breed);
	
}
}
