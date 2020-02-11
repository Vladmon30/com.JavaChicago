package day36_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		/*
		 * 
		 * 4. Create a method that accepts List of String and integer(size). This method
		 * should remove all the elements with given size. And returns new List of
		 * String which doesn’t include elements with given size.Input: [James, Adam,
		 * John, Elize], 4Output: returns list [James, Elize]
		 * 
		 */
		List<String> names = new ArrayList<>();
		names.add("James");
		names.add("Adam");
		names.add("obam");
		names.add("Jamie");
		removeElements(names, 4);
	}
	
	public static void removeElements(List<String> list, int size) {
//		System.out.println(list);
		List<String> newList = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).length() != size) {
				newList.add(list.get(i));
			}
		}
		System.out.println(newList);
	}

}