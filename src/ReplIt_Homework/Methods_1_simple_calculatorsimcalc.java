package ReplIt_Homework;

import java.util.Scanner;

public class Methods_1_simple_calculatorsimcalc {
	public static void main(String[] args) {
	      
	      plus();
	  }
	  
	  public static void plus(){
	     
	    //your code here
		  int result;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter first number: ");
	    int num1 = scan.nextInt();
	    System.out.println("enter second number: ");
	    int num2 = scan.nextInt();
	    
	    result = num1+num2;
	    System.out.println("result: " + result);
	    
	  }
	
	}

