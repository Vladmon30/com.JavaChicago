package day17_reviewsession2;

import java.util.Scanner;

public class MonthsToAge {
	public static void main(String[] args) {

		/*
		 * Program check age and status by number of month:
		 * 
		 * 1-4 weeks - neonate 1 month - 1year - infant 1 - 3 year - toddler 3 - 5 year-
		 * pre-school 6 - 12 year - school year 13 - 18 year - adolescent 19 - 40 year -
		 * young adult 41 - 65 year - middle adult 65 - more year - older adult
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter month: ");

		double months = input.nextDouble();

		if (months <= 0.0) {
			System.out.println("Not born yet");
			return; // get out from method, dont run bellow
		}

		// based on month find out year
		// devide month by 12 and get whole years
		int year = (int) (months / 12);
		// find out number of remaining months
		int remainingMonths = (int) (months % 12);

		String ageGroup = "";

		if (months < 1.0) {
			ageGroup = "Neonate";
			System.out.println("Weeks old: " + months / 4.0);
		} else if (year < 1) {
			ageGroup = "Infant";
			System.out.println("Months:" + months);
		} else if (year < 13) {
			if (year < 3) {
				ageGroup = "Toddler";
			} else if (year < 6) {
				ageGroup = "Pre-school child";
			} else {
				ageGroup = "School age child";
			}
		} else if (year < 65) {
			if (year < 19) {
				ageGroup = "Adolescent";
			} else if (year < 41) {
				ageGroup = "Young Adult";
			} else {
				ageGroup = "Middle age Adult";
			}
		} else {
			ageGroup = "Older Adult";
		}
		System.out.println("Age group:" + ageGroup);
		System.out.println("Years:" + year);
		System.out.println("Months:" + remainingMonths);
	}
}
