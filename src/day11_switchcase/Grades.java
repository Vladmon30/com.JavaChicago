package day11_switchcase;

import java.util.Scanner;

public class Grades {
public static void main(String[] args) {
	
	/*"Grade"
	 * A->Excellent
	 * B->Good
	 * C->Acceptable
	 * D->Poor
	 * Anything Else -> Error:invalid grade
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println(" Enter Grade: ");
	char grade = scan.next().charAt(0);
	
	switch(grade) {
	case 'A':
		System.out.println(" Excellent");
		break;
	case 'B':
		System.out.println("Good");
		break;
	case 'C':
		System.out.println("Acceptable");
		break;
	case 'D':
		System.out.println("Poor");
		break;
	default:
		System.out.println("ERROR:Invalid Grade");
	//it is optional 
}
}
}