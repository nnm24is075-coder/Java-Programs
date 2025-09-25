package bankdemo;

	import java.util.*;
	public class Account {
		int accountNo;
		String name;
		double balance;
		
		Account( int accountNo, String name, int balance ){
			this.accountNo=accountNo;
			this.name=name;
			this.balance=balance;
			
		}
		void display(){
			System.out.println(" ACCOUNT NUMBER :"+ this.accountNo );
			System.out.println("Name of the HOlder :"+ this.name);
			System.out.println("Balance :" + this.balance);
		}
		void deposit(double amount ) {
			if(amount<=0) {
				throw new ArithmeticException(" Deposit amount must be above zero");
				
			}
			balance=balance+amount;
			System.out.println("The amount is sucessfully deposited ");
			System.out.println("The remaining balance :" +balance );
			
		}
		void withdraw(double amount) throws InsufficientBalanceException{
			if(balance<=0) {
				throw new ArithmeticException(" The balance is  zero");
			}
			else if(balance<amount) {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			balance=balance-amount;
			System.out.println("The amount is sucessfully withdrawn ");
			System.out.println("The remaining balance :" +balance );
			
		}
	void showBalance() {
		System.out.println("BALANCE: "+ balance);
	}

}




