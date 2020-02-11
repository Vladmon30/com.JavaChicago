package day23_loopsReview;

import java.util.Scanner;

public class WorkUpTask_PhoneNumberValidator {
	public static void main(String[] args) {

		/*
		 * Program PhoneNumberValidator - simple phone number format check. Accepts
		 * phone number in one of two formats: (202)3334444 or 2023334444 Checks:
		 * 
		 * - if length is not 12 or 10 characters, then -> show error message : invalid
		 * length - must be either 12 or 10 characters.
		 * 
		 * - If first character is '(' then 1. fifth character must be ')' -> if not
		 * show error message: Invalid format -there is no closing parenthesis.
		 * 
		 * - Get rid of parentheses using replace method - code:
		 * 
		 * phoneNumber = phoneNumber.replace( "(", "");
		 * 
		 * phoneNumber = phoneNumber.replace( ")", "");
		 * 
		 * - Using a loop check if each character is a number between 0-9. -> if not
		 * show error message: Invalid character - must be a number between 0-9.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter phone number");
		
		String phoneNumber = input.next();
		//-if length is not 12 or 10 characters,
		//then -> show error message:  
		//invalid length - must be either 12 or 10 characters
		//(222)2222
		
		if (phoneNumber.startsWith("(")) {
			if(phoneNumber.length() !=12) {
				System.out.println("Invalid length - must be either 12 or 10 characters.");
				return;
			}
		}else {
			if (phoneNumber.length() != 10) {
				System.out.println("Invalid length - must be either 12 or 10 characters.");
				return;
			
		}
	}
		System.out.println("Phone number length is good");
		

/*		if ((phoneNumber.startsWith("(") && phoneNumber.length() != 12) && phoneNumber.length() != 10) {
			System.out.println("Invalid length - must be either 12 or 10 characters.");
			return;
		}
		System.out.println("Phone number length is good");

		// -If first character starts is "(" then 1. fifth character must be ")"
		// -> If not show error message: Invalid format - there is no closing
		// parantanses
	*/
		
		if(phoneNumber.charAt(0)=='(') {
			if(phoneNumber.charAt(4)!=')') {
			System.out.println("Invalid length - must be either 12 or 10 characters.");
			return;
			}
		}
		System.out.println("Parantanses format check passed");
		
		phoneNumber = phoneNumber.replace("(", "");  // if there is "(" then remove it
		phoneNumber = phoneNumber.replace(")", "");  // if there is ")" then remove it
		phoneNumber = phoneNumber.replace("-", "");  // remove dashboards
		
		
		// loop and check if each character is a number 0-9;
		
		for(int i = 0; i < phoneNumber.length(); i++) {;
			if(!(phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i)<='9')) {
				System.out.println("Invalid character - must be a number betwen 0-9." + phoneNumber.charAt(i));
				return;
			}
		}
		System.out.println("All numbers detected.");
}
}

