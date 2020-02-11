package ReplIt_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxLenInStr {
	public static void main(String[] args) {

		/*
		 * Given the array words, it will print the word with the largest length. Assume
		 * that there are no 2 words with longest length Example: words -> ["aaa",
		 * "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"] prints
		 * jaaaaavvaaaaaaaaaa
		 * 
		 */
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();  
		}  //write your code below
		
		for(String str : words) {
			
		}
		String largest = words[0];
		
		for(String str1:words) {
			if(str1.length() >largest.length()) {
				largest=str1;
			}
		}
		
		System.out.println("Largest value: " + largest);
		
		
		
		}	
	}
	
