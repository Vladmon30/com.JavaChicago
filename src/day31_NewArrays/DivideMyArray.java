package day31_NewArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DivideMyArray {
public static void main(String[] args) {
	
	/*
	 * Create a program 
	 * Accepted criteria:
	 * User should be able to enter the size of the array
	 * User should be able to enter the element of array
	 * Program output should be:
	 * Arrays.copyOfRange(originalArray,from,to);
	 * 
	 */
	Scanner scan = new Scanner(System.in);  // cntrl + shift + o
	System.out.println("Welcome to Divide Array");
	
	System.out.println("enter the size of the array:");
	int size = scan.nextInt();
	
	int[] numbers = new int [size];
	System.out.println("enter the elements of the array:");
		for(int i = 0; i < size; i++) {
	  
		numbers[i] = scan.nextInt();
		}
		System.out.println("The string value of your array:" + Arrays.toString(numbers));
		
		int[] firstHalf = Arrays.copyOfRange(numbers,0,numbers.length/2);
		int[] secondHalf = Arrays.copyOfRange(numbers,numbers.length/2, numbers.length);
		
		System.out.println("The first part of your array:" +  Arrays.toString(firstHalf));
		System.out.println("The second half of your array is:" + Arrays.toString(secondHalf));

	//ARRAYS.COPPYOfRange(originalArray,from,to);
	}
}