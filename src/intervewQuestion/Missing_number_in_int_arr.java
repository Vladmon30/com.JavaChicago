package intervewQuestion;

import java.util.Arrays;

public class Missing_number_in_int_arr {
	public static void main(String[] args) {
			
		int [] nums = {2,5,3,1,6,7}; //4
		Arrays.sort(nums);
		
		int sum = 0; //24
		int expSum=0;//28
		int miss=0;
		for(int i=0; i<nums.length; i++) {
			 sum = sum+ nums[i];
			 
		}
		
		for(int i=1;i<=7; i++) {
			expSum=expSum+i;
		}
		
		
		 miss = expSum-sum;
		System.out.println("Missing num is: " + miss);
			
	}
}
