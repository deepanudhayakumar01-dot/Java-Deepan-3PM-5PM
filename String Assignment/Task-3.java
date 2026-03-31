package stringAssignment;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		String output ="";
		
		for(int i=s.length()-1;i>=0;i--) {
			output+=s.charAt(i);
		}
		
		System.out.println(output);

	}

}
