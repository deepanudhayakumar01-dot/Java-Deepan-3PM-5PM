package assignment2;

import java.util.Scanner;

public class EmployeeSalarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		EmployeeDetails e1=new EmployeeDetails();
		EmployeeDetails e2=new EmployeeDetails();
		
		e1.setEmployeeDetail(1,"Deepan Udhayakumar", 50000);
		e2.setEmployeeDetail(2,"Surender ", 40000);
		
		System.out.println("Enter the Employee 1 Bonus percentage : ");
		double b1=sc.nextDouble();
		e1.setBonus(b1);
		System.out.println("Enter the Employee 2 Bonus percentage : ");
		double b2=sc.nextDouble();
		e2.setBonus(b2);
		
		
		e1.displayEmployeeDetails();
		e2.displayEmployeeDetails();
		
		

	}

}
class EmployeeDetails{
	int employeeId;
	String employeeName;
	double basicSalary;
	
	public void setEmployeeDetail(int id, String name,double salary ) {
		employeeId = id;
		employeeName =name;
		basicSalary=salary;
	}
	public void setBonus(double percentage) {
		basicSalary=basicSalary+(basicSalary*percentage)/100;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("\nEmployee ID   : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Salary        : "+basicSalary);
	}
}
