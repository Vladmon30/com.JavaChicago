package day28_EssenClass;

import java.util.Scanner;

public class PrintFirstLastChar1 {
	public static void main(String[] args) {

		/*
		 * Given a String array words, iterate through each word and print first and
		 * last letter of each element in separate lines. Ex: words → ["hello", "why",
		 * "by", "apple" , "note"] print: ho wy by ae ne
		 *
		 */

		//Scanner input = new Scanner(System.in);
		//String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		String[] words = {"James", "John", "Mark", "Adam", "Donald"};
		
		
		
	// print out first and last char of each word
		for (String temp : words) {
	// take first letter and last letter each variables
		System.out.println(temp.charAt(0)+""+ temp.charAt(temp.length() - 1));
		
		
		}
		}
	}
