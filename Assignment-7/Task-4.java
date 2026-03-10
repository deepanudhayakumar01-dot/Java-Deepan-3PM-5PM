package assignment7;
import java.util.*;

class BankAccount{
	long accountNumber;
	String accountHolderName;
	double balance;
	public BankAccount(long accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	void deposit(double amount) {
		if (0>=amount) {
			System.out.println("\nInvalid Amount");
			return;
		}
		balance +=amount;
	}
	void displayBalance() {
		System.out.println("\nAccount Number : "+accountNumber+"\nBalance : "+balance);
	}
}

public class BankAccountDepositScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankAccount a1=new BankAccount(958456728753L,"Deepan Udhayakumar ",50000);
		double am;
		do {
		System.out.println("Enter the Amount : ");
		am=sc.nextDouble();
		a1.deposit(am);
		}while(am<=0);
		a1.displayBalance();
		

	}

}
