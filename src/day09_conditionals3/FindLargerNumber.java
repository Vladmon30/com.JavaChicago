package day09_conditionals3;

import java.util.Scanner;

public class FindLargerNumber {
	/*
	 * 1 u have 2 variables num1, num2 
	 * assign value of larger one into variable max
	 * print value of max -> "Max: number"
	 * 
	 * 2
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("--I FIND LARGER NUMBER--");
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.println("Enter 2 number");
	
		num1=scan.nextInt();
		num2=scan.nextInt();
						
		if (num1 > num2) {
			max = num1;
		}else if(num2 > num1){
			max = num2;
		}else {
			max = num1;
		}
			System.out.println("Max:" + max);
			
			
			System.out.println("--I FIND LARGER NUMBER--");
			System.out.println("Enter 3 number");
			
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
			
			if(num1 >= num2 && num1 >= num3) {
				max = num1;
			}else if (num2 > num3) {
				max = num2;
			}else {
				max = num3;			
			}
			
			System.out.println("Max :" + max);
			scan.close();
	}		
		
}
	
			
			
			
			
			
			
			
			
			

