package day08_conditionals2;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		
		
		 // Write a  program that asks a students what is their Bath number
		 //if that is 10, say - we are classmate!
		 //if not, say something else 		  
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, What is your batch number?");
		
		int batch = scanner.nextInt();
		if(batch==10) {
			System.out.println("We are classmate");
		}else {
			System.out.println("You are from previouse batch");
	
		}
		 // Create a variable pin code and assign some number
		 // Ask user to enter pin code, if it matches, say access granted
		 // if not, denied
		 
		
		
		int pincode = 1234;
		System.out.println("Enter your pincode");
		int inputPincode = scanner.nextInt();
		
		if (inputPincode==pincode) {
			System.out.println("Access Granted, Welcome");
		}else {
			System.out.println("Acces Denide");
			System.out.println("Incorect pincode");
		
		}
		
		 
		 //Ask user to enter a number and check if it is odd or even
		 //if even print "It is eve number. else print it is odd number"
		
		
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		
		if(number % 2 ==0) {
			System.out.println("Even number");
		}else {
			
		
			System.out.println("Odd number");
			
		}
	scanner.close();	
	}
	
}

	


