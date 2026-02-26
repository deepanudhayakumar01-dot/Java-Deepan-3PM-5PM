package javaAssignment;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mark : ");
		int mark = sc.nextInt();
		
		if(mark>100) {
			System.out.println("Enter the valid Mark");
		}
		else if(mark>=90) {
			System.out.println("your Grade is A");
		}
		else if(mark>=80) {
			System.out.println("your Grade is B");
		}
		else if(mark>=70) {
			System.out.println("your Grade is c");
		}
		else if(mark>=60) {
			System.out.println("your Grade is D");
		}
		else {
			System.out.println("your Grade is E");
		}

	}

}
