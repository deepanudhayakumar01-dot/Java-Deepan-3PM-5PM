package assignment4;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double balance = 10000;
		double amount;
		while(balance>0) {
		System.out.println("Enter withdrawal amount : ");
        amount=sc.nextDouble();
		if( amount > balance) {
			System.out.println("Insufficient Balance");
		}
		else if(amount <= 0 ) {
			System.out.println("Invalid Amount");
		}
		else {
			balance =balance-amount;
			System.out.println("Remaining balance : "+balance);
		}
	}

	}

}
