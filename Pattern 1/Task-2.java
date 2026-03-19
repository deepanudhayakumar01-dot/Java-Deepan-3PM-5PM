package pattern1;

import java.util.Scanner;

public class NumberTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				if(j>=number-1-i)
					System.out.print(i+1+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
