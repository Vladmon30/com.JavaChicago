package trainingVlad;

public class MultiDementionalArrayTrain2 {
public static void main(String[] args) {
	
	int[][] nums = { {1,2,3}, {4,5,6}, {7,8,9} };
	
		for(int cols = 0; cols < nums.length; cols++) {
			for(int row=0; row<nums[cols].length; row++) {
				System.out.print(nums[cols][row] +  "\t");
			}
			System.out.println(" ");
		}
		
}
}
