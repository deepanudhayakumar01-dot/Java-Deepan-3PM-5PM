package assignment6;

class Employee{
	int EmployeeID;
	String EmployeeName;
	Employee(){
		EmployeeID=100;
		EmployeeName="Not Assigned";
	}
	Employee(int id,String name){
		this.EmployeeID=id;
		this.EmployeeName=name;
	}
	
	void display() {
		System.out.println("\nEmployee ID : "+EmployeeID+"\nEmployee Name : "+EmployeeName);
	}
}


public class CompanySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee(1,"Deepan");
		
		e1.display();
		e2.display();

	}

}
