package ReplIt_Homework;

import java.util.Scanner;

public class ReverseSentence2 {
	public static void main(String[] args) {

		/*
		 * Given a String variable sentence, write code to get each word and assign to
		 * String reversed in reverse order.
		 * 
		 * Example: sentence -> "Java is fun" reversed -> "fun is Java"
		 * 
		 */

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here

		String[] words=sentence.split(" ");
	    for (int i=words.length-1; 0<=i; i--) {
	    reversed=reversed+ words[i]+" ";
	    }
		// End your code here. do not modify below statement
		System.out.println(reversed);
	    
	}
}