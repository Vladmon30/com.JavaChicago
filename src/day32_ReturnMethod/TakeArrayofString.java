package day32_ReturnMethod;

import java.util.Arrays;

public class TakeArrayofString {
	/*
	 * 2. Create a method that takes array of String —> Students list And returns
	 * array of String —> Students that has last names Input: [“James”, “john”,
	 * “John Wick”, “Elize”] Output: [“John Wick”]
	 * 
	 */
	
	//Flow:
	//1. count the element that has two or more words
	//2. create array of string with the 'count' size.
	//3. iterate through each element again and set elements with two or more words to newly created arrray
	public static void main(String[] args) {
		
		String[] names = {"James Bond", "Donald Trump Junior", "Adam", "John Wick" };
		String[] newarr = getNamesWithLastNames(names);
		System.out.println(Arrays.toString(newarr));
		
	// Pseudo code:
	//Create a method that takes/accept String array
		//and Return String Array
		//Logic: method shold find an element that consist of two or more words and retrn that
		// Input: ["James Bond", "Donald Trump Junior", "Adam", "John Wick"]
		//Outpt: ["James Bond", "Adam", "John Wick"]
	}

	public static String[] getNamesWithLastNames(String[] names) {
		
		int count = 0;
		for (String name : names) {
			System.out.println(name);
			name = name.trim();
			int numsOfWords = name.split(" ").length;
			if(numsOfWords > 1) {
				count++;
			}
		}
		String[] result = new String[count];
		int index = 0;
		for (String name : names) {
			name = name.trim();
			int numOfWords = name.split(" ").length;
			if (numOfWords > 1) {
				index++;
			}
		}
		return result;
		
	}
	
}
