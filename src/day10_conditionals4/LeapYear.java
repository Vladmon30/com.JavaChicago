package day10_conditionals4;

import java.util.Scanner;

public class LeapYear {

	/*2. Leap year(Febryary 29 days):
	 * if an year is 1) multiply of 400 or
	 * 2) multiple of 4 but not multiple of 100
	 * then its a leap year.
	 *  regular year -->365
	 *  leap year -->366
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year:");
		
		int year = scan.nextInt();
		if( year % 400 == 0 ) {
			System.out.println("Leap Year");
		}else if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year");
		}else {{ 
			System.out.println("Not a Leap Year");
		}
		// if if( year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0 ) ){
	}

}
}