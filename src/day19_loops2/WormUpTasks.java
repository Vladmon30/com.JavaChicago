package day19_loops2;

import java.util.Scanner;

public class WormUpTasks {

	public static void main(String[] args) {
		
		
		// 1. Write a program that takes string word and converts first letter
		// to uppercase and the rest to lowercase. Print it after conversion.
		
		//Scanner input = new Scanner(System.in);
		//System.out.println("Type a word to convert:");
		//String word = input.nextLine();

		// use substring to take first letter from "yokohama"
		// cut it from 0 = y, 1 = o but not included
		String word = "yOKOHAMA";
		// first letter substring to UpperCase
		 System.out.println(word.substring(0,1).toUpperCase());
		// put all other letter after Y--> to lower case
		 System.out.println(word.substring(1).toLowerCase());
		
		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		System.out.println(word);

		// 2. Write a program to print numbers from 1 to 10.
		// in same line, separated by space

		int num = 1;
		while (num <= 10) {
			System.out.print(num + " "); // add space to oure program
			++num; // add one to num
		}
		System.out.println("Num value" + num);

			// 3. Write a program to print numbers from 10 to 1.
			// in same line, separated by space

		//	int number = 10;
		//	while (number >= 1) {
		//		System.out.print(number + " "); // add space to oure program
		//		--num; // add one to num
		//	}
		//	System.out.println("Num value" + number);

		}
	}

