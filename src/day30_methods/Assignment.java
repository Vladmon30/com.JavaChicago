package day30_methods;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment {

	/*
	 * 1.Create array of String with the size of users choice. This
	 * array(collection) represents one group. Ask user to enter each member name
	 * and store that input to each index of created array. Then in the end print
	 * out the members in the format of [ ele1, ele2, ele3, ...] Program:Please
	 * enter size of group: input —> 3Please enter member 1:input —> JamesPlease
	 * enter member 2:input —> John Please enter member 3:input —> AdamGroup
	 * members:[James, John, Adam] 2. Create method that prints out the student name
	 * that starts with ‘a’ or ‘A’.3. Create method that takes char and prints out
	 * student name that starts with given char.4. Steps: 1.Copy test.txt file and
	 * paste to your project 2. Create class and paste following code. public static
	 * void main(String[] args) throws FileNotFoundException {File file = new
	 * File("test.txt");Scanner sc=new Scanner(file); while(sc.hasNextLine()) {
	 * String name = sc.nextLine().trim(); // variable name gives each name from the
	 * test.txt file }}Task 1: Store all the names into an arrayNotice: file has
	 * empty linesTask 2: create method that takes string array and integer(group
	 * size) and generates random group.
	 * 
	 */
//_____________________________________________________________________________________________________________
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("test.txt");
		Scanner sc = new Scanner(file);
																			// Pseudo code:
																			// 1. Find a size of an actual element from the file
																			// 2. Create a new String array with that size
																			// 3. Iterate through each element again and assign actual element to the newly
																			// created array
		int count = 0;

		while (sc.hasNextLine()) {
			String name = sc.nextLine().trim();
			System.out.println(name);
			if (name.isEmpty()) {
				continue;
			}
			count++;
																			// variable name gives each name from the test.txt file }}
		}
		System.out.println("Count: " + count);
		String[] students = new String[count];
																			// go through each element and assigne it in each position
																			// creating scanner for file again to iterate throgh one more time
		Scanner scan = new Scanner(file);
		int index = 0;
																			// iterating through lines and assign values to newly created array
		while (scan.hasNextLine()) {
			String name2 = scan.nextLine().trim();
			if (name2.isEmpty()) {
				continue;
			}
			students[index] = name2;
			index++;
		}
		System.out.println(Arrays.toString(students));
		System.out.println("--------------------------\n");
		generateNewGroup(students, 5);
	}
																			// ccontinue;-->skips the current iteration
																		
																			// pseudocode:
																			// 0. Create new string array with the given size of group
																			// 1. Generate unique number for index to pick randomly one name
																			// 2. Store value to the newly created array.
		//__________________________________________________________________________________________________
	
		public static void generateNewGroup(String[] students, int groupSize) {
		
		String [] newGroup = new String[groupSize];
		int[] indexes = getUniqueRandoms(groupSize,students.length);
		System.out.println(Arrays.toString(indexes));
							
					for(int i = 0; i< indexes.length; i++) {
						System.out.println(indexes[i]);
						int tempIndex = indexes[i];
						newGroup[i]= students[tempIndex];
						
					}
					System.out.println(Arrays.toString(newGroup));
			}
	//	int[] i = getUniqueRandoms(5,50);									// get 5 unique random number between 5, 50	
		
	//	System.out.println(Arrays.toString(getUniqueRandoms(5,50)));
	//	System.out.println(Arrays.toString(getUniqueRandoms(3,10)));
	//	System.out.println(Arrays.toString(getUniqueRandoms(4,20)));
	//	System.out.println(Arrays.toString(getUniqueRandoms(10,40)));
	//	System.out.println(Arrays.toString(getUniqueRandoms(2,10)));
		
//_______________________________________________________________________________________________________
	
		public static int[] getUniqueRandoms(int size, int bound) {

		int[] result = new int[size];
		Random random = new Random();
		boolean check = true;
		int index = 0;
		while (check) {
			int ranNum = random.nextInt(bound);
			if (!checkNumberInArray(result, ranNum)) {
				result[index] = ranNum;
				index++;
		}
			if (index == size - 1) {
				check = false;
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