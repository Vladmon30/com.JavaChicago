package day04_operators;

import java.util.Scanner;

public class TemperatureConverter {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a value in Fahrenheit");
			int fahrenheit =  scan.nextInt();
			double celsius = (5.0/9)*(fahrenheit -32);
			
			System.out.println("Temerature in Celsius " + (int)celsius);
			scan.close();
		}
}
