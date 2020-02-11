package day28_EssenClass;

public class ArraysTwoDimension {
public static void main(String[] args) {
	
	// we can put array into array
				//		       0             1             2
	            //           0,1,2     0, 1, 2, 3, 4    0,  1,  2
		int[] [] numbers = {{1,2,3}, {10,20,30,40,50},{100,200,300}};
	// if we need first conteiner second value its gonna be int [0] [1]  (value = 2)
	// 	if we need third conteiner third value its gonna be int [2] [2]  (value = 300)
		
		System.out.println(numbers[0][0]);
		
		int [] [] nums =  new int[3][];
		System.out.println(nums[1][3]);
		
		int [] ages = {26,25,50,10};
		//numbers[0] = new int[4];
		nums[0]=ages;
		System.out.println(nums[0][2]);
		
}
}
