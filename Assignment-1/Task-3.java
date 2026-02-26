package javaAssignment;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String userName="Admin";
		String userPassword="De123";
		System.out.println("Enter the User Name : ");
		String inputName=sc.nextLine();
		System.out.println("Enter the Password : ");
		String inputPassword=sc.nextLine();

		String status;
		
		if( userName.equals(inputName) ) {
			if(userPassword.equals(inputPassword))
			    status ="Login Successful";
			else {
				status ="Please Enter the vilde Password";
			}
		}
		else {
			status ="Please Enter the vilde User Name";
		}
		
		System.out.println(status);
		
	}

}
