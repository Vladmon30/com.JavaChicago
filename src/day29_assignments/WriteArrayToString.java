package day29_assignments;

public class WriteArrayToString {
	public static void main(String[] args) {
	
		int[] nums = {23,23,5,34,546,34,2};
		myToString(nums);
	}
	//write Arrays.toString() method and implement it.

	public static void myToString(int[] nums) {
		String result = "[";
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 1) {
				result += nums[i] + "]";
			} else {
				result += nums[i] + ",";
			}
			
		}
		System.out.println(result);
	}
}
