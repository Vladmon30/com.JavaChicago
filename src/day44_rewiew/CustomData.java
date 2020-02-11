package day44_rewiew;

import java.util.Random;

public class CustomData{
	public static void main(String[] args) {
		/*
		 * Warm up:1.Create class CustomDataCreate static method generateUsername. 
		 * This method should accept string and return String. 
		 * Logic: check if given string is one word or more. 
		 * If more, then concatenate all together and add random number between 0 - 100. 
		 * Return only lower case string. 
		 * Input: James Bond
		 * Output: jamesbond74 
		 * Input: John 
		 * Output: john23
		 * 
		 */
	String s =generateUserName("James Bond");
		System.out.println(s);
	String s2 = generatePassword("Adam Smith");
		System.out.println(s2);
	}

	public static String generateUserName(String word) {
		
//	  another method:
//	  String [] words =word.split(" ");
//	  String result="";
//    if(words.length>1){
//    for(String s:words){
//	  result +=s;
	   
		
		
		word = word.replace(" ", "");
		Random r = new Random();
		word = word + r.nextInt(100);
		return word.toLowerCase();
	}
		/*
		 * Create static method generate password. This method should accept string and
		 * return string. Logic: check if given string is one word or more. If more,
		 * then concatenate all together. Reverse the string and add random number in
		 * the end between 0 - 500. And return the string. Return only lower case
		 * string.
		 * Input: James
		 * Output: semaj245
		 */
		public static String generatePassword(String word) {
			word = word.replace(" ", "");
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			Random r = new Random();
			sb.append(r.nextInt(500));
			return sb.toString().toLowerCase();
		}
	}

