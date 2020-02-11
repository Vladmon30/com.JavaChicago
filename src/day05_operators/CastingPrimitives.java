package day05_operators;

public class CastingPrimitives {
	public static void main(String[] args) {
		
		int i = 100;
		byte b = (byte)i;
		
		//implicit casting example
		int count = 45566;
		double doubleCount = count;

		System.out.println(doubleCount);
		
		byte byteValue = 127;
		int intValue = byteValue;
		
		//explicit example
		
		
		int students = 70;
		byte byteStudents = (byte)students;
		System.out.println(byteStudents);
		
		//int--> byte var
		
		double priceOfSmth = 5343.23;
		int intPrice = (int)priceOfSmth;
		System.out.println(intPrice);
		
		int large = 343213;
		byte small = (byte)large;
		System.out.println(small);
		
		System.out.println(5/2.0);
		int x = (int)(5/2.0);
		System.out.println(x);
	}
}