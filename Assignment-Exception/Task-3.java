package assignmentException;

import java.util.Scanner;

class InvalidException extends Exception {

	public InvalidException(String message) {
		super(message);
	}
	
}

class StudentDetails{
	String name;
	int mark;
	public String getName() {
		return name;
	}
     void setName  (String name)throws InvalidException {
		if(name==null || name.isBlank()) {
			throw new InvalidException("Name don't be Emty ");
		}
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark)throws InvalidException {
		if(mark < 0 ||  mark > 100) {
			throw new InvalidException("Mark must above 0 & below 101");
		}
		this.mark = mark;
	}
}

public class StudentGradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentDetails s1=new StudentDetails();
		System.out.println("Enter the Student's name : ");
		String name=sc.nextLine();
		System.out.println("Enter the Mark : ");
		int mark=sc.nextInt();
		
		try {
			try {
			s1.setName(name);
			}catch(InvalidException e) {
				System.out.println("Error : "+e.getMessage());
			}
			s1.setMark(mark);
			
		}catch (InvalidException e) {
			System.out.println("Error : "+e.getMessage());
		}
		finally {
			System.out.println("Process Completed..");
		}
		

	}

}
