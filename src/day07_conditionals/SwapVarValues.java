package day07_conditionals;

public class SwapVarValues {
	
	public static void main(String[] args) {
		/*
		 * Swap variable values:
		 * 
		 * int num1 = 100;
		 * int num2 = 200;
		 * 
		 */
		
		int apples = 100;   
	    int   oranges = 200;
		System.out.println("Apples: " + apples + " Oranges: " + oranges);
		//apples = oranges;  <--- did not work
		//oranges = apples;

	    	 int tempContainer = apples; //100
	    	 apples = oranges; //200
	    	 oranges = tempContainer;//100
		
		
		System.out.println("Apples: " + apples + " Oranges: " + oranges);
		
	}

}
