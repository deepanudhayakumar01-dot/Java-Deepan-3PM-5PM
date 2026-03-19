package pattern1;

import java.util.Scanner;

public class NumberChangingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		int temp=1;
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(temp++ +" ");
			}
			System.out.println();
		}



	}

}
