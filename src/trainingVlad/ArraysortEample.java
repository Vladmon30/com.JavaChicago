package trainingVlad;

import java.util.Arrays;

public class ArraysortEample {
public static void main(String[] args) {
	String[] names = {"John","Adam", "Don"};
	// Syntax for sorting Array elements
	
	Arrays.sort(names);    // {"Adam", "Don", "John"}
	for (String item:names) {
		System.out.println("names: " + item);
}
}
}
