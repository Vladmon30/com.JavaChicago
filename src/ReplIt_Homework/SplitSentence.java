package ReplIt_Homework;

import java.util.Scanner;

public class SplitSentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

//	    Given a String variable sentence, write code to type each word in separate lines.
//
//	    Example:
//	    sentence -> "Java is fun"
//	    Print
//	    Java
//	    is
//	    fun
//	    
		// type your code below
     String temp1= new String(sentence); // create temp string and put info from input.nextLine();
     
		for(String temp2:temp1.split(" ")) {   //create another temp2 and split it
			System.out.println(temp2);
			
			
		
		}
		
	}
}
