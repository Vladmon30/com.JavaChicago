package day17_reviewsession2;

public class DynamicSubstring {
	public static void main(String[] args) {
		
		/*
		 * indexOf ->  accepts a string and finds the position
		 * String str = "abc start";
		 * str.indexOf("b");
		 * str.indexOf("start")->4
		 * 
		 */
		
		
		String sentence = "We are learning Python programming";
		//find a position learning
		int start = sentence.indexOf("learning");
		//find a position programming
		int end = sentence.indexOf("programming");
		
		System.out.println(start);
		System.out.println(end);
		
		start += "learning".length();
		
		String language = sentence.substring(start, end);
		System.out.println(language);
	}
}