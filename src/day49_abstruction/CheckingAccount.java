package day49_abstruction;

public class CheckingAccount extends BankAccount{


@Override

public boolean transfer(int transferAmount, BankAccount targetAccount) {
	 double fee = (transferAmount*3)/100;
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