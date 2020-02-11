package day35;

public class GoogleResultCount {
	public static void main(String[] args) {

		/*
		 * Method name: resultCount return Type String Accepts a string as parameter
		 * String will be passed as a google result count format Print out only the
		 * count of search result
		 */

		String results = "About 1,060,000,000 results (0.99 seconds) ";
		System.out.println(resultCount(results));
	}

	public static String resultCount(String str) {
		String[] strSplit = str.split(" ");
		String resultWithComa = strSplit[1];

		String resultWithOutComa = strSplit[1].replaceAll(",", "");

		return resultWithOutComa;

	}
}
