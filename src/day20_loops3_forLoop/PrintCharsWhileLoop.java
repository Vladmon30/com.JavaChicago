package day20_loops3_forLoop;

import java.util.Scanner;

public class PrintCharsWhileLoop {
	public static void main(String[] args) {
		
		/*
		 * 2. Write a program that accepts a String word and using while loop and charAt
		 * print each char in separate line. 
		 * Ex: Enter word: 
		 * Pen 
		 * P 
		 * e 
		 * n 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = input.nextLine();
		//"Java"
		//0123
		//1234
		int index = 0;
		while (index<word.length()) {
			System.out.println(word.charAt(index));
			index++;
		}
		
		//TODO: rewrite the code using substring method!!!
	}
}
