package day35;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {
public static void main(String[] args) {
	// This is a good day
	
	
	
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a sentence:");
	String sentence = scan.nextLine();
	countWords(sentence);
			
	}
	public static void countWords(String str) {
		String [] splitStr = str.split("");
		String splitArr= Arrays.toString(splitStr);
		System.out.println("The value of the split string is as folowed" + splitArr);
		
		System.out.println("The number of words in this sentence:" + splitStr.length);
}
}
