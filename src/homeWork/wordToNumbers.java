package homeWork;

import java.util.Scanner;

public class wordToNumbers {
	public static void main(String[] args) {

		/*
		 * Level: easy. Create a program called WordToNumbers. Program accepts a number
		 * between 0 and 10 in words (like: zero, one, two etc )And prints the number
		 * for word. Your program should be able to handle both
		 * lowercase,uppercase,mixedcase letters Ex: Enter word: Five 5
		 * 
		 * Enter word: TEN 10
		 * 
		 * Enter word: three 3
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word: ");

		String inpword = scan.next();
	
		if (inpword.equals("one")) {
			System.out.println("One - 1");
		} else if (inpword.equals("two")) {
			System.out.println("Two - 2");
		} else if (inpword.equals("three")) {
			System.out.println("Three - 3 ");
		} else if (inpword.equals("four")) {
			System.out.println("Four - 4");
		} else if (inpword.equals("five")) {
			System.out.println("Five - 5 ");
		} else if (inpword.equals("six")) {
			System.out.println("Six - 6");
		} else if (inpword.equals("seven")) {
			System.out.println("Seven - 7 ");
		} else if (inpword.equals("eight")) {
			System.out.println("Eight - 8");
		} else if (inpword.equals("nine")) {
			System.out.println("Nine - 9 ");
		} else if (inpword.equals("ten")) {
			System.out.println("Ten - 10 ");
						
		} else
			System.out.println("Error. Wrong number");
	}
	
}
