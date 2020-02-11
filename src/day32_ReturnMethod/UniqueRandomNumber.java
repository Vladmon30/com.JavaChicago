package day32_ReturnMethod;

import java.util.Arrays;
import java.util.Random;

public class UniqueRandomNumber {
	public static void main(String[] args) {
		/*
		 * 1.Create method that generates unique random numbers and returns in integer
		 * array Input: 2 parameters -> 1- integer for size, 2- integer for bound
		 * Output: integer array
		 * 
		 */
		int[] arr = getUniqueRandoms(4, 15); // create random unique number from 4 to 15
		System.out.println(Arrays.toString(arr));
	   }

	public static int[] getUniqueRandoms(int size, int bound) {

		int []result = new int[size];
		Random random = new Random();
		boolean check = true;
		int index =0;
		 while(check) {
			 int ranNum = random.nextInt(bound);
				if(!checkNumberInArray(result, ranNum)) {
				result[index] = ranNum;	
				index++;
				
		}
				if(index==size -1) {
					check=false;
				}
	}
		     	return result;
}

	public static boolean checkNumberInArray(int[] arr, int target) {
		for (int i : arr) {
			if (i == target) {
				return true;
		}
	 }
		return false;
   }
}
