package day38_recab_sb_wrapper_classes;

public class Task1 {
	public static void main(String[] args) {
		
		System.out.println(removeCon("consequences"));
		System.out.println(removeCon("constant value"));
		System.out.println(removeCon("continue"));
		System.out.println(removeCon("james"));
		System.out.println(removeCon("concon"));
		System.out.println(removeCon("co"));
	}

	/*
	 * 
	 * 1. Create a method that accepts String. 
	 * Method should check if given String contains word “con”. 
	 * If yes then it removes word “con” from the given String and returns modified String. 
	 * Special cases:1.You need to check if given String is ONLY one word. 
	 * If given string is two or more words then print “Invalid data”, terminate the method and return empty String. 
	 * 2.You need to check if given String length is at least 
	 * 3. If less than 3 then print “Invalid data”, terminate the method and return empty String.
	 * 3.If given String doesn’t contain word “con” return the given word itself.
	 * Note: When removing word use StringBuilder’s delete method. 
	 * Input: “Consequences”Output: “sequences”Input: “James”
	 * Output: “James”Input: “concept map”Output: print: “Invalid data” return value: “”
	 * 
	 */
	
	
	
	public static String removeCon(String word) {

		word = word.toLowerCase().trim(); // everything lowercase and have no space
		/*
		 * 1 You need to check if given String is ONLY one word. If given string is two
		 * or more words then print “Invalid data”, terminate the /* method and
		 * 
		 */

		if (word.contains(" ")) {
			System.out.println("Invalid data");
			return "";
		}

		/*
		 * 2.You need to check if given String length is at least 3. If less than 3 then
		 * print “Invalid data”, terminate the method and return empty String.
		 */

		else if (word.length() < 3) { 								// 2. check if word length not less then 3
			System.out.println("Invalid data");
			return "";
			
		/*
		 * 3.If given String doesn’t contain word “con” return the given word itself.	
		 */
			
			
		} else if (word.contains("con")) {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(word.indexOf("con"), word.indexOf("con") + 3);   // *try to delete 'con' from start from index 'c' 
			return sb.toString();                                      // * end on position 'n' wich (con+3)

		} else {
			return word;
		}
	}
}
