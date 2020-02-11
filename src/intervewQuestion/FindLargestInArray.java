package intervewQuestion;

import java.util.Scanner;

public class FindLargestInArray {
	
public static void main(String[] args) {
	int [] nums = {24, 43, 2, 5};		
	int largest = nums[0];
	
		for (int num : nums) {
			if(num > largest) {
				largest = num;
			}
		}
		
		System.out.println(largest);
		
	}
}