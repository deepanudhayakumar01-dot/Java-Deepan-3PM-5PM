package assignment3;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num =sc.nextInt();
		System.out.println("Count of "+num+" Digits is : "+countDigits(num,0));

	}
	
	public static int countDigits(int number,int count) {
		int tempcount=count;
	    if(number==0) {
	    	return tempcount;
	    }
	    tempcount = countDigits(number/10,tempcount+=1);
		return tempcount;
	}

}
