package day33_ArraysAndMethods;

import java.util.Arrays;

public class MethodCreation {
public static void main(String[] args) {
	 //String name = "James";
	 method("Vladik");
}
	/*
	 * 2.Create method that accepts String and returns character array.
	 * Input: “James”
	 * Output: [j, a, m, e, s]
	 */

public static char [] method(String givenName) {
	char array[] = new char[givenName.length()];
	
	for(int i = 0; i < givenName.length(); i++) {
		array[i] = givenName.charAt(i);
		
	}
	System.out.println(Arrays.toString(array));
	return array;
}

}
