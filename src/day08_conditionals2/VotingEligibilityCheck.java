package day08_conditionals2;

public class VotingEligibilityCheck {
	
	public static void main(String[] args) {	
		int age = 2;
		if(age >= 18) {
			System.out.println("U are eligible to vote");
		}else {
			System.out.println("U are not yet eligible for voting");
		}
	}
}