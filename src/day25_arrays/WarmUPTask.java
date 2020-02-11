package day25_arrays;

public class WarmUPTask {
	public static void main(String[] args) {

		/*
		 * create and array called kitchenItem knife, wooden spoon, plates, cups, forks,
		 * pan, pot, trash can, fridge, dishwasher,
		 * 
		 * using a for each loop iterate through each item; within your for each loop:
		 * have a switch(item) { case "knife": Print
		 * "knife is used for cutting veggies"; break; ...
		 * 
		 */

		String[] kitchenItems = { "knife", "woodenspoon", "plates", "cups", "forks", "pan", "pot", "trash can",
				"fridge", "dishwasher" };
		for (String item : kitchenItems) {
			// System.out.println(item);
			switch (item) {
			case "knife":
				System.out.println("use for cutting vedggies");
				break;
			case "woodenspoon":
				System.out.println("use for eating");
				break;
			case "plates":
				System.out.println("using fo putting eat on it");
				break;
			case "cups":
				System.out.println("use for drink");
				break;
			case "forks":
				System.out.println("use for eat macaronne");
				break;
			case "pan":
				System.out.println("using fo putting eat on it");
				break;
			case "pot":
				System.out.println("use for drink");
				break;
			case "trash can":
				System.out.println("use for trash");
				break;
			case "fridge":
				System.out.println("using for friez eat on it");
				break;
			case "dishwasher":
				System.out.println("use for washing dish");
				break;
			
			}
		}
	}
}
