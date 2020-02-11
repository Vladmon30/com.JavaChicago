package ReplIt_Homework;

import java.util.Scanner;

public class PrintFirstLastChar_Two {
	public static void main(String[] args) {

		/*
		 * Given a String array words, iterate through each word and print first and
		 * last letter of each element in the format below. 
		 * Example: words → ["hello",
		 * "why", "by", "apple" , "apple"] print → [ho, wy, by, ae, ne]
		 */

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		// TODO: Write your code below

//		int index = 0;
//		while (index < words.length) {
//
//			System.out.print(words[index].charAt(0) + "" + words[index].charAt(words[index].length() - 1) + ", ");
//			index++;
//			if (index == words.length - 1) {
//				System.out.print(words[index].charAt(0) + "" + words[index].charAt(words[index].length() - 1));
//				break;
		
		for (String str:words){
			System.out.println(str);
			
			

			String strArray[] = str.split(" ");
			
			System.out.println("String converted to String array");
			
			//print elements of String array
			for(int i=0; i < strArray.length; i++){
				System.out.println(strArray[i]);
			}
			
			
		}
	}
}
