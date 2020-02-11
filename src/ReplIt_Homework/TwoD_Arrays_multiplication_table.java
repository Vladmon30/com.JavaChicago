package ReplIt_Homework;

import java.util.Arrays;

public class TwoD_Arrays_multiplication_table {
	public static void main(String[] args) {
	    int [][] multiplicationTable = new int[10][10];
	    
	    //TODO: type your code below
	    for (int row = 0; row < multiplicationTable.length ; row++)
	   {
	       for (int column = 0; column < multiplicationTable[row].length; column++)
	       {
	           multiplicationTable[row][column] = (row+1)*(column+1);
	       }


	     }
	    
	    //Do not modify below line it will be used to test your code. And 
	    //Can be used by you while developing your code
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	  }
	}

