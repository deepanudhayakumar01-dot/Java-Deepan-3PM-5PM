package pattern2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		
		for(int i=0;i<number*2;i++) {
			for(int j=0;j<number*2;j++) {
				if((j<number-i || j>=number+i) && i<number)
				    System.out.print("* ");
				else if(j<=i-number || j>= (number*2)-(i-number+1))
					System.out.print("* ");
				else
					System.out.print("  ");
				}
			System.out.println();
			}
			
	}

}
