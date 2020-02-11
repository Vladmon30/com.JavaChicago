package trainingVlad;

import java.sql.Array;
import java.util.Arrays;

public class MultiDementionalArrayTrain {
public static void main(String[] args) {
   
//	int[][]nums = {{5,7,10},{3,88,16}};
//	
//	 
//	System.out.println(nums[1][0]);
	
	int[][] data ={ {12,5,4},{23,113,32}};   
	
//	for (int i = 0; i < data.length; i++) {
//		System.out.println("Row : "+ i);
//		
//	for (int j = 0; j < data[i].length; j++) {
//		System.out.print(data[i][j]+" ");
//		}
//	System.out.println();
//	}
//}
	for (int[] rows : data) {
		System.out.println("*******Row : ");
	for (int column : rows) {
		System.out.print(column + " ");
		}
	System.out.println();}
	}


}
