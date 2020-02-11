package day15_String_manipulation_review;

import java.util.Scanner;

public class MiddleOne {
	public static void main(String[] args) {
		// Middle one
		// 1. Ask user to enter a word. If the word has odd number of characters and has
		// 3 or more characters, print
		// the character in the middle of the word.
		// Input: eight
		// Output: g

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word :");
		String entry = scan.nextLine();

		boolean isOdd = entry.length() % 2 == 1;
		System.out.println("isOdd: " + isOdd);

		boolean has3ormore = entry.length() >= 3;
		System.out.println("has 3 or more:" + has3ormore);

		if (isOdd && has3ormore) {
			// print the character in the middle of the word
			// entry.length()--> //whole length//

			int length = entry.length();
			System.out.println("length:" + length);
			int mid = length / 2;
			System.out.println("mid:" + mid);
			System.out.println(entry.charAt(mid));
		}

	}
}
