package mapSetAssignment;
import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,Double> emp=new HashMap<>();
		emp.put(3,5000.0);
		emp.put(1,7000.0);
		emp.put(2,9000.0);
		boolean state = true;
		
		while(state) {
			System.out.println("Enter the option\n1.view the Employee Salary\n2.Update Employee Salary\n3.Exit");
			int op=sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter the id : ");
				int n=sc.nextInt();
				Double salary =emp.get(n);
				if(salary != null) {
				System.out.println("Employee Salary : "+emp.get(n));
				}
				else
					System.out.println("Employee ID not found");
				break;
			case 2 :
				   System.out.println("Enter the id : ");
				   n=sc.nextInt();
				   salary =emp.get(n);
				if(salary != null) {
					System.out.println("Enter the Update salary : ");
					double am=sc.nextDouble();
					emp.put(n, am);
					}
					else
						System.out.println("Employee ID not found");
					break;
			default :
				    state = false;
					break;
				
			}
		}
		
		System.out.println(emp);

	}

}
