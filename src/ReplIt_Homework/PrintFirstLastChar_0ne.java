package ReplIt_Homework;

import java.util.Scanner;

public class PrintFirstLastChar_0ne {
	public static void main(String[] args) {

		/*
		 * Given a String array words, iterate through each word and print first and
		 * last letter of each element in separate lines.
		 * 
		 * Example:
		 * words → ["hello", "why", "by", "apple" , "note"] 
		 * print: 
		 * ho 
		 * wy 
		 * by 
		 * ae 
		 * ne
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    //TODO: Write your code below
	    for (String temp : words) {
	    	// take first letter and last letter each variables
	    		System.out.println(temp.charAt(0)+""+ temp.charAt(temp.length() - 1));
	}  
	}  
}