package intervewQuestion;

public class FindSmallestInArray {
public static void main(String[] args) {
	
	int nums[] = {10,3,2,4,5,9}; 
	int smallest = nums[0];
	
	for(int num : nums) {
		if( num < smallest) {
			smallest = num;
		}
	}
	
	System.out.println(smallest);
	}
}


