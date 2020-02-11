package day17_reviewsession2;

import java.util.Scanner;

public class Strings03 {
	public static void main(String[] args) {

		// take a String countryName and abbreviate it bytaking first 2 letter
		// contryName -> Bangladesh->BA, toUppercase()

		Scanner input = new Scanner(System.in);
		System.out.println("Enter contry name: ");
		String contryName = input.nextLine();
		// -> 0-B, 1-a, 2-n
		// 2 is not included always
		String abbreviated = contryName.substring(0, 2).toUpperCase();
		// or we can do -- abbreviated= abbreviated.toUpperCase();
		System.out.println(abbreviated);

		//ternary conditions using ? :
		//check if abbreviated is 2 chars:
		// if true -> say "2 chars detected"
		// else say "2 chars we not found"

		//1st way
		System.out.println(abbreviated.length() == 2 ? "2 chars detected" : "2 chars detected");
		
		//2nd way
		String msg1 = "2 chars detected";
		String msg2 = "2 chars were not fond";
		String result = abbreviated.length() ==2 ? msg1 : msg2;
		System.out.println(result);
		
		/*
		 * if 2 chars{
		 *      if first char is U {
		 *         say "Maybe USA"
		 *      }else{
		 *         say "Not USA"
		 *         }
		 * }else{
		 *  	   say 2 chars were not found
		 * }
		 */
		
 result = abbreviated.length() == 2 ? 
		 abbreviated.charAt(0) == 'U'? "Maybe USA" : "Not USA"
			 :"2 chars were not found";
 System.out.println(result);
}
}
