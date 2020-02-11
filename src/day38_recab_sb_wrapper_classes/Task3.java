package day38_recab_sb_wrapper_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
//		System.out.println(removeCon("consequences"));
//		System.out.println(removeCon("constant value"));
//		System.out.println(removeCon(" continue"));
//		System.out.println(removeCon("concon"));
//		System.out.println(removeCon("co"));
		System.out.println(removeCon("Pineapple", "Apple"));
		System.out.println(removeCon("Hello word", "word"));
		System.out.println(removeCon("consequences ", "que"));
		
		
		System.out.println("---- TASK 3 -----\n");
		System.out.println(getRandomNumList(7, 50));
		System.out.println(getRandomNumList(5, 20));
		System.out.println(getRandomNumList(3, 30));
	}
	//1Task.
	public static String removeCon(String word) {
		word = word.toLowerCase().trim();
		if (word.contains(" ")) {
			System.out.println("Invalid data");
			return "";
		}
		else if (word.length() < 3) {
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
	//2Task.
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

	/*
	 * 3. Create a method that takes integer(size), integer(bound) and returns List
	 * of Integers. Method idea: method should create list of integers and assign
	 * random numbers between zero to given bound. Size of list should be given
	 * size.
	 * 
	 */
//3Task
	public static List<Integer> getRandomNumList(int size, int bound) {
		
		Random random = new Random();
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			nums.add(random.nextInt(bound));
		}
		return nums;
	}

}
