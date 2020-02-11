package day29_assignments;

import java.util.Arrays;

public class WormUpTask {
	public static void main(String[] args) {

/* replace with 10 if nmber is not divisible by10.
 * if divisible by 10 then skip and change the value of replacement numbers to this value
 * ex: { 4 ,6,10, 3,20,14,15}
 * 	   {10,10,10,10,20,20,20}
 * 
 */
		int[] nums = { 12,23,34,10,3,50,3,45};
		int replacement = 10;
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 != 0) {
				nums[i] = replacement;
			} else {
				replacement = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));

	}
}
