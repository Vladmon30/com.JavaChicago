package trainingVlad;

import java.sql.Array;
import java.util.Arrays;

import example.arrayToString;

public class Training1 {
	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(Arrays.toString(getWithE(numbers)));
	}

	/*
	 * Given a String array arr with the following elements ["zero", "one",
	 * "two","three","four"]
	 * Create another array fewValues and copy words that have letter "e" in them
	 * You need to know how many element contain "e" and create array accordingly
	 * Values in fewValues array need to be["zero", "one","three"]
	 * Examples: arr -> ["aa", "be", "lol", "lel", "oreo"] fewValues -> ["be",
	 * "lel", "oreo"]
	 */
	public static String[] getWithE(String[] arr) {   
    //TODO : YOUR CODE GOES HERE ----------------------
		int count=0;
		for(String newArr:arr) {
			if(newArr.contains("o")) {
				count++;
			}
		}
		int c=0;
		String[] fewValues=new String[count];
		for(String each:arr) {
			if(each.contains("o")){
				fewValues[c]=each;
					c++;
		}
		}
		for(String values:fewValues) {
			System.out.println(values);
		}

	//YOUR CODE ENDS HERE -----------------------
		    
		    return fewValues;
		  }

		}
