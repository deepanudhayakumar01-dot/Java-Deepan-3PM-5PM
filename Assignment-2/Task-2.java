package assignment2;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Accountdetail a1=new Accountdetail();
		a1.setAccountDetail(58942585,"Deepan Udhayakumar", 3978);
		
		a1.displayAccountDetail();
		
		System.out.println("\nEnter the widthrawal Amount : ");
		double amount=sc.nextDouble();
		a1.withdrawal(amount);
		
		System.out.println("After the widthrawal Account Details :  ");
		a1.displayAccountDetail();

	}

}

class Accountdetail{
	static String banckName ="HDFC";
	int accountNumber;
	String accountHolderName;
	double  accountBalance; //Static variable
	
	public void setAccountDetail(int acNumber,String name, double acBalance) {
		accountNumber=acNumber;
		accountHolderName=name;
		accountBalance = acBalance;
		
	}
	
	public void withdrawal(double wdAmount) {
		double withdrawalAmount=wdAmount; //local variable.
		if(accountBalance < withdrawalAmount) {
			System.out.println("Enter the current Amount");
			return;
		}
		accountBalance = accountBalance - withdrawalAmount;
	}
	public void displayAccountDetail() {
		System.out.println("\nBank Name           : "+banckName);
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account Balance     : "+accountBalance);
	}
	

}
