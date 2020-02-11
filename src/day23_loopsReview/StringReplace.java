package day23_loopsReview;

public class StringReplace {
public static void main(String[] args) {
	String sentence = "We are learning Java";
	System.out.println(sentence);
	
	sentence = sentence.replace("Java", "C#");	System.out.println(sentence);
	
	//can u replace word 'learning' - 'practicing'
	
	sentence = sentence.replace("learning", "practice");
	
	System.out.println(sentence);
	
	
	sentence = sentence.replace("a", "A");
	System.out.println(sentence);
	
	sentence = sentence.replaceAll("a", "A");
	System.out.println(sentence);
	
	
	String word = "abcdefg java selenium";
	System.out.println(word.replace("ava", "unit"));
	
	word = word.replace("ava", "unit");
	System.out.println(word);
	
	
	String result = "123,456,001 results";
	// remove results and coma
	result = result.replace("results", "").replace(",", "");
	System.out.println(result);
	
	
}
}
