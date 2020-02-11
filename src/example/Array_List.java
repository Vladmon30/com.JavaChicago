package example;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
public static void main(String[] args) {
	List<String> names = new ArrayList<>(); 
	System.out.println("Size before adding names: " + names.size());
	
	names.add("James");
	names.add("John");
	names.add("Trump");
	System.out.println("Sizeafter adding names: " + names.size());
	System.out.println(names.toString());
}
}
