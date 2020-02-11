package day19_loops2;

import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[] args) {
		/*
		 * ask for 5 $ and keep asking for 5$ until you get it or User enters it
		 */
		Scanner input = new Scanner(System.in);

		int amount;
		int tries = 3;// it should give chance to give 5$ max 3 times
		do {

			System.out.println("Give me 5$");
			amount = input.nextInt();
		} while (amount != 5);

		System.out.println("Thank you for 5$");
	}

	
	}
