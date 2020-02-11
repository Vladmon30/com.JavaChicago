package ReplIt_Homework;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {

		/*
		 * Given a String variable sentence, write code to type each word in separate
		 * lines in a reverse order. 
		 * Example: sentence -> "Java is fun" Print fun is
		 * Java
		 */
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// TODO: Type your code below
		String[] words=sentence.split(" ");
	    for (int i=words.length-1; 0<=i; i--)
	    {
	    	System.out.println(words[i]);
	    }
	}
}	
	