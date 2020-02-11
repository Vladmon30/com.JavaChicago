package day25_arrays;

public class FindSmallestInArray {
public static void main(String[] args) {
	
	//create a array that can find smaller one value of item
	
	int[] nums = {10, 2, 3, 6,34, 54};
	
	int smallest = nums[0];
	
	for (int n : nums) {
		if (n < smallest) {
			smallest = n;
		}
	}
			System.out.println("Smalles value: " + smallest);
	}
}
