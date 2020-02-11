package day06_operators_boolean;

public class IncrementDecrementOperators {
	// main+cntrl+spase
	public static void main(String[] args) {
		
	// sysout+cntr+space
		
		int windowsComputers = 35;
		// increace by one. add one
		
		windowsComputers++;
		windowsComputers++;
		System.out.println(windowsComputers);
		//long way
		windowsComputers = windowsComputers + 1;
		//sort way
		windowsComputers+=1;
		
		System.out.println(windowsComputers);
		
		int unreadMessages = 50;
		System.out.println("Unread messages:" + unreadMessages);
		System.out.println("Reading one message");

		unreadMessages--;
		System.out.println("Unread messages:" + unreadMessages);
		
		unreadMessages--;
		System.out.println("Unread messages:" + unreadMessages);
	}

}
