package ReplIt_Homework;

public class Find_Non_Duplicate {
	public static void main(String[] args) {
	
		int[] nums= {1, 1, 2, 3, 4, 3, 4};
		

		int unique = 0;
		for(int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == nums[i]) {
					unique++;
				}
				
			}if(unique==1) {
			System.out.println(nums[i]);
			}
		}
	}
}
