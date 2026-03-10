package assignment8;

import java.util.Scanner;

class LoginSystem{
	String username;
	String password;
	String email;
	long mobileNumber;
	public LoginSystem(String username, String password, String email, long mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	
	boolean login(String uName,String pass) {
		if((username.equals(uName)||email.equals(uName))&&password.equals(pass)) {
			return false;
		}
		else {
			return true;
		}
	}
	boolean login(long number,int otp) {
		if(mobileNumber==number && otp==1256) {
			return false;
		}
		else {
			return true;
		}
	}
	
}

public class LoginAuthenticationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LoginSystem l1=new LoginSystem("Deepan","Deepan@123","deepanudhayakumar01@gmail.com",7868829011L);
		String name;
		String pass;
		String email;
		long phone;
		int otp;
		
		boolean state=true;
		int n;
		
		while(state) {
			System.out.println("Enter the your Choose of the Login...");
			System.out.println("\n1.User Name\n2.Email\n3.Phone");
			n=sc.nextInt();
			sc.nextLine();
			switch (n) {
			case 1:
				System.out.println("Enter the User Name : ");
				name=sc.nextLine();
				System.out.println("Enter the Password : ");
				pass=sc.nextLine();
				state=l1.login(name,pass);
				break;
			case 2:
				System.out.println("Enter the Email  : ");
				email=sc.nextLine();
				System.out.println("Enter the Password : ");
				pass=sc.nextLine();
				state=l1.login(email,pass);
				break;
			case 3:
				System.out.println("Enter the Phone Number : ");
				phone=sc.nextLong();
				System.out.println("Enter the OTP : ");
				otp=sc.nextInt();
				state=l1.login(phone, otp);
				break;
			default:
				break;
			}
			
			if(!state) {
				System.out.println("Login Successfull...");
			}
			else
				System.out.println("Login Invalid....");
				
		}

	}

}
