package day17_reviewsession2;

import java.util.Scanner;

public class Strings02 {
	public static void main(String[] args) {
		
		// if first and first from the end are same than print "first same"
		// if second and second from the end are same than print "second same"
		// scanner with next()method
		
		Scanner input = new Scanner(System.in);
		System.out.println("Whats the word?");
		String word = input.next();
		
		//test below conditions only if word has at least 4 chars
		//if less than 4chars -> say error: at least 4 chars required for this program
		
		if(word.length() >=4) {
			
		
			// check first and last
			
			if (word.charAt(0) == word.charAt(word.length() - 1)) {
				System.out.println("Firsts same");
			}
	
			// check second and second from end
	
			if (word.charAt(1) == word.charAt(word.length() - 2)) {
				System.out.println("Second same");
			}
		}else {
			System.out.println("Error: at least 4 chars required for this program");
		}
	}
}	
	
	
	