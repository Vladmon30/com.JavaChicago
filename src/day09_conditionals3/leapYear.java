package day09_conditionals3;

import java.util.Scanner;

public class leapYear {
public static void main(String[] args) {
	
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a year: ");
        int year = scan.nextInt();
        
        
        if((year%4==0 && year%100!=0) || year%400 == 0) {
             System.out.println(year + " is a Leap Year.");
            
        }else {
            System.out.println(year +" is not a Leap Year.");
        }
        
        }
}
