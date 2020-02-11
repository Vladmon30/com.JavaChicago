package day35;

import java.util.Arrays;

import day28_EssenClass.ArraysSort;

public class IsAnagram {
	public static void main(String[] args) {

		/*
		 * Method name: isAnagram Return type:boolean Accepts two string as parameter
		 * Returns value: true or false Output: true or false Ex: march->charm
		 */

		String firstWord = "march";
		String secondWord = "charm";

		System.out.println(isAnagram(firstWord, secondWord));
	}

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			;
		return false;
	}
	
	char[] char1 = str1.toCharArray(); // ["m", "a", "r", "c", "h"]
	char[] char2 = str2.toCharArray(); // ["c","h", "a", "r",  "m"]
	
	Arrays.sort(char1);
	Arrays.sort(char2);
	
	for(int i=0; i<str1.length(); i++) {
		if(char1[i]!= char2[i]) {
			return false;
		}
	}
	return true;
	}
}
