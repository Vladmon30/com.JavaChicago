package day28_EssenClass;


import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	String[] students = {"James", "John","Obama", "Donald", "Clark"};
	System.out.println(students);
	System.out.println(Arrays.toString(students));
	//binarySearch method aquared to array to be sorted
	
	Arrays.sort(students);
	System.out.println(Arrays.toString(students)); //[James, John, Obama, Donald, Clark]
	int i = Arrays.binarySearch(students,"John"); // [Clark, Donald, James, John, Obama]
	System.out.println(i);
	int[]nums = {1,3,5,7,8};
	System.out.println(Arrays.binarySearch(nums, 4));
	
	
	
	
}
}
