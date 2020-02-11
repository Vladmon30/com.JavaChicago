package day36_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CustomMethod {
public static void main(String[] args) {
	/*
	 * add (list, "james", "john", "obama"...)
	 * create a custom method that accepts List of String, and accepts
	 * String varags and add all the given strings to the list and return the list
	 * 
	 */
	String s ="James";
	s.substring(1, 3);
			System.out.println(s);
	List<String> names= new ArrayList<>();
	 names.add("James");
	 names.add("John");
	 System.out.println(names);
	 add(names, "Trump", "Elize", "Esen", "Obama");
	 System.out.println(names);
}

private static void add(List<String> names, String string, String string2, String string3, String string4) {
	// TODO Auto-generated method stub
	
}

public static List<String> addElements( List<String> list, String ... elements){
	for(String str:elements) {   // getting every single element what we pass 
		list.add(str);           // adding more element in a String str
		
	}
	return list;
	
	
	
	
}
}
