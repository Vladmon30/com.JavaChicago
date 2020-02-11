package day31_NewArrays;

public class MethodAcceptAMultiDimension {
public static void main(String[] args) {
	
	/*
	 * Create a void method that accept a multi-dimension array
	 * Accept 2 integer that will be assigned as row and column of array
	 * Print out this values
	 * Output should be like this:
	 * The element at the row : 2 and columns 3 
	 * 
	 */
	int[][] numbers = { {1,2,3,4,5},
						{5,6,7,8,9},
						{3,3,4,6,6},
						{1,3,5,6,5},
					  };
	getCoord(numbers,3,4);
}
	private static void getCoord(int[][] givenArray, int rows, int cols) {
	
	System.out.println("The element at the row number: " + rows + " column number: " + cols + " number itself: " + 
	givenArray[rows][cols]);
		
	}
}

