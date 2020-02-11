package day37_wrapper_class;

public class ValueOf {
	public static void main(String[] args) {
		
		// store a value of 45.3 in string
		
		String amount = "transaction amount is 45.3 ";
		String[] words = amount.split(" ");
		double d = Double.valueOf(words[words.length - 1]);
		System.out.println(d);
		
//		amount = amount.replaceAll("\\D+","");
//		System.out.println(amount);
	}
}
