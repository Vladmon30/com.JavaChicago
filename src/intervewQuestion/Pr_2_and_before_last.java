package intervewQuestion;

public class Pr_2_and_before_last {
public static void main(String[] args) {
	 String[] words = {"hello","why","by","apple","note"};
	 for(String w:words) {
		 System.out.println(w.charAt(1)+""+w.charAt(w.length()-2));
	 }
}
}
