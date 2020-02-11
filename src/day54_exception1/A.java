package day54_exception1;

import java.util.List;

public class A {

	static List<String> names;

	public static void main(String[] args) {
			
	//	names.get(0); //will throw NullPointerExeption

		try {
			System.out.println(names.get(0));
		}

		catch (NullPointerException e) {
			System.out.println("names is not instatiation");
		}
	}
}