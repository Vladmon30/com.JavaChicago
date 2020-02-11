package day13_stringmanipulation;

import java.util.Scanner;

public class CheckWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 names");
		
		String word1 = scan.next();
		String word2 = scan.next();
		String word3 = scan.next();
		
		if (word1.length() == word2.length() 
		 && word2.length() == word3.length()) {
		    System.out.println("All word are the same legth");
												  //or
        }else if (word1.length() == word2.length() 
			   || word1.length() == word3.length()
			   || word2.length() == word3.length()) {
		  System.out.println("Not same nor different lengths");
			
		}else 
		  System.out.println("All different lengths");
		}
	}
