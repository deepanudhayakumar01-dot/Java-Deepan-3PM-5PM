package javaAssignment;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount : ");
		double amount=sc.nextDouble();
		
		if(amount > 5000) {
			System.out.println("You have the discount for your amount : "+amount);
		}
		else
		{
			System.out.println("You don't have the discount for your amount"+amount);
		}

	}

}
