package assignment10;

import java.util.Scanner;

public class SmallestElementArray {

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
		smallest(arr);

	}
	public static void smallest(int [] array) {
           int small=array[0];
		
		for(int i : array) {
			if(small > i) {
				small=i;
			}
		}
		System.out.println("\nSmallest Element in the Array : "+small);
	}

}
