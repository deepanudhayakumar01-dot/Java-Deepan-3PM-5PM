package assignment3;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num =sc.nextInt();
		
		System.out.println("sum of first N natural numbers : "+sumOfNaturalNumbers(num,0));

	}
	
	public static int sumOfNaturalNumbers(int number,int sum) {
		int tempSum=sum;
		if(number==0) {
			return tempSum;
		}
		tempSum=sumOfNaturalNumbers(number-1,tempSum+number);
		return tempSum;
	}

}
