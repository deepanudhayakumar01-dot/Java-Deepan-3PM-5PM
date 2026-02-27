package javaAssignment;
import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		
		Check obj=new Check();
		
		int cont = obj.numberCheck(number);
		
		if(cont!=0) {
			System.out.println("The value is  "+cont);
		}
		else
			System.out.println("If you want to know the value, then enter a positive number.");
		

	}
	public  int  numberCheck (int number) {
		int tempNum=number;
		int value=15;
		if(tempNum>=0) {
			return value;
		}
		else
			return 0;
	}

}
