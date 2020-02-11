package day31_NewArrays;

import java.util.Arrays;

public class Grades {
public static void main(String[] args) {
	
	
	/*Create an array of number called grades
	 * Elements of the array should be as followed
	 * 15,25,33,35,66,44,8,95,98,1,500
	 * created a logic that prints out the max and min of grades
	 * the output should be:
	 * Min grade: 1
	 * Max grade: 500
	 * 
	 */
				//  0   1    2   3   4   5  6   7  8   9   10 
	int[] grades = {15, 25, 33, 35, 66, 44, 8, 95, 98, 1, 500};

		int minGrade = grades[0];
		int maxGrade = grades[0];
		
	for (int i = 0; i < grades.length; i++) {
		
		if(maxGrade < grades[i]) {
			maxGrade = grades[i];
		}
		if(minGrade > grades[i]) {
			minGrade = grades[i];
			
	}
	}
	System.out.println("Minimum grade: " + (minGrade));
	System.out.println("Maximum grade: " + (maxGrade));
	
	
}
}
