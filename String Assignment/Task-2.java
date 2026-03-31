package stringAssignment;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		String output ="";
		output+=s.charAt(0);
		int count =1;
		
		for(int i=1;i<s.length();i++) {
			if(output.charAt(output.length()-1)==s.charAt(i)) {
				count++;
			}
			else {
				output+=String.valueOf(count);
				output+=s.charAt(i);
				count=1;
			}
		}
		output+=String.valueOf(count);
		System.out.println(output);

	}

}
