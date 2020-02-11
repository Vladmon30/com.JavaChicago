package example;

public class findMissingNumInArray {
public static void main(String[] args) {
	
	   // index   0  1  2  3  4  5
	int[] num = { 1, 2, 3, 6, 9, 10 };  //missing  4,5,7,8
	int j = 0;
	for (int i = 1; i <= 10; i++) {
		if (i == num[j]) {
			j++;
		} else if (i != num[j]) {
		
			System.out.println(i);
		

		}

	}
}
}
