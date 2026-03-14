package assignment10;

import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size : ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the "+i+"th intex value : ");
			arr[i]=sc.nextInt();
		}
		sumOfArray(arr);

	}
	
	public static void sumOfArray(int [] array) {
		int sum=0;
		
		for(int i : array) {
			sum+=i;
		}
		
		System.out.println("\nSum of All Array Element : "+sum);
		
	}

}
