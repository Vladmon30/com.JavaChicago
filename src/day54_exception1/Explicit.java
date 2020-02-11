package day54_exception1;

public class Explicit {
	
	public static void main(String[] args) throws Exception {
		try {
			doubleTheNumber(-23);
		}
		catch(RuntimeException e){
			System.out.println("Not allowed input");
		}
		doubleTheNumber(-23);
		checked("Jamie");
	}
//		doubleTheNumber(-23);
//		doubleTheNumber(3);
//		doubleTheNumber(2323);
		
	
	
	public static void doubleTheNumber(int i) {
		
		if (i<0) {
		//	System.out.println("Hi please enter a positive number");
			throw new RuntimeException("Enter positive number");
		}else {
		System.out.println(i*2);
	}
	}
		public static void checked(String name) throws Exception{
			if (name.equals("James")) {
			throw new Exception("Checked exeption here");
		}
		System.out.println("Welcome, "+ name);
}
}