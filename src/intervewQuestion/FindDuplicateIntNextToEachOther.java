package intervewQuestion;

public class FindDuplicateIntNextToEachOther {
	public static void main(String[] args) {

		int[] nums = { 7, 2, 3, 3, 4, 5, 6 };

		for (int i = 0; i < nums.length - 1; i++) {
			int n1 = nums[i];
			int n2 = nums[i + 1];
			if (n1 == n2) {
				System.out.println(n1 + " " + n2);
			}
		}
	}
}