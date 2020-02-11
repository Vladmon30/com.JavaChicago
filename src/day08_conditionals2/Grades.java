package day08_conditionals2;

public class Grades {
public static void main(String[] args) {
	/*
	 * A,B,C,D
	 * 	Use char variable
	 * if grade is A--> Excellent
	 * if grade is B--> Good
	 * if grade is C--> Acceptable
	 * if grade is D --> Fail
	 * Anythi other that-> Not valid grade
	 */
	
	
	char grade = 'A';
	if(grade == 'A') {
		System.out.println("Excellent");
	}else if (grade =='B') {
		System.out.println("Good");
	}else if (grade =='C') {
		System.out.println("Acceptable");
	}else if (grade =='D') {
		System.out.println("Fail");
		System.out.println("Work harder");
	}else {
		System.out.println("Invalid Gade. Only A,B,C,D allowed");
	}
  }
}
