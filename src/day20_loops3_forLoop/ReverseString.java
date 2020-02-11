package day20_loops3_forLoop;

public class ReverseString {
	public static void main(String[] args) {
		/*
		 * take string variableword and reverse it using for loop example: java - avaj
		 * vlad-dalv
		 */
		String word = "VLAD";
		String reversed = "";

		// using for loop-loop from length of word - 1 until 0
		// and use either charAt or substring and add that character
		// to reserve string

		for (int i = word.length() - 1; i >= 0; i--) {
			reversed = reversed + word.charAt(i);
		}
		System.out.println(reversed);
	}
}
