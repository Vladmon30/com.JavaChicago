package day21_loops4;

import day14_classworks.SubStringExamples;

public class WormUpTask3 {
	public static void main(String[] args) {
		/*
		 * 3. Accept a String and print only unique characters in the String: Enter
		 * word: 
		 * java 
		 * jav 
		 * aabcddee 
		 * abcde
		 * speedlimit
		 *spedlimt
		 *aaahhhrrriiieee
		 *ahrie
		 *
		 *
		 */
		String word = "AABCCDD";
		String unique = "";
		
//		int i = word.length();
//		System.out.println(word.substring(i, i1));
		
		for(int i = 0; i < word.length();i++) {
			//word.substring(i, i+1);
			//System.out.println(word.substring(i, i+1));
			
			String letter = word.substring(i, i+1);
			
			if(!unique.contains(letter)) {
				unique = unique + letter;
			}
		}
		System.out.println(unique);
	}
}
