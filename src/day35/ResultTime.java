package day35;

public class ResultTime {
	public static void main(String[] args) {
		
		/*
		 * Method name: resultTime returnType String Accepts a string as parameter
		 * String will be passed as google result count format 
		 * Print out only the time of search results. output => 0.78 Seconds
		 */
		String results=" About 1,060,000,000 results (0.74 seconds) ";
		System.out.println(resultTime(results));
		
	}
	public static String resultTime(String str) {
		
		String[] splitArr = str.split("\\(");   // we use \\ for  fix
		
		String secondPart = splitArr[1]; //0.74 seconds
		String wopSecondPart = secondPart.replaceAll("\\)", "");
		return wopSecondPart;
	}
}
