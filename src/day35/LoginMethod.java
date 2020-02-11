package day35;

import java.util.Scanner;

public class LoginMethod {
public static void main(String[] args) {
	
	/* Method name: login
	 * Return type: void
	 * Accepts 2 arguments
	 * Parameters names;
	 * givenId
	 * givenPasword
	 * Provide within method
	 * expectedId = "johnjava"
	 * expectedPassword = "123456"
	 * 
	 * Create a logic that compares expectedId, and expectedPassword
	 * with givenId, givenPassword
	 * Have the output as  displayed
	 * 
	 * you have clicket to login button!
	 * Please enter account name:
	 * johnjava
	 * Please enter password:
	 * 123456
	 * "login Successful!"
	 * or "Either your password or account is not correect!"
	 * 
	 */
	login("johnjava","123456");
	
	
	
}
	public static void login(String expectedId, String expectedPassword) {
		
	//	String expectedId = "johnjava";
	//	String expectedPassword="123456";
		
		System.out.println("You have clicket to login button!");
		System.out.println("Please enter account name:");
		
		Scanner scan = new Scanner(System.in);
		String givenId = scan.nextLine();
		
		System.out.println("Please enter password:");
		String givenPassword = scan.nextLine();
		
		if(expectedId.equals(givenId) && expectedPassword.equals(givenPassword)) {
			System.out.println("login Successful!");
		}else  {   //if(expectedId.equals(givenId) || !expectedPassword.equals(givenPassword)) {
			System.out.println("Either your password or account is not correect!");
		}
	}
	
}
