package day26_array;

public class IncrementArrayValues {
	public static void main(String[] args) {

		/*
		 * 1) Write a program called IncrementArrayValues: 1. Declare array nums and
		 * assign {1,2,3,4,5,6,7,8,9} 2. Print out all values in single line separated
		 * by space: 1 2 3 4 5 6 7 8 9 3. Using a Loop write some code to do the
		 * following: if the value is even - double it and assign back. If the value is
		 * odd - triple it and assign back. 4. Print out all values in single line
		 * separated by space: 3 4 9 8 15 12 21 16 27
		 *
		 */

		// 1. Declare array nums and assign {1,2,3,4,5,6,7,8,9}
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 2. Print out all values in single line separated by space: 1 2 3 4 5 6 7 8 9
		for (int n : nums) {
			System.out.print(n + " ");
		}
			System.out.println();

			/*
			 * 3. Using a Loop write some code to do the following: 
			 * if the value is even -double it and assign back.
			 * If the value is odd - triple it and assign back.
			 */

			for (int i = 0; i < nums.length; i++) {
				if (nums[i] % 2 == 0) {
					nums[i] = nums[i] * 2;
				} else {
					nums[i] = nums[i] * 3;
					
		//  another example:	
		//  nums[i] = (nums[i] % 2 == 0) ? nums[i] * 2 : nums[i] * 3;
					
		}
	}
			for( int n:nums) {
			System.out.print(n + " ");
				
		}
	        
			// 4. Print out all values in single line
			// separated by space: 3 4 9 8 15 12 21 16 27

			nums[0] = 3;
			nums[1] = 4;
			nums[2] = 9;
			nums[3] = 8;
			nums[4] = 15;
			nums[5] = 12;
			nums[6] = 21;
			nums[7] = 16;
			nums[8] = 27;
			for (int i : nums) {
			System.out.println(i + " ");
			
		}
	}
}
