package assignment11;

import java.util.Scanner;

abstract class Account{
	abstract void calculateInterest(double amount);
}
class SavingsAccount extends Account{
	void calculateInterest(double amount) {
		System.out.println("In the Saving Account..\nInterest percentage : 12%\nInterest for the Amount "+amount+" is : "+amount*12/100);
	}
}
class CurrentAccount extends Account{
	void calculateInterest(double amount) {
		System.out.println("In the Current Account..\nInterest percentage : 15%\nInterest for the Amount "+amount+" is : "+amount*15/100);
	}
}
		
public class DPUBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account a;
		double am;
		
		System.out.println("Your Account Type...\n1.Saving Account\n2.Current Account");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			a=new SavingsAccount();
			System.out.println("Enter the amount : ");
			am=sc.nextDouble();
			a.calculateInterest(am);
			break;
		case 2:
			a=new CurrentAccount();
			System.out.println("Enter the amount : ");
			am=sc.nextDouble();
			a.calculateInterest(am);
			break;
			default:
				break;
			
		}

	}

}
