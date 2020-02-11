package day21_loops4;

import java.util.Scanner;

 /*
  * 1. Accept a string and if it is palindrome, print "Palindrome", if not print "Not Palindrome"
  *Ex:
  *Enter word:
  *java
  *Not Palindrome
  *civic
  *Palindrome
  *
  *
  *step1 - reverse the string java->avaj;
  *step2 - compare reversed version with original;
  *step3 - 
  */

public class WormUpTask {
public static void main(String[] args) {
	//            "0123"
	String word = "lEVEL";
	String reversed = "";
	
	for (int idx = word.length()-1; idx >=0; idx--) {
		//System.out.print(word.charAt(idx));
		reversed += word.charAt(idx)+"";
	}
	System.out.println(reversed);
	System.out.println(word);
	if(word.equalsIgnoreCase(reversed)) {
		System.out.println("Palindrom");
	}else {
		System.out.println("Not Palindrom");
	}
	
	
	//Scanner input = new Scanner(System.in);
	//System.out.println("Enter Word:");
	
	//String reversed = "";
	//String word = input.nextLine();

	//int length = word.length();
	
	//for(int i = length -1; i>=0; i--)
	//	reversed = reversed + word.charAt(i);
	
	//if (word.equals(reversed)) {
	//	System.out.println("Palindrom");
	//	}
	//else {
	//	System.out.println("Not Palindrom");
 }
}


