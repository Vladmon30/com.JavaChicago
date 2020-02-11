package intervewQuestion;

public class PrintFirstAndLast {

public static void main(String[] args) {
		
		String[] words = {"hello","why","by","apple","note"};
		for(String w:words) {
			 System.out.println(w.charAt(0)+""+w.charAt(w.length()-1));
		}
	}
}
