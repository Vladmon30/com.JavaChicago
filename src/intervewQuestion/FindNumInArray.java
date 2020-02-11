package intervewQuestion;

import java.util.Arrays;

public class FindNumInArray {

	public static void main(String[] args) {	
		int[] nums = {123,345,234,55,12344,100,1233,5543};
		Arrays.sort(nums);
		for(int sortNum:nums) {
		System.out.print(sortNum+ " ");
		}
		int lookfor = 100;
	for(int i = 0; i < nums.length; i++) {
			if(nums[i] == lookfor) {
				System.out.println(" ");
				System.out.print("Looking for: " + nums[i]);
				break;
			}		
		}
	}
}
	

