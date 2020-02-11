package day20_loops3_forLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	public static void main(String[] args) {
		/*
		 * Random is a class name, the purpose of this class is to generate random
		 * numbers
		 */

		Random random = new Random();
		System.out.println(random.nextInt(10)); // give me random number beetween 0 and 9
		Scanner input = new Scanner(System.in);
		// System.out.println("Num value:" + num);
		// 0-35. random.next(36);
		int secretNumber = random.nextInt(10);
		int guessedNumber;

		do {
			System.out.println("Guess the number:");
			guessedNumber = input.nextInt();
			
			if (guessedNumber == secretNumber) {
				System.out.println("Congratulation! You won!");
				
			} else if (guessedNumber > secretNumber)
				System.out.println("Too large");

			 else {
				System.out.println("Too Small");
			 }
		}while(secretNumber!=guessedNumber);
	}
}
		

