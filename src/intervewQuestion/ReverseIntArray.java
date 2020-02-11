package intervewQuestion;

public class ReverseIntArray {
	public static void main(String[] args) {

		int[] nums = {10,3,77,23,90,100,43,18,29,17};
		int revNums=0;
			for(int i = nums.length-1; i >= 0; i--) {
			revNums = nums[i];
			System.out.print(revNums + " ");
		}
	}
}
