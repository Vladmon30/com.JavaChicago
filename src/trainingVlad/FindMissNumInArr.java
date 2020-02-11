package trainingVlad;

public class FindMissNumInArr {
public static void main(String[] args) {
	int []arr= {1,3,4,6,5,7,8};
	int sumArr=0;
	int expSumArr=0;
	int total=0;
	
	for(int i = 0; i<arr.length; i++) {
		sumArr= sumArr + arr[i];
	}
	
	for(int i=1; i<=8; i++) {
		expSumArr = expSumArr + i;
	}
	
	total = expSumArr-sumArr;
	System.out.println("Missing num is: " + total);
}
}
