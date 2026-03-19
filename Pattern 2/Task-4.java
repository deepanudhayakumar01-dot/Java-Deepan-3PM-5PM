package pattern2;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				if(j>=i && i<number ){
					if(i==0 && j<number-1)
						System.out.print("**");
					else if(i==j || j==number-1)
					    System.out.print("* ");
					else
						System.out.print("  ");
				}
				else 
					System.out.print(" ");
				
				}
			System.out.println();
			}
			

	}

}
