package mentoringSession1;

public class Palindrom {
	public static void main(String[] args) {
		
		// Interwie qestion
		// create a palindrom
		String word = "aataa";
		System.out.println("Is this palindrom: " + isPalindrom(word));
	}

//create function take string as parameter return is palindrom or not:boolean

	public static boolean isPalindrom(String word) {

		// what is there 10000000
		// revese is and compare
		for (int i = 0; i < word.length(); i++) {
			String character1 = word.charAt(i) + "";
			String character2 = word.charAt(word.length() - 1 - i) + "";

			if (!character1.equals(character2)) {
				return false;
			}
		}
		return false;
	}
}
