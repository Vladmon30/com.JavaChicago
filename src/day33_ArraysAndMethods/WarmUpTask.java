package day33_ArraysAndMethods;

import java.util.Arrays;

public class WarmUpTask {
	public static void main(String[] args) {
																	/*
																	 * ARRAYS AND METHODS 1.Create method that accepts integer array and
																	 * integer(target value) and returns integer array. Logic: Method should
																	 * initialize all the elements with given target integer value.
																	 * Input:
																	 * [1,4,23,4,0], 10 
																	 * Output: 
																	 * [10,10,10,10,10]
																	 */
		int[] arr = { 23, 2, 3, 5}; //its array int[] nums
		int nums = 10;		//target is  10
		int [] result = initialize(arr, 10);

}		
										
																	//Task:
																	// inputs --> int array-->int[], int
																	// output --> int[]
																	//public static int[] initialize (int[] nums, int target)
																	//
	public static int[] initialize(int[] nums, int target){
		for (int i = 0; i < nums.length; i++) {
			nums[i] =target;  									// we want that all nums(10) will be the target same 10
			System.out.println(nums[i]);
		}
			System.out.println("After the loop:"+ Arrays.toString(nums));
			return nums;
		}
	}

