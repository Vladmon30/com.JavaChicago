package day15_String_manipulation_review;

//Duplicate it
//1. Ask user to enter two words. Print the first word, second word, second word, first word
//Input: one
//two
//Output: onetwotwoone

import java.util.Scanner;

public class Duplicate_it {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Input first word");
		String one = scan.nextLine();
		System.out.println("Input second word");
		String two = scan.nextLine();

		System.out.println(one + two + two + one); // 1 way

		System.out.println(one.concat(two).concat(two).concat(one)); // 2way
// CTRL+SHIFT+F -->make it clean and looks good(windows)
// Command+Shift+F -->make it clean and looks good(IOS)
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(two);
		System.out.println(one);
		scan.close();
	}
}
