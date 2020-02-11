package day49_abstruction;

public class BankAccount {

	/*
	 * 1.Create a class BankAccountInstance variables: type, name, accountNumber,
	 * balance 
	 * Methods: void method deposit. Method accepts integer amount. Print
	 * “%amount is deposited to %accountNumber” and increment balance by given
	 * amount. Void method withdraw. Method accepts integer amount. Check if balance
	 * has at least equal amount of requested amount. If sufficient money in the
	 * balance then print “%amount is withdrawn from %accountNumber” and decrement
	 * balance by requested amount. If not sufficient money in the balance then
	 * print “Not sufficient balance in %accountNumber”.
	 * 
	 * Boolean return method transfer. Method accepts two parameters. 1. Integer
	 * amount 2. BankAccount type(target account where you are sending money to).
	 * Check if current account has sufficient money to send and 5% transfer fee. If
	 * account has enough money then print “%transferAmount is transferred from
	 * %accountNumber to %targetAccountNumber” and increment target account’s
	 * balance by integer and decrement balance from current account by transfer
	 * amount + 5% transfer fee.
	 */
	String type;
	String name;
	int accountNumber;
	double balance;

	public void deposit(int amount) {
		System.out.println(amount + " is deposited to : " + this.accountNumber);
		System.out.println(this.balance = balance + amount);
	}

	public void withdraw(int amount) {
		
		if (this.balance >= amount) {
			System.out.println( amount + " is withdrawn from " + this.accountNumber);
			this.balance=balance-amount;
		}else
			System.out.println("Not sufficient money");

	}
	
	 /* Boolean return method transfer. Method accepts two parameters. 1. Integer
	 * amount 2. BankAccount type(target account where you are sending money to).
	 * Check if current account has sufficient money to send and 5% transfer fee. If
	 * account has enough money then print “%transferAmount is transferred from
	 * %accountNumber to %targetAccountNumber” and increment target account’s
	 * balance by integer and decrement balance from current account by transfer
	 * amount + 5% transfer fee.
	 */
	
	 public boolean transfer(int transferAmount, BankAccount targetAccount) {
		 double fee = (transferAmount*5)/100;
		 if(this.balance>=transferAmount + fee) {
			 System.out.println(transferAmount + " is transfered from " + this.accountNumber + targetAccount );
			 this.balance = balance- transferAmount +fee;
			 targetAccount.balance+=transferAmount;
			 return true;
		 }
		 else {
			 System.out.println("Not sufficient money in " + this.accountNumber);
		 }
		return false;
	 }
}
