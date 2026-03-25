package assignmentException;

import java.util.Scanner;

public class TryAndFinally {
	
	static int Checkdivision(int number1,int number2) {
		int num=0;
		try {
			num=number1/number2;
			return num;
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
		finally {
			return num;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        System.out.println("Enter the Division Number : ");
        int numDiv=sc.nextInt();
        if(Checkdivision(num,numDiv)==0) {
        	System.out.println("Retun form Finally");
        }
        else {
        	System.out.println("No Error\nRetun form try");
        }
        
	}

}
