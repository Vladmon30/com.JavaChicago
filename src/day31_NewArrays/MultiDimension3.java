package day31_NewArrays;

public class MultiDimension3 {
public static void main(String[] args) {
	
	/*
	 * Create a method that accept a multi-dimension array
	 * And prints out the values of that array in a table format
	 * Pass two mlti-dimensional array in
	 * Output should be like this:
	 * 
	 *  This is the first array:
	 *     1    2    3    4
	 *     5    6    7    8
	 *     9    10   11   12
	 *  This is the second array:
	 *     1    2    3    4
	 *     5    6    7    8
	 *     9    10   11   12
	 * 
	 */
	
	int[][] numbers1 = { {1,2,3,4,5},{5,6,7,8,9},{3,3,4,6,6},{1,3,5,6,5} };
	int[][] numbers2 = { {1,5,3,4,5},{5,2,7,3,9},{3,3,9,6,6},{1,1,5,3,5} };				
					
	System.out.println("This is the first array:");
	printArrays(numbers1);
	
	System.out.println("This is the second array:");
	printArrays(numbers2);
}
	public static void printArrays(int[][] givenArray) {
		
		for(int row = 0; row < givenArray.length; row++) {
			for(int col = 0; col < givenArray[row].length; col++) {
				System.out.print(givenArray[row][col]+"\t" );
		}
				System.out.println("");
		  }
	}
}
