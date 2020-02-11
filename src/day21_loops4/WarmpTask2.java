package day21_loops4;

import java.util.Scanner;

public class WarmpTask2 {
public static void main(String[] args) {
	
	/* 2. Accept a String and a character. 
	 * Find out how many times that character appears in the string.
	 *  Enter word:
	 *  java
	 *  Enter character:
	 *  a
	 *  2
	 */
	Scanner input = new Scanner(System.in);
	System.out.println("Enter word:");
	String word = input.next().toLowerCase();
	word = word.toLowerCase();
	
	System.out.println("Enter character:");
	char ch = input.next().toLowerCase().charAt(0);
	
	
	int counter = 0;
	for(int i = 0; i < word.length(); i++) {
		//System.out.println(word.charAt(i));
		if(word.charAt(i)==ch) {
			//System.out.println("found c");
			counter++;
		
		}
	}
	System.out.println(counter); // enter word: FORloop.
								 // character: 0
								 // 3--o
	
}
}
