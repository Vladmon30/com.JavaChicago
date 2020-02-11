package day18_loops1;

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {

		/*-Create a string variable SMSmessage, assign following value:
			*"Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}"
			*-Create 3 string variables:
			*sender, phoneNumber,message
			*- by using indexOf and substring methods,
			*retrieve related information from SMSmessage string and assign to those 3 variables.
			*-print each variable in separate line
			*/
		Scanner input = new Scanner(System.in);

		// -Create a string variable SMSmessage "Sender:<Mike Smith>. From
		// Number:[202-123-3456]. Message:{I love programing and problem solving}"
		String SMSmessage = new String(
				"Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}");

		// -Create 3 string variables: sender, phoneNumber,message
		String sender, phoneNumber, message;

		sender = SMSmessage.substring(SMSmessage.indexOf("<") + 1, SMSmessage.indexOf(">"));
		System.out.println(sender);

		phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[") + 1, SMSmessage.indexOf("]"));
		System.out.println(phoneNumber);

		message = SMSmessage.substring(SMSmessage.indexOf("{") + 1, SMSmessage.indexOf("}"));
		System.out.println(message);
// one more example
		sender = SMSmessage.substring(8, 18);
		System.out.println(sender);

		phoneNumber = SMSmessage.substring(34, 46);
		System.out.println(phoneNumber);

		message = SMSmessage.substring(58, 95);
		System.out.println(message);
		
		
		
	}
}
