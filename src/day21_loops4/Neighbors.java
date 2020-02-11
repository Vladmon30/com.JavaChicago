package day21_loops4;

public class Neighbors {
	public static void main(String[] args) {
		/*
		 * String word and you need check for same characters side by side if found say
		 * "beep" character ex: bccddefg cc Beep - c dd Beep - d
		 */

		String word = "javvva";

		for (int n = 0; n < word.length() - 1; n++) {
			if (word.charAt(n) == word.charAt(n + 1)) {
				System.out.println("Beep - " + word.charAt(n));

			}

		}
				//	0,1 -> j
				//	1,2 -> a
				//	2,3 -> v
				//  3,4 -> v  -> beep
					
		for (int n = 0; n < word.length() - 1; n++) {
			if (word.substring(n, n + 1).equals(word.substring(n + 1, n + 2))) {
				System.out.println("Beep - " + word.substring(n, n + 1));

			}
		}
	}
}