package day20_loops3_forLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber3 {
	public static void main(String[] args) {

		Random random = new Random();
		System.out.println(random.nextInt(10)); // give me random number beetween 0 and 9
		Scanner input = new Scanner(System.in);
		// System.out.println("Num value:" + num);
		// 0-35. random.next(36);
		int secretNumber = random.nextInt(10);
		int guessedNumber;

		/*
		 * only 5 chances to guess;
		 * 
		 */
		int iTries = 0;

		do {
			System.out.println("Guess the number:");
			guessedNumber = input.nextInt();
			iTries++;

			if (guessedNumber == secretNumber) {
				System.out.println("Congratulation! You won!");
				break;	
			} else if (guessedNumber > secretNumber)
				System.out.println("Too large");

			else {
				System.out.println("Too Small");
			}
			
			if (iTries == 5) {
				System.out.println("You lost");
				System.out.println("Secret number is: " + secretNumber);
				break;
			}
			
		} while (secretNumber != guessedNumber && iTries <= 5);

	}
}
