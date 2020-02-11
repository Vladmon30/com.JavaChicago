package day49_abstruction;

public class SavingAccount extends BankAccount{
	

	public boolean transfer(int transferAmount, BankAccount targetAccount) {
		 double fee = (transferAmount*8)/100;
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
	@Override
public void withdraw(int withdrwAmount) {
		
		double fee = (withdrwAmount*2)/100;
		
		if (this.balance >= withdrwAmount+fee) {
			System.out.println( withdrwAmount + " is withdrawn from " + this.accountNumber);
			this.balance=balance-withdrwAmount;
		}else
			System.out.println("Not sufficient money");
	}
	}
