package day09_conditionals3;

import java.util.Scanner;

public class CreditScore {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("---Fico Credit Score---");
	System.out.println("Enter your credit score");
	
	int creditScore = scan.nextInt();
	String creditStatus = "Unknown";
	int percentage = 0;
	 
	if (creditScore < 0 || creditScore > 850) {
	creditStatus = "Invalid Credit score. Cant be negative or more then 850";
	}else if(creditScore == 0) {
		creditStatus = "No credit History";
	}else if(creditScore >= 1 && creditScore < 299) {
		creditStatus = "Bad Credit";
	}else if(creditScore >= 300 && creditScore < 579) {
		creditStatus = "Very poor credit";
		percentage = 16;
	}else if(creditScore >= 580 && creditScore < 669) {
		creditStatus = "Fair credit";
		percentage = 18;
	}else if(creditScore >= 670 && creditScore < 739) {
		creditStatus = "Good credit";
		percentage = 21;
	}else if(creditScore >= 740 && creditScore < 799) {
		creditStatus = "Very Good credit";
		percentage = 25;
	}else if(creditScore >= 800 && creditScore < 850) {
		creditStatus = "Good credit";
		percentage = 20;
		
	}
	
	System.out.println(creditStatus);
	System.out.println("Precentegei in USA:" + percentage);
	scan.close();
}
}
