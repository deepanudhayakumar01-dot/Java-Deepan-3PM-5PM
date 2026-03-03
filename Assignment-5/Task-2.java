package assignment5;

import java.util.Scanner;

class AccountDetails{
	int accountNumber;
	String accountHolderName;
	double balance;
	
	void deposit(double amount) {
		balance +=amount;
	}
	void withdraw(double amount) {
		if(balance <amount) {
			System.out.println("Balance is insufficient");
			return;
		}
		balance -=amount;
	}
	void displayBalance() {
		System.out.println("Your Account balance : "+balance);
	}
}

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AccountDetails a1=new  AccountDetails();
		AccountDetails a2=new  AccountDetails();
		
		a1.accountNumber=123456;
		a1.accountHolderName="Deepan";
		a1.balance=100000;
		
		a2.accountNumber=156489;
		a2.accountHolderName="Surender";
		a2.balance=90000;

		boolean state=true;
		
		while (state) {
			System.out.println("1.Deposit\n2.withdraw\n3.display Balance \n4.Exit\nEnter the option");
			int no=sc.nextInt();
			double amo;
			switch (no) {
			case 1:
				System.out.println("Enter the Deposit amount :  ");
				amo=sc.nextDouble();
				a1.deposit(amo);
				break;
			case 2:	
				System.out.println("Enter the withdraw amount :  ");
				amo=sc.nextDouble();
				a1.withdraw(amo);
				break;
			case 3:	
				a1.displayBalance();
				break;
			case 4:
				System.out.println("Thank you...");
				state=false;
				break;
			}
		}
		
		
		

	}

}
