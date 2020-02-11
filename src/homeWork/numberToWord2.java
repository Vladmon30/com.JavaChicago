package homeWork;

import java.util.Scanner;

public class numberToWord2 {
	public static void main(String[] args) {

		/*
		 * Level: Medium Create a program called NumberToWords2. Program accepts a
		 * number between 0 and 1000 And prints the word for the number.
		 * 
		 * Ex: Enter number: 500 five hundred
		 * 
		 * Enter number: 78 seventy eight
		 *
		 */

		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number from 0 to 1000: ");
		int num = number.nextInt();

		int hundreds = num / 100;
		int tens = num % 100 / 10;
		int ones = num % 10;

		System.out.println("hundreds" + hundreds);
		System.out.println("tens" + tens);
		System.out.println("ones" + ones);

		String stringHundreds = "";
		String stringTens = "";
		String stringOnes = "";

		switch (hundreds) {
		case 1:
			stringHundreds = "One hundred";
			break;
		case 2:
			stringHundreds = "Two hundred";
			break;
		case 3:
			stringHundreds = "Three hundred";
			break;
		case 4:
			stringHundreds = "Four hundred";
			break;
		case 5:
			stringHundreds = "Five hundred";
			break;
		case 6:
			stringHundreds = "Six hundred";
			break;
		case 7:
			stringHundreds = "Seven hundred";
			break;
		case 8:
			stringHundreds = "Eight hundred";
			break;
		case 9:
			stringHundreds = "Ningh hundred";
			break;
		case 10:
			stringHundreds = "Ten hundred";
			break;
		}

		switch (tens) {
		case 1:
			stringTens = "Ten";
			break;
		case 2:
			stringTens = "Twenty";
			break;
		case 3:
			stringTens = "Thirty";
			break;
		case 4:
			stringTens = "Fourty";
			break;
		case 5:
			stringTens = "Fifty";
			break;
		case 6:
			stringTens = "Sixty";
			break;
		case 7:
			stringTens = "Seventy";
			break;
		case 8:
			stringTens = "Eighty";
			break;
		case 9:
			stringTens = "Ninghty";
			break;
		case 10:
			stringTens = "Hundred";
			break;
		}

		switch (ones) {
		case 1:
			stringOnes = "one";
			break;
		case 2:
			stringOnes = "Two";
			break;
		case 3:
			stringOnes = "Three";
			break;
		case 4:
			stringOnes = "Four";
			break;
		case 5: 
			stringOnes = "Five";
			break;
		case 6:
			stringOnes = "Six";
			break;
		case 7: 
			stringOnes = "Seven";
			break;
		case 8:
			stringOnes = "Eight";
			break;
		case 9:
			stringOnes = "Ninght";
			break;
		case 10:
			stringOnes = "Ten";
			break;
		}
		
		
		System.out.println( stringHundreds + " " + stringTens + " "+stringOnes);
		
		
	}
}
