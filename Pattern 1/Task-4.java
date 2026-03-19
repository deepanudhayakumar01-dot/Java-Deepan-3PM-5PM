package pattern1;

import java.util.Scanner;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=number;j>i;j--) {
				System.out.print(number-j+1+" ");
			}
			System.out.println();
		}



	}

}
