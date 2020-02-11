package day06_operators_boolean;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		/*
		 * Create a program tat convert miles to kilometrs
		 * 
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter miles: " );
		
		double miles = input.nextDouble(); 
		double Kms = miles * 1.609344;
		
		System.out.println( "Kms value is: " + Kms);
		
		
		/*
		 * Write a program asks users to enter current car odometer miles 
		 * and previous car odometer miles. Also number of gallons that was put.
		 * price per gallon.
		 * 
		 *  calculate Mpg --> miles per gallone value
		 *  calculate total fuel expense.
		 * 
		 */
		
		
		System.out.println("Enter Current Odometer value:");
		double currentOdometerValue = input.nextDouble();
		
		System.out.println("Enter Previous Odometer value: ");
		double previousOdometerValue = input.nextDouble();
		
		System.out.println("Enter gallons: ");
		double gallons = input.nextDouble();
		
		System.out.println("Price Per gallon:");
		double pricePerGallon = input.nextDouble();
		
		double mpg = (currentOdometerValue - previousOdometerValue ) / gallons;
			
		System.out.println("MPG value:" + mpg);
		
		double totalCost = gallons * pricePerGallon;
		System.out.println("Your total cost is $:" + totalCost );
		input.close();		
	}
	
}
