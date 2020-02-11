package day15_String_manipulation_review;

import java.util.Scanner;

public class MiddleThree {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please type word :");
		String word = scan.nextLine();
		int wordCount = word.length();

		boolean isOdd = wordCount % 2 == 1;
		boolean has5OrMore = wordCount >= 5;

		if (isOdd && has5OrMore) {
			int beginIndex = (wordCount - 3) / 2;
			int endIndex = (wordCount + 3) / 2;

			String substring = word.substring(beginIndex, endIndex);
			System.out.println(substring);
		} else {
			System.out.println("Your word length do not match to odd number or less than 5");
		}

		scan.close();

	}
}
