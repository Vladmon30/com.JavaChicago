package homeWork;

import java.util.Scanner;

public class CalculatePhoneBill {
public static void main(String[] args) {
	
	/*Level: Easy/Med

	 *Write a Java program CalculatePhoneBill to calculate the monthly telephone bills as per the following rule: 
	 *Ask user to enter number of calls.
	 *Minimum $200 for up to 100 calls. 
	 *Plus $0.60 per call for next 50 calls. 
	 *Plus $0.50 per call for next 50 calls. 
	 *Plus $0.40 per call for any call beyond 200 calls.

	 *Examples:
	 *Enter number of calls:
	 *88
	 *Your bill is $200.0

	 *Enter number of calls:
	 *120
	 *Your bill is $212.0

	 *Enter number of calls:
	 *185
	 *Your bills is $247.5
	 *
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of calls: ");
	
	int calls = scan.nextInt();
	double bill = 0.0; {
		
	
	if (calls > 0 && calls <= 150) {
		bill = (0.60 *calls);
	}else if (calls>= 151 && calls <= 200) {
		bill = (0.50 *calls);
	}else if (calls>= 200 ) {
		bill = (0.40 *calls);
	}else {
		System.out.println("Wrong information!");
	}
	if (calls > 0)
		System.out.println("Your bill is: "+calls+" calls - $" + bill);
	
	

		}
	}
}
