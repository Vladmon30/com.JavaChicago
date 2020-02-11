package day27_stringArrayWithLoops;

public class ArrayTasks {
	public static void main(String[] args) {
		// Task Arrays - printing 01

		/*
		 * Example: 
		 * arr -> ["apple", "banana"] 
		 * prints first 3 letter "app" "ban"
		 */
		String[] arr = new String[] {"apples","banana", "kiwi", "cherry"};
		
		for (String fruit : arr) {
			System.out.println(fruit.substring(0,3) );
		}
		System.out.println("---For Loop--");
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i].substring(0, 3));
		}
		
		
		
	}
}
