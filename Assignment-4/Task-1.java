package assignment4;
import java.util.Scanner;

public class CountNumberDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int digits=0;
		while(number>0) {
			number/=10;
			digits++;
		}
		System.out.println("Number of digits : "+digits);

	}

}
