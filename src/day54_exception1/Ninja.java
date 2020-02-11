package day54_exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ninja {
	public static void main(String[] args) {
		try {
		fly();
		System.out.println("End of program");
		//System.exit(0);
	}
		catch(FileNotFoundException e) {
			System.out.println("File is not here");
		}
		finally{
			System.out.println("This is finally block. And this get excecuted no metter what happens to exception");
		}
		System.out.println("End of program");
	}

	public static void fly() throws FileNotFoundException {
		File file = new File("Some file here");
		Scanner sc = new Scanner(file);
		
	}
}
