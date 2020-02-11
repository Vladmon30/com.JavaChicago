package day43_practice;

public class Student {

	/*
	 * Create class called Student Create 3 inctance variable String firstName
	 * String lastName static int studentCount
	 * 
	 * Create a constructor with two variables so that every time you create an
	 * object you can provide student name Add logic within the constructor so when
	 * you add a student it automaticly increased studentCount Also add loic in yor
	 * constructor so that printouts is as in the pic Create a class called Scholl
	 * and add students to them
	 * 
	 */

	String firstName;
	String lastName;
	static int studentCount; // static method is allowed to count each student and add it 

	public Student(String fn, String ln) {

		firstName = fn;
		lastName = ln;
		studentCount++;

		System.out.println("Added student: " + fn + " " + ln);
		System.out.println("Number of student " + studentCount);
	}
}
