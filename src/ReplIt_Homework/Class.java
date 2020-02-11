package ReplIt_Homework;

import java.util.Arrays;

public class Class {
		
		public static void main(String[] args) {
		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  	  
		  public static String[] getWithE(String[] arr) {
		    
		    //TODO : YOUR CODE GOES HERE ----------------------
		  
		    String[] fewValues = {""};
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].contains("e")) {
						fewValues.equals(arr[i]);
						System.out.println(arr[i]);
					
		    //YOUR CODE ENDS HERE -----------------------
					}
				}
		    return fewValues;
		  }
		  
				}
		
		
//		// TODO Auto-generated method stub
//		String[] word = { "one", "two", "three", "hello", "print" };
//		String[] newword = { "" };
//		for (int i = 0; i < word.length; i++) {
//			if (word[i].contains("e")) {
//				newword.equals(word);
//				System.out.print(word[i] + " ");
//			}
//		}
//	}
//
//}
