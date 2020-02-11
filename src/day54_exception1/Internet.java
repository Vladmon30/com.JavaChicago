package day54_exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Internet {
public static void main(String[] args){
	
	String name = "James";
	File file = new File("users/desctop/whatever.txt");
	
	try {
		Scanner sc = new Scanner(file);
		System.out.println("After scanner load");
		System.out.println(name.charAt(23));
	}
	catch(FileNotFoundException e) {
		//statement
		System.out.println("Hey your file was not found");
	}
	
	catch(StringIndexOutOfBoundsException e) {
		//statement
		System.out.println("Hey name doesnt have given index");
	}
	
	System.out.println(name);
}
}
