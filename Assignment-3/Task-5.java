package assignment3;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num =sc.nextInt();
		
		if(num == 0) {
			System.out.println("Give in number is Zero");
		}
		else if(num > 0) {
			System.out.println("Give in number is  Positive");
		}
		else {
			System.out.println("Give in number is Negative");
		}

	}

}
