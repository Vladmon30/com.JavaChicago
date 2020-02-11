package intervewQuestion;

import java.util.Arrays;

public class ArrayToString {
	public static void main(String[] args) {
		int[] nums = {3,2,1,4};

		System.out.println(  Arrays.toString(nums) );
		
		//sort this array
		Arrays.sort(nums);
		
		//print again
		System.out.println(  Arrays.toString(nums) );

	}
}
