package day14_classworks;

public class SubStringExamples {
public static void main(String[] args) {
	//substring gets part of a string
	// there are 2 versions, first takes 1int, second take 2int
	// if it takes 1int, it means starting point
	//we cannot give a number bigger than the length, it will throw error
	// if we give number equal to the length, it will retourn empty string
	
	String str = "donaldtheduck@gmail.com";
	System.out.println(str.substring(14));
	
	
	System.out.println(str.substring(6, 13));
	//thirst number is where the new string will start, second-end  "theduck"
	
	System.out.println(str.substring(19, 20));// just "."
}
}
