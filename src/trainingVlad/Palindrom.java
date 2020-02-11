package trainingVlad;

public class Palindrom {
public static void main(String[] args) {
	/*
	 * 
	 * Method name: isPalindrome
	 * ■Return type boolean
	 * ■Accepts a String as parameter
	 * ■Returns the value as boolean (true/false) if the given string is palindrome or not
	 * ■Output should be like:
	 *  true false
	 * 
	 */
	
	String name = "mamam";
	System.out.println(isPalindrome(name));
}

private static boolean isPalindrome(String name) {
	String reversedName = "";
		for(int i = name.length()-1; i>=0; i--){
			reversedName += name.charAt(i);
		}
		if (!reversedName.equalsIgnoreCase(name)){
			return false;
		}else 
		return true;
}
}