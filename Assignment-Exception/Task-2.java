package assignmentException;

import java.util.Scanner;

class InvalidException extends Exception{

	public InvalidException(String message) {
		super(message);
	}
	
}

class UserDetails{
	String userName;
	String UserPassword;
	int count;
	public UserDetails(String userName, String userPassword, int count) {
		this.userName = userName;
		this.UserPassword = userPassword;
		this.count = count;
	}
	
	boolean login(String name,String password) throws InvalidException {
		
		if(count==2) {
			throw new InvalidException("Retest your Login...");
		}
		
		if(userName.equals(name)){
			if(UserPassword.equals(password)) {
				System.out.println("Login Successfull....");
				return false;
			}
			else {
				count++;
				throw new InvalidException("Invalid Password..");
			}
		}
		else {
			count++;
			throw new InvalidException("Invalid User Name..");
		}
	}

}

public class LoginSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		UserDetails u1=new UserDetails("Deepan","deepan@123",0);
		
		boolean state=true;
		while(state) {
			System.out.println("Enter the User Name : ");
			String name=sc.nextLine();
			System.out.println("Enter the Password : ");
			String password=sc.nextLine();
		try {
			 state=u1.login(name, password);
		}
		catch (InvalidException e) {
			   System.out.println("Error : "+e.getMessage());
			}
		if(u1.count==3) {
			state=false;
		}
		}
	}

}
