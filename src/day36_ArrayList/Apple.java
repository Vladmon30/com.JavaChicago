package day36_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Apple {
public static void main(String[] args) {
	
	List<String> names = new ArrayList<>(); 
	System.out.println("Size before adding names: " + names.size());
	
	names.add("James");
	names.add("John");
	names.add("Trump"); 		//  James, John, Trump
	names.add(0, "Obama"); 		// присваеваем новое значение в позицию 0   Obama, James, John, Trump
	System.out.println("Size after adding names: " + names.size());
	System.out.println(names);
	
	//names.sort(Collections);								//	  0,     1,     2,    3		
															//  Obama, James, John, Trump
	String myName= names.get(2);      // выдает второй елемент в array с 0,1,2 -- John
	
	System.out.println(names.indexOf("John"));
	
	System.out.println(myName);
	System.out.println(names.toString());
}
}
