package day13_stringmanipulation;

public class SringContains {
public static void main(String[] args) {
	String word = "water";
	System.out.println(word.contains("tr")); //tr - false. ter - tre
	
	System.out.println(word.startsWith("w"));//Water
	System.out.println(word.endsWith("r"));// wateR
	System.out.println(word.endsWith("er"));//watER
	
	
	String str = "aabbcc";
	System.out.println(str.isEmpty());
}
}

