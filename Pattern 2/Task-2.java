package pattern2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || i==j || i==number-1)
				    System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
			

	}

}
