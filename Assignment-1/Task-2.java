package javaAssignment;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mark : ");
		int mark = sc.nextInt();
		String grade="";
		
		if(mark>100) {
			grade = "Enter the valid Mark";
		}
		else if(mark>=90) {
			grade="your Grade is A";
		}
		else if(mark>=80) {
			grade="your Grade is B";
		}
		else if(mark>=70) {
			grade="your Grade is C";
		}
		else if(mark>=60) {
			grade="your Grade is D";
		}
		else {
			grade="your Grade is E";
		}
		
		System.out.println(grade);

	}

}
