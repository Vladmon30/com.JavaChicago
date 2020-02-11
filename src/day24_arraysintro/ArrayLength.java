package day24_arraysintro;

public class ArrayLength {
public static void main(String[] args) {
	
	
	//declare array that can store names that store 5 names
	
	String[] names = new String[5];
	
	names[0] = "Seric";
	names[1] = "Khalili";
	names[2] = "Z";
	names[3] = "Erkam";
	names[4] = "Zarina";
	
	System.out.println(names.length);
	
	
	//string name and assign khalili to it by reading array
	String name = names[1];
	System.out.println(name.length()); // count of characters in string
	
	
	
}
}
