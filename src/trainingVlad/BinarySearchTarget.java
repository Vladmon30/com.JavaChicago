package trainingVlad;

import java.util.Arrays;

public class BinarySearchTarget {
public static void main(String[] args) {
	int[] targetArrayObject = {11,4,6};
	int targetItemToSearch = 4 ; 
	
	Arrays.sort(targetArrayObject) ; // 4,6,11
	Arrays.binarySearch(targetArrayObject,targetItemToSearch); //0
	System.out.println("number: " + targetItemToSearch + "was found in: " + Arrays.binarySearch(targetArrayObject,targetItemToSearch));
	
	// Optionally 
	Arrays.toString(targetArrayObject);// [4,6,11]
}
}
