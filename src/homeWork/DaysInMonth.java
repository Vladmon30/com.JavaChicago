package homeWork;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {

		/*
		 * Write a Java program to find the number of days in a month. Assume February
		 * has 29 days. Input: Input a month number: 2 Output : February has 29 days
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Input a month number:");
		int month = input.nextInt();

		String monthName;
		int daysInMonth = 0;

		switch (month) {
		case 1:
			monthName = "January";
			daysInMonth = 31;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 2:
			monthName = "February";
			daysInMonth = 29;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 3:
			monthName = "Marh";
			daysInMonth = 31;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 4:
			monthName = "April";
			daysInMonth = 30;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 5:
			monthName = "May";
			daysInMonth = 31;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 6:
			monthName = "June";
			daysInMonth = 30;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 7:
			monthName = "July";
			daysInMonth = 31;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 8:
			monthName = "August";
			daysInMonth = 31;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 9:
			monthName = "September";
			daysInMonth = 30;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 10:
			monthName = "October";
			daysInMonth = 31;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 11:
			monthName = "November";
			daysInMonth = 30;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
		case 12:
			monthName = "December";
			daysInMonth = 31;
			System.out.println(monthName +" have "+daysInMonth + " days");
			break;
	
		default:
			System.out.println("ERROR:Invalid month. It can be only 12 month");

		}
	}
}
