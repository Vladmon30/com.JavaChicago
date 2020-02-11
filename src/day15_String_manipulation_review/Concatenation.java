package day15_String_manipulation_review;

import java.util.Scanner;

//Concatenation
//1. Ask user to enter two words. Then add them together and print.
//Input: one
//eight
//Output: oneeight
//2. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and
//the first letter of the last letter is the same, print that character once.
//Input: one
//eight
//Output: oneight

public class Concatenation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a word"); // CTRL+SHIFT+F -->make it clean and looks good(windows)
													// Command+Shift+F -->make it clean and looks good(IOS)
		String one = scan.nextLine();
		System.out.println("Please enter another word");
		String two = scan.nextLine();

		int lenth = one.length(); // first get the lenth of first word
		char last = one.charAt(lenth - 1); // last char of the first word
		System.out.println("last" + last);

		char first = two.charAt(0);
		System.out.println("first: " + first);
		
		if (last==first) {
			System.out.println(one+two.substring(1));
		}else {
			System.out.println(one + two);		
		}
		System.out.println(one + two);
	}
}
