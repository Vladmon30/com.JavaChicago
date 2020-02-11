package day11_switchcase;

import java.util.Scanner;

public class CheckClass {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter Day:");
	int day = scan.nextInt();
	
	String  classAtSchool = "", weekdayName="";
	
	
	if(day == 1) {
		classAtSchool = "Group Project ";
		weekdayName = "Monday";
	}else if (day == 2 ) {
		classAtSchool = "Java Programming";
		weekdayName = "Tuesday";
	}else if (day == 3 ) {
		classAtSchool = "Java Programming";
		weekdayName = "Wednesday";
	}else if (day == 4 ) {
		classAtSchool = "Manual QA/SDLC/Softscills";
		weekdayName = "Thursday";
	}else if (day == 5 ) {
		classAtSchool = "No Class";
		weekdayName = "Friday";
	}else if (day == 6 ) {
		classAtSchool = "No Class";
		weekdayName = "Saturday";
	}else if (day == 7 ) {
		classAtSchool = "No Class";
		weekdayName = "Sunday";
	}else {
		System.out.println("Error: Invalid Day");
	}
		System.out.println("Day of Week " + weekdayName +"\n"+ 
				            "Clas: "+ classAtSchool);
  }

}  
		
		