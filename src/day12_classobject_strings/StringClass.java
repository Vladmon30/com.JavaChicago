package day12_classobject_strings;

public class StringClass {
public static void main(String[] args) {
	String name = "Vladyslav";
	/*
	 * 1 declaring variable -> String name.
	 *      -> variable name is name and type is String 
	 *      -> hey java, "I want u to create a veriable called name I 
	 *      -> that can store String objects.
	 * 2 Assign value - String object.
	 *         Anything in double quotes is String object with that variables
	 * 		
	 */
//	System.out.println(name.toUpperCase());
//	System.out.println(name.toLowerCase());
//	System.out.println(name); //original data Vladyslav
//	name = name.toUpperCase();// update and re-assign to name
//	System.out.println(name);// All caps: VLADYSLAV
	
//	System.out.println( name.length() ); // 9 num in v.l.a.d.y.s.l.a.v.
	//System.out.println( "java".length() );

	//int count = name.length();
	
	
	System.out.println(name.charAt(0));
	char result = name.charAt(0);
	System.out.println(result);
	
	//if(result == "V") {
	//	System.out.println("V is first letter");
	//}else {
	//	System.out.println("V is not first letter");
	//	}
	//char secondChar = name.charAt(1);
	//System.out.println("secondChar");
	
}
}