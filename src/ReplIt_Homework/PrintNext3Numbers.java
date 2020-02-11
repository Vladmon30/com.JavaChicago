package ReplIt_Homework;

import java.util.Scanner;

public class PrintNext3Numbers {
	public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     next3(num);
	  
	}
	 public static void next3(int n){
		 
		    int num1 = n+1;
		    int num2 = n+2;
		    int num3 = n+3;
		    
		    System.out.println(num1 + " " + num2 + " "+ num3);
 
	}
}
