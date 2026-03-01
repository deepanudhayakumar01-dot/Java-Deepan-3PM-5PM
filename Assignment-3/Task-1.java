package assignment3;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 =sc.nextInt();
		System.out.println("Enter the second  Number : ");
		int num2 =sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("Largest number is: " + num1);
		}
		else  {
			System.out.println("Largest number is: " + num2);
		}
	}
	

}
