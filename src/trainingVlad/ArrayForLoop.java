package trainingVlad;

import java.util.Arrays;

public class ArrayForLoop {
public static void main(String[] args) {
	String [] shopList = {"Orange", "Apple", "Carrot", "Bananas", "Milk", "Cucumber"};
	Arrays.sort(shopList);
		for(int i = 0; i<shopList.length; i++) {
			System.out.print(shopList[i]+" ");
		}
}
}
