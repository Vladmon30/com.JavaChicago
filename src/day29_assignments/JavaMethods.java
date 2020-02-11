package day29_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods {

	public static void main(String[] args) {

		System.out.println("Start of program");
		System.out.println("This is Amazon.com\n");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		// invoke the method
		sayHi(name);
		System.out.println("End of program");
	}

	public static void sayHi(String name) { // String name we add the name of user--> Ex: "Hi", James
		System.out.println("This is sayHi method");
		System.out.println("Hi");
		System.out.println("Welcome," + name);
	}
}
