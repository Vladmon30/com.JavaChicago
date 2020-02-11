package day05_operators;

public class ShortHandOperators {
		public static void main(String[] args) {
			int count = 100;
			count = count +1;//101
			
			System.out.println(count);
			// add 10 to count, same way
			
			
			count = count + 10;
			System.out.println(count);
			
			count +=10;
			System.out.println(count);
			
			
			count =15;
			count *= 2;
			count = count *2;
			System.out.println(count);
			
			count /=5;
			System.out.println(count);
			
			count %= 5;
			//5+5=10(2 left)
			System.out.println(count);
			
			double price = 34.4;
			price /=2;
			System.out.println(price);
			
		}
}
