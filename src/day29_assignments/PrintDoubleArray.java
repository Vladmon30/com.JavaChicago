package day29_assignments;

import java.util.Arrays;

public class PrintDoubleArray {
	public static void main(String[] args) {
		
		/*
		 * create a method that prints out the two demensional array values in the
		 * format [ele1,ele2,ele3,ele...] [ele1,ele2,ele3,ele...]
		 * [ele1,ele2,ele3,ele...]
		 */
		
		
		int [][]myNumbers = {{12,23,32,23,45,65},{1,4,6,86,3},{112,3545,564,65,343}};
		printDoubleArray(myNumbers);
	}
	public static void printDoubleArray(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(Arrays.toString(numbers[i]));
		}
	}
}
