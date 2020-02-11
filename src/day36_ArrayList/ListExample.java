package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {
public static void main(String[] args) {
	
	String[]oldNames = {"Trump", "Obama"}; 									// convert array to the arraylist
	List <String> newNames = Arrays.asList(oldNames);  						// list of strings convert old name in arraylist
	System.out.println(newNames);
																			//convert Array to ArrayList
			List<String> names = new ArrayList<>();
			names.add("James");
			names.add("Adam");
			names.addAll(newNames);
			System.out.println(names);
			Collections.sort(names);
			System.out.println(names);
}
}
