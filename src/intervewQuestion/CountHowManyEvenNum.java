
package intervewQuestion;

public class CountHowManyEvenNum {
	public static void main(String[] args) {
// Count even numbers in the array		
int[] nums = { 1, 2, 2, 3, 4 };
		int count = 0;
		for (int n : nums) {
			if (n % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
