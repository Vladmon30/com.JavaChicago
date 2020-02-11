package homeWork;

import java.util.Scanner;

public class middleCharacter {
	public static void main(String[] args) {

		/*
		 * Write a Java method to display the middle character of a string. Go to the
		 * editor a) If the length of the string is even there will be two middle
		 * characters. b) If the length of the string is odd there will be one middle
		 * character.
		 * 
		 * Input: Input a string: elephant Output:
		 * 
		 * The middle character in the string: ph
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter word: ");

		String word = input.next();
		System.out.println(word.length());

		int middle = word.length() / 2;

		if (word.length() % 2 != 0) {

			System.out.println("Odd");
			System.out.println(word.charAt(middle));

		} else {
			// (word.length() % 2 == 0)
			System.out.println("Even");
			System.out.println(word.charAt(middle - 1) + "" + word.charAt(middle));

		}
	}
}
