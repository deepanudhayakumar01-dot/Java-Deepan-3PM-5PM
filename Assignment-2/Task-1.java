package assignment2;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		StudentDetail s1=new StudentDetail();
		StudentDetail s2=new StudentDetail();
		s1.setSudent("Deepan", 1);
		s2.setSudent("Surender", 2);
		s1.displayStudentDetails(75,68);
		s2.displayStudentDetails(85,74);
	}

}

class StudentDetail{
	String studentName; // instance variables 
	int rollNumber; // instance variables 
	
	public void setSudent(String name ,int number) {
		studentName=name;
		rollNumber=number;
	}
	
	public int totalMarks(int sub1,int sub2) {
		int total=0; // local variables 
		total =sub1+sub2;
		return total;
	}
	public void displayStudentDetails(int mark1, int mark2) {
        System.out.println("\nStudent Details : ");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Roll Number : " + rollNumber);
        System.out.println("Subject 1 Mark : " + mark1);
        System.out.println("Subject 2 Mark : " + mark2);
        System.out.println("Total Mark : " + totalMarks(mark1, mark2));
    }
}
