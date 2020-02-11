package homeWork;

import java.util.Scanner;

public class tipCal2 {
	public static void main(String[] args) {
//
//		/*
//		 * Write your code inside the method. Use the values given as method parameters.
//		 * Assign final values. Then user should select service quality that will
//		 * correspond to tip percent. Poor = 5% Fair = 10% Good = 15% Great = 20%
//		 * Excellent = 25%
//		 * 
//		 * The program should display the following information based on the user input:
//		 * Split or No split Number of people entered: &&&& Service Quality: Total to
//		 * pay: Total tip: Total per person: Tip per person:
//		 * 
//		 * Input: Split: Yes Number of people: 4 Check amount: 476.00 Service Quality:
//		 * Excellent
//		 * 
//		 * Output: Split Number of people entered: &&&& Total to pay: 595.00 Total tip:
//		 * 119.00 Total per person: 148.75 Tip per person: 29.75
//		 */
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("How many people are dinning?:");
//
//		String numberOfPeople = input.next();
//		
//		System.out.println("Split or not?:");
//		String splitOrNot = input.next();
//
//		System.out.println("How was the service: poor,fair, good, great, excellent");
//		String serviceQuality = input.next();
//
//		System.out.println("What is the total check ammount?");
//		double checkAmount = input.nextDouble();
//
//		double serviceQualityInPrecentage = 0.0;
//		double tipAmount = 0.0;
//		double tipPerPerson = 0.0;
//		double totalPerPerson = 0.0;
//
//		if (splitOrNot.equalsIgnoreCase("NO")) {
//			System.out.println("Not Split");
//			if (serviceQuality.equalsIgnoreCase("poor")) {
//				do {
//					System.out.println("&");
//					numberOfPeople--;
//				} while (numberOfPeople >= 0);
//
//			}
//
//			tipAmount = checkAmount * 0.05;
//			double totalWithTip = checkAmount + tipAmount;
//			serviceQualityInPrecentage = 5;
//			System.out.println("Number of people entered: " + numberOfPeople);
//			System.out.println("Service Quality: " + serviceQuality);
//			System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//			System.out.println("Total tip amount: " + tipAmount);
//			System.out.println("Total to pay: " + totalWithTip);
//		} else if (serviceQuality.equalsIgnoreCase("Fair")) {
//			tipAmount = checkAmount * 0.10;
//			serviceQualityInPrecentage = 10;
//
//			double totalWithTip = checkAmount + tipAmount;
//			System.out.println("Number of people entered: " + numberOfPeople);
//			System.out.println("Service Quality: " + serviceQuality);
//			System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//			System.out.println("Total tip amount: " + tipAmount);
//			System.out.println("Total to pay: " + totalWithTip);
//		} else if (serviceQuality.equalsIgnoreCase("Good")) {
//			tipAmount = checkAmount * 0.15;
//			serviceQualityInPrecentage = 15;
//			double totalWithTip = checkAmount + tipAmount;
//			System.out.println("Number of people entered: " + numberOfPeople);
//			System.out.println("Service Quality: " + serviceQuality);
//			System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//			System.out.println("Total tip amount: " + tipAmount);
//			System.out.println("Total to pay: " + totalWithTip);
//
//		} else if (serviceQuality.equalsIgnoreCase("Good")) {
//			tipAmount = checkAmount * 0.15;
//			serviceQualityInPrecentage = 15;
//			double totalWithTip = checkAmount + tipAmount;
//			System.out.println("Number of people entered: " + numberOfPeople);
//			System.out.println("Service Quality: " + serviceQuality);
//			System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//			System.out.println("Total tip amount: " + tipAmount);
//			System.out.println("Total to pay: " + totalWithTip);
//		} else if (serviceQuality.equalsIgnoreCase("Great")) {
//			tipAmount = checkAmount * 0.20;
//			serviceQualityInPrecentage = 20;
//			double totalWithTip = checkAmount + tipAmount;
//			System.out.println("Number of people entered: " + numberOfPeople);
//			System.out.println("Service Quality: " + serviceQuality);
//			System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//			System.out.println("Total tip amount: " + tipAmount);
//			System.out.println("Total to pay: " + totalWithTip);
//		} else if (serviceQuality.equalsIgnoreCase("Excellent")) {
//			tipAmount = checkAmount * 0.25;
//			serviceQualityInPrecentage = 25;
//			double totalWithTip = checkAmount + tipAmount;
//			System.out.println("Number of people entered: " + numberOfPeople);
//			System.out.println("Service Quality: " + serviceQuality);
//			System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//			System.out.println("Total tip amount: " + tipAmount);
//			System.out.println("Total to pay: " + totalWithTip);
//		}
//
//		if (splitOrNot.equalsIgnoreCase("Yes")) {
//			System.out.println("Split");
//			if (serviceQuality.equalsIgnoreCase("Poor")) {
//				tipAmount = checkAmount * 0.05;
//				double totalWithTip = checkAmount + tipAmount;
//				serviceQualityInPrecentage = 5;
//				tipPerPerson = tipAmount / numberOfPeople;
//				totalPerPerson = totalWithTip / numberOfPeople;
//
//				System.out.println("Number of people entered: " + numberOfPeople);
//				System.out.println("Service Quality: " + serviceQuality);
//				System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//				System.out.println("Total tip amount: " + tipAmount);
//				System.out.println("Tip per person is: " + tipPerPerson);
//				System.out.println("Total to pay: " + totalWithTip);
//				System.out.println("Total per person is: " + totalPerPerson);
//			} else if (serviceQuality.equalsIgnoreCase("Fair")) {
//				tipAmount = checkAmount * 0.10;
//				serviceQualityInPrecentage = 10;
//				tipPerPerson = tipAmount / numberOfPeople;
//				double totalWithTip = checkAmount + tipAmount;
//				totalPerPerson = totalWithTip / numberOfPeople;
//
//				System.out.println("Number of people entered: " + numberOfPeople);
//				System.out.println("Service Quality: " + serviceQuality);
//				System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//				System.out.println("Total tip amount: " + tipAmount);
//				System.out.println("Tip per person is: " + tipPerPerson);
//				System.out.println("Total to pay: " + totalWithTip);
//				System.out.println("Total per person is: " + totalPerPerson);
//			} else if (serviceQuality.equalsIgnoreCase("Good")) {
//				tipAmount = checkAmount * 0.15;
//				serviceQualityInPrecentage = 15;
//				tipPerPerson = tipAmount / numberOfPeople;
//				double totalWithTip = checkAmount + tipAmount;
//				totalPerPerson = totalWithTip / numberOfPeople;
//
//				System.out.println("Number of people entered: " + numberOfPeople);
//				System.out.println("Service Quality: " + serviceQuality);
//				System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//				System.out.println("Total tip amount: " + tipAmount);
//				System.out.println("Tip per person is: " + tipPerPerson);
//				System.out.println("Total to pay: " + totalWithTip);
//				System.out.println("Total per person is: " + totalPerPerson);
//			} else if (serviceQuality.equalsIgnoreCase("Great")) {
//				tipAmount = checkAmount * 0.20;
//				serviceQualityInPrecentage = 20;
//				tipPerPerson = tipAmount / numberOfPeople;
//				double totalWithTip = checkAmount + tipAmount;
//				totalPerPerson = totalWithTip / numberOfPeople;
//
//				System.out.println("Number of people entered: " + numberOfPeople);
//				System.out.println("Service Quality: " + serviceQuality);
//				System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//				System.out.println("Total tip amount: " + tipAmount);
//				System.out.println("Tip per person is: " + tipPerPerson);
//				System.out.println("Total to pay: " + totalWithTip);
//				System.out.println("Total per person is: " + totalPerPerson);
//			} else if (serviceQuality.equalsIgnoreCase("Excellent")) {
//				tipAmount = checkAmount * 0.25;
//				serviceQualityInPrecentage = 25;
//				double totalWithTip = checkAmount + tipAmount;
//				tipPerPerson = tipAmount / numberOfPeople;
//				totalPerPerson = totalWithTip / numberOfPeople;
//
//				System.out.println("Number of people entered: " + numberOfPeople);
//				System.out.println("Service Quality: " + serviceQuality);
//				System.out.println("Service quality in percentage is: " + serviceQualityInPrecentage + "%");
//				System.out.println("Total tip amount: " + tipAmount);
//				System.out.println("Tip per person is: " + tipPerPerson);
//				System.out.println("Total to pay: " + totalWithTip);
//				System.out.println("Total per person is: " + totalPerPerson);
//
//			}
//		}
	}
}


