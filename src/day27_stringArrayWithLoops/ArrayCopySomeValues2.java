package day27_stringArrayWithLoops;

public class ArrayCopySomeValues2 {
	public static void main(String[] args) {
		
	
	String[] arr = { "zero", "one", "two", "three", "four", "keys" };
	// count how many words have 'e' in arr

	int counter = 0;
	for (int i = 0; i<arr.length;i++) {
		if(arr[i].contains("e")) {
//			fewValues[i] = arr[j];
		}
	}
	System.out.println(counter);
	
	//create array few values, with size of counter
	String[] fewValues = new String[counter];
	
	//go over arr one more time and odd the words with 'e' into fewValues
	
	int i = 0;
	for(int j=0; j<arr.length; j++) {
		if(arr[j].contains("e")) {
			fewValues[i] = arr[j];
			i++;
		}
	}
	for(String val : fewValues) {
		System.out.println(val + " ");
	}
}
}
