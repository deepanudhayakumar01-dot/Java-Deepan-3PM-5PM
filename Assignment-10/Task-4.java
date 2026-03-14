package assignment10;

import java.util.Scanner;

public class LargestElementArray {

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
		largest(arr);

	}
	public static void largest(int [] array) {
		int lar=array[0];
		
		for(int i : array) {
			if(lar<i) {
				lar=i;
			}
		}
		System.out.println("\nLargest Element in the Array : "+lar);
	}

}
s