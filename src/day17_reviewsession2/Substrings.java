package day17_reviewsession2;

public class Substrings {
public static void main(String[] args) {
	
	/*
	 * create a variable diceResults
	 * assign 1 - 30 of 1,367 positions
	 * using substring  extract number of open position
	 * output 1,367 
	 */
	
	
	//String diceResults = "1 - 30 of 1,367 positions";
	//System.out.println(diceResults.substring(10,16) );
	
			
	String diceResults = new String("1 - 30 of 1,367 positions");
	String position = diceResults.substring(10,15);
	System.out.println(position);
	
	String languages = new String ("Java, Fortrun, English, Cobal, Rubby, C#");
	String lan1, lan2, lan3, lan4, lan5, lan6;
	
	//using substring assign each language to each variable.
	//for the last language just pass one number to sbstring.
	
	lan1 = languages.substring(0,4);
	System.out.println(lan1);
	
	lan2 = languages.substring(6,13);
	System.out.println(lan2);
	
	lan3 = languages.substring(15,22);
	System.out.println(lan3);
	
	lan4 = languages.substring(24,29);
	System.out.println(lan4);
	
	lan5 = languages.substring(31,36);
	System.out.println(lan5);
	
	lan6 = languages.substring(38);
	System.out.println(lan6);
	
	
}
}
