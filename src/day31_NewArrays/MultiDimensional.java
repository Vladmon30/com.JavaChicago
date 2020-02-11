package day31_NewArrays;

public class MultiDimensional {
public static void main(String[] args) {
	
	/*
	 *create a multiDimension array that has 4 rows, and 5 columns
	 *Give random numbers manualy
	 *Print it out as a table
	 *Output should be something like
	 *   12   54  33  23 22
	 *   13   34  23  55 22
	 *   45   34  66  54 33
	 *   54   23  22  44 43
     *
	 */
	int[][] numbers = { {1,2,3,4,5},
						{5,6,7,8,9},
						{3,3,4,6,6},
						{1,3,5,6,4},
	                   };
		for(int row = 0; row < numbers.length; row++) {
		
			for(int col = 0; col < numbers[row].length; col++) {
				
				System.out.print(numbers[row][col] + "\t");
			}
	     System.out.println("");
		}
	}
}