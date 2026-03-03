package assignment4;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int temp=number;
		int digits=0;
		int sum=0;
		
		while(temp>0) {
			digits++;
			temp/=10;
		}
		
		temp=number;
		
		while(temp > 0) {
			int dig=digits;
			int power=1;
			while(dig>0) {
				power*=temp%10;
				dig--;
			}
			sum+=power;
			temp/=10;
		}
		
		if(sum==number) {
			System.out.println(number +" is  an Armstrong number");
		}
		else
			System.out.println(number +" is not an Armstrong number");

	}

}
