package trainingVlad;

public class FindMaxMinArray {
public static void main(String[] args) {
	
	
	int[] nums = {2,4,7,1,3,5,6};
	
	int maxVal=nums[0];
	int minVal=nums[0
	                ];
	
		for(int i=0; i<nums.length; i++) {
			if(maxVal<nums[i]) {
				maxVal=nums[i];
			}
			if(minVal>nums[i]) {
				minVal=nums[i];
			}
		}
		System.out.println("max val: " + maxVal);
		System.out.println("min val: " + minVal);
}
}
