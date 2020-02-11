package day54_exception1;



public class Engineers {
	public static void main(String[] args) {
		int[] ages = {23,26,43,12,102};
	try {
		System.out.println(ages[6]);
	}
	
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("String index out of bound catch");
	}
	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index here");
	}
		System.out.println("End of program");
	}

}
