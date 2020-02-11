package day16_reviewsession1;

public class Budget {
	public static void main(String[] args) {

		// print items u can buy purchase your budget
		// 80$ -> cannot buy anything
		// 435 -> u can buy everything

		double budget = 340;

		double phone = 250.0;
		double watch = 105.5;
		double bag = 80;

		// <80$ -> u can buy nothing
		// >435 -> u can buy all
		// if budget >= phone+watch u can buy phone+watch phone+bag or watch+bag;
		// if budget >= watch+bag u can buy watch+bag;
		// if budget >= phone u can buy phone or watch+bag;
		// if budget >= watch u can buy watch or bag;
		// else just a watch

		if (budget < 80) {
			System.out.println("Can not buy anything!");
		} else if (budget >= 435.5) {
			System.out.println("You can buy everything!");
		} else if (budget >= phone + watch) {
			System.out.println("You can buy phone+watch or phone+bag or watch+bag!");
		} else if (budget >= phone + bag) {
			System.out.println("You can buy phone+bag or watch+bag!");
		} else if (budget >= phone) {
			System.out.println("You can buy phone or watch+bag!");
		} else if (budget >= watch + bag) {
			System.out.println("You can buy watch+bag!");
		} else if (budget >= watch) {
			System.out.println("You can buy watch or a bag!");
		} else {
			System.out.println("You can buy a bag!");
			
		}
		
	}
	
} 
