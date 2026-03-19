package pattern1;

import java.util.Scanner;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}


	}

}
