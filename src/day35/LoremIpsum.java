package day35;

import org.omg.Messaging.SyncScopeHelper;

public class LoremIpsum {
public static void main(String[] args) {
	
	/*
	 * Metho name: doesContain
	 * Return type: boolean
	 * Accept a string as a parameter
	 * Return true or false
	 * Condition : Check if the fird sentence contains the word "massa"
	 * - (or word specific for your lorem ipsum)
	 * Output should be; true or false
	 * P laceHolder: Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
	 * sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
	 * Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. 
	 * Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices 
	 * vitae auctor eu augue.
	 */
	String loremIpsum="Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
            + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            + "Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. "
            + "Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices vitae "
            + "auctor eu augue.";
	System.out.println(doesContain(loremIpsum));
}

	public static boolean doesContain(String str) {
		String[] splitIpsum = str.split("\\.");
		String thirdSentence = splitIpsum[2];
		if (thirdSentence.contains("massa")) {
			return true;
		} else
			return false;
	}

}
