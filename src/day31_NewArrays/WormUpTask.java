package day31_NewArrays;

public class WormUpTask {
	public static void main(String[] args) {
		/*
		 * create a java program that has an array of string called carBands mersedes,
		 * bmw, toyota, ferrari Loop throu this array Then provides information about
		 * that brand Output should be as bellow
		 */
		String[] carBrands = { "mersedes", "bmw", "toyota", "ferrari" };

		for (int i = 0; i < carBrands.length; i++) {
			if (carBrands[i] == "mersedes") {
				System.out.println(carBrands[i] + " Luxury-Comfort");
			} else if (carBrands[i] == "bmw") {
				System.out.println(carBrands[i] + " Luxury-Sport");
			} else if (carBrands[i] == "toyota") {
				System.out.println(carBrands[i] + " Reliable-Chip");
			} else {
				System.out.println(carBrands[i] + " Super-Expencive");
			}
		}
	}
}
