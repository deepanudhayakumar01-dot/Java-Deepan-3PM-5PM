package javaAssignment;
import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		
		int cont = Check.numberCheck(number);
		
		if(cont!=0) {
			System.out.println("The value is  "+cont);
		}
		else
			System.out.println("you want know the value then enter the positive Number ");
		

	}
	public static int  numberCheck (int number) {
		int tempNum=number;
		int value=15;
		if(tempNum>=0) {
			return value;
		}
		else
			return 0;
	}

}
