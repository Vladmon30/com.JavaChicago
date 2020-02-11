package ReplIt_Homework;

import java.util.Scanner;

public class CountEvens {
	public static void main(String[] args) {

		/*
		 * Given an array nums, calculate count of even numbers in nums and print out to
		 * console.
		 * nums → [2, 1, 2, 3, 4]) → 3 
		 * nums → [2, 2, 0, 3, 5]) → 3 
		 * nums → [1, 3, 5, 7, 9]) → 0
		 * 

		 */

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
	//	int[] nums = {2, 1, 2, 3, 4};
		
		//int index=0;
		int count=0;
		
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]%2==0) {
			//	System.out.println(nums[i]);
				//length[index]=nums[i];
				count++;
			}
			
		}
		System.out.println(count);
	}
}