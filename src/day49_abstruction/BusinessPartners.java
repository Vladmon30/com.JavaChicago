package day49_abstruction;

public class BusinessPartners {
public static void main(String[] args) {
	
	BankAccount ba1 = new BankAccount();
		ba1.name = "Google";
		ba1.accountNumber = 4321567;
		ba1.balance = 2000000;
		ba1.type = " Business Account";
	
	BankAccount ba2 = new BankAccount();
		ba2.name = "James Bond";
		ba2.accountNumber = 123789;
		ba2.balance = 400;
		ba2.type = " Personal Account";
		
		System.out.println(ba1.balance);
		ba1.deposit(120000);
			System.out.println("Balance now is: " + ba1.balance);
		ba1.withdraw(1000);
			System.out.println("Balance now is: " + ba1.balance);
		ba1.transfer(160000, ba2);
		System.out.println("Google balance " + ba1.balance);
		System.out.println("James Bond balance " + ba2.balance);
		
//	SavingAccount sa = new SavingAccount();
//		sa.balance = 300;
//	    sa.accountNumber=234232;
//	    sa.withdraw(300);
		
}
}
