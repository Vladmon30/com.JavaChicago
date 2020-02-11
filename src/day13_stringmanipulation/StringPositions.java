package day13_stringmanipulation;

public class StringPositions {
public static void main(String[] args) {
	
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	System.out.println(alphabet.indexOf("A"));
	int pPosition = alphabet.indexOf("P");
	System.out.println("P is at index " + pPosition);
	//HIJ location in alphabet
	int hPosition = alphabet.indexOf("H");
	System.out.println("H is at index " + hPosition);
	int iPosition = alphabet.indexOf("I");
	System.out.println("I is at index " + iPosition);
	int jPosition = alphabet.indexOf("J");
	System.out.println("J is at index " + jPosition);
	
	int hijLocation = alphabet.indexOf("HIJ");
	System.out.println("HIJLocaion " + hijLocation);
	
	String sentence = "Today is Sunday and tomorrow is Monday.";
	System.out.println(sentence.indexOf("Sunday"));
	
	System.out.println(sentence.indexOf("a"));	//3
	System.out.println(sentence.lastIndexOf("a"));	//36
	
	System.out.println(sentence.indexOf("y", 5)); //14
	
	System.out.println(sentence.indexOf("tomorrow")); //20
	
	System.out.println(sentence.indexOf("tomorr")); //20
	
	System.out.println(sentence.indexOf("is M"));
	
	if(sentence.indexOf("and") >= 0) { // AND - is not there
		System.out.println("Word is there");
	}else {
		System.out.println("Word is not there");
		
		String searchResults = "1-24 of over 50,000 results for Electronics: speakers";
		int pos = searchResults.indexOf("of");
		if (pos == 5) {
		System.out.println("PASS");
		}else { 
			System.out.println("FAIL");
		}
	}
	
}
}
