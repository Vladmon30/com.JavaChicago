package day08_conditionals2;

public class MultiWayIfStatements {
	public static void main(String[] args) {	
//		int weekday = 1;
//		if(weekday == 1) {
//			System.out.println("Monday");
//		}else {
//			System.out.println("Its not Monday");
//		}
//		
//		if(weekday == 2) {
//			System.out.println("Tuesday");
//	}else {
//		System.out.println("Its not Tuesday");
//	}
//		if(weekday == 3) {
//			System.out.println("Wednesday");
//		}else {
//			System.out.println("Its not Wednesday");	
//		}
	
			int weekday = 6;
			
			if(weekday == 1) {
				System.out.println("Monday");
			}else if (weekday == 2) {	
				System.out.println("Tuesday");
			}else if (weekday == 3) {
				System.out.println("Wednesday");
			}else if (weekday == 4) {
				System.out.println("Thursday");
			}else if (weekday == 5) {
				System.out.println("Friday");
			}else if (weekday == 6) {
				System.out.println("Saturday");
			}else if (weekday == 7) {
				System.out.println("Sunday");
			}else {
				System.out.println("Involid day. Can be only 1-7");
			}
		
	}
}
			