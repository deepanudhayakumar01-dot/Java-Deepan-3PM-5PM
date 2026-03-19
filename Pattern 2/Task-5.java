package pattern2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		int i=0;
		boolean state=true;
		
		while (i>=0 && i<number) {
			for(int j=0;j<number;j++) {
				if(j>=number-1-i) {
					if(j==number-1 || j==number-1-i)
					    System.out.print("* ");
					else
						System.out.print("  ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			
			if(state) {
				i++;
			}
			else
				i--;
			if(i==number-1)
				state=false;
		}

	}

}
