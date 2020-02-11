package homeWork;

import java.util.Scanner;

public class numberToWords1 {
	public static void main(String[] args) {

		/*
		 * Level: Easy Create a program called NumberToWords. Program accepts a number
		 * between 0 and 10 And prints the word for the number. Try to use switch
		 * statement. 
		 * Ex: 
		 * Enter number: 5 five
		 * 
		 */
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 10: ");
		int num = number.nextInt();

		switch (num) {
		case 1:
			System.out.println(num + " - One");
			break;
		case 2:
			System.out.println(num + " - Two");
			break;
		case 3:
			System.out.println(num + " - Three");
			break;
		case 4:
			System.out.println(num + " - Four");
			break;
		case 5:
			System.out.println(num + " - Five");
			break;
		case 6:
			System.out.println(num + " - Six");
			break;
		case 7:
			System.out.println(num + " - Seven");
			break;
		case 8:
			System.out.println(num + " - Eight");
			break;
		case 9:
			System.out.println(num + " - Nine");
			break;
		case 10:
			System.out.println(num + " - Ten");
			break;
		default:
			System.out.println("No such number");

		}
		System.out.println("Yahoooo!!!!");
	}
}