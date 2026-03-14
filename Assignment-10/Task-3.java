package assignment10;

import java.util.Scanner;

public class AverageOfArrayElements {

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
		average(arr);

	}
	
	public static void average(int [] array) {
		int l=array.length;
        double sum=0;
		
		for(int i : array) {
			sum+=i;
		}
		
		System.out.println("\nAverage of All Array Element : "+sum/l);
	}

}
