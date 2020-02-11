package day26_array;

public class GetUniqueValuesFromArray {
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 1, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4 };

		// take a number from array
		// compare with the rest of numbers in the array. if no matches found
		// it is unique and print it out.

		// take a number from array
		// create a variable counter and assign 0 to it. int counter = 0;
		// compare the number with all other numbers (don't compare the number with
		// itself)
		// if a match found counter ++, if not don't touch counter
		// check if counter is still 0, if yes, print that number because it is unique.

		for (int outer = 0; outer < nums.length; outer++) {//0
			int currentNum = nums[outer]; //1
			boolean duplicate = false;

			for (int inner = 0; inner < nums.length; inner++) { //0
				if (nums[inner] == currentNum && outer != inner) {//1
					duplicate = true;
					break;

				}
			}

			if (duplicate == false) {
				System.out.println(currentNum + " unique");
			}
		}

	}
	/* 
	 * outer = 0
	 * inner =0
	 * currentNum = 1
	 * duplicate = false
	 * nums[inner] -> 1
	 */
}
