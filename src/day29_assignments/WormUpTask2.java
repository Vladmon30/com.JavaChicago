package day29_assignments;

import java.util.Arrays;
import java.util.Random;

public class WormUpTask2 {
	public static void main(String[] args) {

		/*
		 * 1.Create two demension array of number with size of folowing and assign the
		 * random vales to each index.
		 * ---------------
		 * in picture int[][] numbers = new int [4];
		 * ---------------
		 * 2. asigning a values to an arrays --> assign random
		 * 
		 */

		Random random = new Random();
		System.out.println(random.nextInt(100));

		int[][] numbers = new int[4][];
		numbers[0] = new int[5];
		numbers[1] = new int[3];
		numbers[2] = new int[7];
		numbers[3] = new int[7];

		for (int i = 0; i < numbers.length; i++) {
			// System.out.println("i:" + i);
			// System.out.println("\tsize of inner array: " + numbers[i].length);

			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println("i: " + i + "\tj:" + j);
				numbers[i][j] = random.nextInt(100);
			}
		}
// [ele1,ele2,ele3...]
// [ele1,ele2,ele3...]
// [ele1,ele2,ele3...]
// Arrays.toString()
//assign a value to an arrays--> assign random integers

		for (int[] inner : numbers)
			System.out.println(Arrays.toString(inner));

		System.out.println("----Another exemple with for loop----");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Array" + (i+1) +": "  + Arrays.toString(numbers[i]));
		}
	}
}
