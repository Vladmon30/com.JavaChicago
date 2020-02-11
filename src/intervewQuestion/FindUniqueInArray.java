package intervewQuestion;

public class FindUniqueInArray {
public static void main(String[] args) {
		
	int[] nums = new int[]{1, 2, 1, 4};
	
		for(int i = 0; i < nums.length; i++) { 
			int currentNum = nums[i]; 
			boolean unique = true;
			
		for(int j = 0; j < nums.length; j++) { 
			if(nums[j] == currentNum && i != j) { 
				unique = false;
				break;
		}
     }	
			if(unique) {
				System.out.print(currentNum + " ");
   }
  }
 }
}
