package ReplIt_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Array_reverse_array {
	public static void main(String[] args) {
		
		/*
		 * Given an array nums with 7 integers already assigned, write code to reverse
		 * it. Do not use any additional arrays or Strings.
		 * 
		 * Example:
		 * nums -> [4, 3, 2, 44, 1, 100, 55] change it to: nums -> [55, 100, 1, 44, 2,
		 * 3, 4]
		 * 
		 * PseudoCode:
		 * 1. Take values at index 0 and last index and swap them 2. Take values at
		 * index 0+1 and last index-1 and swap them 3. Keep repeating step 1 and 2 using
		 * a loop until you reach the middle of the array (nums.length /2)
		 * 
		 * How to swap values: Example:
		 * int temp = nums[0]; nums[0] = nums[4]; nums[4] = temp;
		 */
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    
	    int middle = nums.length / 2;
	    
	    int i = 0, j = nums.length - 1;
	   
	    int temp = 0;
	   

	    for(; i < middle; i++,j--) {
	      
	      temp = nums[i];

	      nums[i] = nums[j];

	     nums[j] = temp;

	    }
	    
	    
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));
	    
		
	}
}
