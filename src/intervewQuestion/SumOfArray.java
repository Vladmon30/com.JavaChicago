package intervewQuestion;

public class SumOfArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,5,6};  //17
			int sum = 0;	
		for(int n : nums) {
			sum = sum+ n;
	}
		System.out.println(sum);
	}
}

