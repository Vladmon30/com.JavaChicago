package day30_methods;

public class StringMan {
public static void main(String[] args) {
	char c = getFirstChar("Obama");
	System.out.println(c);
}
public static char getFirstChar(String word){
	char firstChar = word.charAt(0); // 0--> 'O' bama; 
									 // 1--> O 'b' ama;
									 // 2--> Ob 'a' ma;
	return firstChar;
	}
}
