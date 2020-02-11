package mentoringSession1;

public class FindA2HighestNumber {
	public static void main(String[] args) {

		// Task: find a second highest number from the array
		// Not finished
		
		int[] array = { 2, 4, 34, 5, 3 };
        
		System.out.println("the max value is: " +Integer.MAX_VALUE);
		System.out.println("The second highest number is: " + findSecondValue(array));
	}

	public static int findSecondValue(int[] array) {
		if (array.length < 3) {

			System.out.println("Please enter longer array!");

		}
		return 0;

	}

}
