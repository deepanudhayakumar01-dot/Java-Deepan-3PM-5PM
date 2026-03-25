package assignmentException;

import java.util.Scanner;
class WithdrawException extends Exception{

	public WithdrawException(String message) {
		super(message);
	}
	
}

class BaknAccount{
	int ac;
	String name;
	double balance;
	public BaknAccount(int ac, String name, double balace) {
		this.ac = ac;
		this.name = name;
		this.balance = balace;
	}
	
	void withdraw(double amount) throws WithdrawException {
		
		if(amount > balance) {
			throw new WithdrawException("Balance is insufficient");
		}
		else {
			balance -= amount;
			System.out.println("Remenig Balance : "+balance);
		}
	}
}

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BaknAccount a=new BaknAccount(123,"Deepan",6000);
		System.out.println("Enter your amount : ");
		double am=sc.nextDouble();
		try {
			a.withdraw(am);
		} catch (WithdrawException e) {
		   System.out.println("Error : "+e.getMessage());
		}

	}

}
