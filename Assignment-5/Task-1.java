package assignment5;

class EmployeeDetails{
	int empId;
	String empName;
	double basicSalary;
	
	void grossSalary() {
		double hra= basicSalary * 20 /100;
		double da= basicSalary * 10 /100;
		double gross=basicSalary +hra+da;
		if(basicSalary>50000) {
			gross += basicSalary*5 /100;
		}
		System.out.println("\nEmployee "+empName+" Gross Salary is "+gross);
		
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails e1=new EmployeeDetails();
		EmployeeDetails e2=new EmployeeDetails();
		EmployeeDetails e3=new EmployeeDetails();
		
		e1.empId=1;
		e1.empName="Deepan ";
		e1.basicSalary=45000;
		
		e2.empId=2;
		e2.empName="Surender";
		e2.basicSalary=54000;
		
		e3.empId=2;
		e3.empName="Abdhulla";
		e3.basicSalary=60000;
		
		e1.grossSalary();
		e2.grossSalary();
		e3.grossSalary();
		

	}

}
