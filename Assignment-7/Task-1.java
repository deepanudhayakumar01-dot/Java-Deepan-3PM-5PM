package assignment7;
class Employee{
	int empId;
	String empName;
	double salary;
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	void display () {
		System.out.println("\nEmployee ID  : "+empId+"\nEmployee Name : "+empName+"\nEmployee salary : "+salary);
	}
}

public class EmployeeSalaryInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Deepan",50000);
		Employee e2=new Employee(2,"Aadhavan",40000);
		Employee e3=new Employee(3,"Lithin",30000);
		
		e1.display();
		e2.display();
		e3.display();

	}

}
