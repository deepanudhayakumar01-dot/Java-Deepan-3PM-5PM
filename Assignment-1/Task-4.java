package javaAssignment;
import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Stock : ");
	    int stock =sc.nextInt();
	    int total=0;
	    
	    if(stock>0) {
	    	total=stock;
	 
	    }
	    System.out.println("available stock : "+total);
		

	}

}
