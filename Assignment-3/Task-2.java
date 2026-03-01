package assignment3;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 =sc.nextInt();
		System.out.println("Enter the second  Number : ");
		int num2 =sc.nextInt();
		System.out.println("Enter the Third  Number : ");
		int num3 =sc.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Largest number is: " + num1);
			}
			else {
				System.out.println("Largest number is: " + num3);
			}
		}
		else if(num2>num3) {
			System.out.println("Largest number is: " + num2);
		}
		else
			System.out.println("Largest number is: " + num3);

	}

}
