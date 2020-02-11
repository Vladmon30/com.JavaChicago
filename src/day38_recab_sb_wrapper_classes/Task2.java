package day38_recab_sb_wrapper_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
	public static void main(String[] args) {

//	System.out.println(removeCon("consequences"));
//	System.out.println(removeCon("constant value"));
//	System.out.println(removeCon(" continue"));
//	System.out.println(removeCon("concon"));
//	System.out.println(removeCon("co"));
		System.out.println(removeCon("Pineapple", "Apple"));
		System.out.println(removeCon("Hello word", "word"));
		System.out.println(removeCon("consequences ", "que"));
	}
	public static String removeCon(String word) {
		word = word.toLowerCase().trim();
		if (word.contains(" ")) {
			System.out.println("Invalid data");
			return "";
		} else if (word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		} else if (word.contains("con")) {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(word.indexOf("con"), word.indexOf("con") + 3);
			return sb.toString();
		} else {
			return word;
		}
	}
	// ________________________________________________________________________
	/*
	 * 2. Create overloaded method for the first task that accepts 2 Strings
	 * parameters. First String - word, second String - target word to remove.
	 * Method should do same function. If first given word contains target word then
	 * remove target word from first String. Note: When removing word use
	 * StringBuilder’s delete method. 
	 */
	public static String removeCon(String word, String target) {
		word = word.trim().toLowerCase();
		target = target.trim().toLowerCase();
		if (word.contains(" ")) {
			System.out.println("Invalid data");
			return "";
		} else if (word.length() < target.length()) {
			System.out.println("Invalid data");
			return "";
		} else if (word.contains(target)) {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(word.indexOf(target), word.indexOf(target) + target.length());
			return sb.toString();
		} else {
			return word;
		}
	}
}