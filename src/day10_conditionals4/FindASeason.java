package day10_conditionals4;

import java.util.Scanner;

public class FindASeason {
public static void main(String[] args) {
	/*
	 *1 Find a season
	 * month--> number and find the season of the year
	 * 
	 */
	/*System.out.println("Please select number:" );

Scanner scan = new Scanner(System.in);

int season = scan.nextInt();
String month;
	if (season == 1) {
		month = "January";
	}else if(season == 2) {
		month = "Febriary";	
	}else if(season == 3) {
		month = "March";
	}else if(season == 4) {
		month = "April";
	}else if(season == 5) {
		month = "May?";
	}else if(season == 6) {
		month = "June";
	}else if(season == 7) {
		month = "July";	
	}else if(season == 8) {
		month = "August";
	}else if(season == 9) {
		month = "September";
	}else if(season == 10) {
		month = "October";
	}else if(season == 11) {
		month = "November";
	}else if(season == 12) {
		month = "December";
	}else {
		month = "Only can 12 season";
	}
		System.out.println(month);
		  
}
}
*/
	int month = 9;
	if(month == 12 || month == 1 || month ==2) {
		System.out.println("Winter");
	}else if (month >= 3 && month<=5) {
		System.out.println("Spring");
	}else if (month >= 6 && month<=8) {
		System.out.println("Summer");
	}else if (month >= 9 && month<=11) {
		System.out.println("Fall");
	}else {
		System.out.println("Invalid month. 1- 12accepted");
	}
	}
	}
	
	
	
	
	
	
	
	