package day25_arrays;

public class CountMatches {
	public static void main(String[] args) {

		/*
		 * create a double array called prices assign 10 or more different prices using
		 * a loop count how many items that is more than $20 print the count if the
		 * price was fount that is more then $20 then print "No items that costs more
		 * than $20
		 * 
		 */

		double[] prices = { 5.05, 10.01, 15.12, 22.75, 48.0, 74.16, 77, 65, 12, 20 };
		int count = 0;
		for (double price : prices) {
			if (price >= 20.0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println(" No items more then $20");
		} else {
			System.out.println(count + " items more then $20");
		}
	}
}