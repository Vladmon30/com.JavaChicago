package day31_NewArrays;

import java.util.Arrays;

public class GroceryList {
	public static void main(String[] args) {

		/*
		 * Create an array named groceryList 
		 * Grocery list should be: apple,carrot,orange,cherry,strawberry 
		 * Sort it and print out the index of
		 * apple and orange. 
		 * Output: 
		 * Index number of apple is : 0 
		 * Index number of orange is: 3
		 * 
		 */

		String[] groceryList = { "apple", "carrot", "orange", "cherry", "strawberry" };
		
		Arrays.sort(groceryList);
		
		System.out.println("Index number of apple is: " + Arrays.binarySearch(groceryList, "apple"));
		System.out.println("Index number of orange is: " + Arrays.binarySearch(groceryList, "orange"));
	}
}
