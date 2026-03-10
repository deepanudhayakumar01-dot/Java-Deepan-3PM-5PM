package assignment8;

class Employee{
	int empId;
	String empName;
	double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	void calculateBonus() {
		System.out.println("Employee Bonus : "+ salary*5 / 100);
	}
	
}

class Manager extends Employee{

	public Manager(int empId, String empName, double salary) {
		super(empId, empName, salary);
	}
	void calculateBonus() {
		System.out.println("Manager Bonus : "+ salary*20 / 100);
	}
	
}
class Developer extends Employee{

	public Developer(int empId, String empName, double salary) {
		super(empId, empName, salary);
	}
	void calculateBonus() {
		System.out.println("Developer Bonus : "+ salary*15 / 100);
	}
	
}
class Intern extends Employee{

	public Intern(int empId, String empName, double salary) {
		super(empId, empName, salary);
	}
	void calculateBonus() {
		System.out.println("Intern Bonus : "+ salary*10 / 100);
	}
}
public class EmployeeBonusSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1=new Manager(1,"Deepan",75000);
		Developer d1=new Developer(2,"Aadhavan",50000);
		Intern i1=new Intern(3,"Lithin",25000);
		
		m1.calculateBonus();
		d1.calculateBonus();
		i1.calculateBonus();
	}

}
