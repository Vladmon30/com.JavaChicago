package example;

public class declarationExpression {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int x : numbers) {
			System.out.print(x);								//10, 20, 30, 40, 50
											

			String[] names = { "Vlad ", "Denys ", "Polina" };
			for (String newName : names) {
				System.out.print(newName);  					//Vlad, Denys, Polina
			
			}
		}
	}
}