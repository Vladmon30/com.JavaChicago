package ReplIt_Homework;

import java.util.Arrays;

public class Has_55 {
public static void main(String[] args) {
	//Scanner input = new Scanner(System.in);
	//    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	int[] nums = {1, 4, 5,5, 1, 1};
	    //TODO Type your code below:	
	boolean bol = false;
		for(int i = 0; i < nums.length-1;i++) {
			if(nums[i]==5 && nums[i+1] == 5) {
	 bol= true;
		}
	}
		
	System.out.println(bol);

}

}