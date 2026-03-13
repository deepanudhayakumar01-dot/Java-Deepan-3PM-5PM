package assignment9;

import java.util.Scanner;

interface Payment{
	
	void processPayment(double amount);
}
class CreditCardPayment implements Payment{
	public void processPayment(double amount) {
		System.out.println(amount+" Payment Process through Credit Card");
	}
}
class UPIPayment implements Payment{
	public void processPayment(double amount) {
		System.out.println(amount+" Payment Process through UPI");
	}
}
class PayPalPayment implements Payment{
	public void processPayment(double amount) {
		System.out.println(amount+" Payment Process through Pay Pal");
	}
}

class Products {
	int productId;
	String productName;
	double productAmount;
	public Products(int productId,String productName, double productAmount) {
		this.productId=productId;
		this.productName = productName;
		this.productAmount = productAmount;
	}
	
	void display() {
		System.out.println("\nproduct Id : "+productId+" product Name : "+productName+" product Amount : "+productAmount);
	}
	
	double getProductAmount() {		
			return productAmount;
	}
	int getProductId() {
		return productId;
	}
	
}

public class PaymentFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Products [] product=new Products[3];
		product[0]=new Products(1,"Pen",10);
		product[1]=new Products(2,"Book",100);
		product[2]=new Products(3,"Note",25);
		
		Payment p1=new CreditCardPayment();
		Payment p2=new UPIPayment();
		Payment p3=new PayPalPayment();
		
		double amount = 0;
		boolean state=true;
		
		while(state) {
		
		for (int i=0;i<3;i++) {
			product[i].display();
		}
		System.out.println("\nEnter the product Id for Add to your cart : ");
		int id=sc.nextInt();
		System.out.println("\nEnter Quaqntity : ");
	    int q=sc.nextInt();
		for (int i=0;i<product.length;i++) {
			if(product[i].getProductId()==id) {
				amount +=product[i].getProductAmount()*q;
				break;
			}
		}
		
		int n=1;
        
		if(amount!=0) {
			System.out.println("Total amount : "+amount);
		}
		System.out.println("If want to continue purchase \n1.yes 2.No ");
		n=sc.nextInt();
		
		if(n==2) {
			state =false;
			System.out.println("Enter the your Payment Mode\n1.Credit Card\n2.UPI \n3.PayPal");
			int pay=sc.nextInt();
			switch (pay) {
			case 1:
				p1.processPayment(amount);
				break;
			case 2:
				p2.processPayment(amount);
				break;
			case 3:
				p3.processPayment(amount);
				break;
			default:
					break;
			}
		}
		}

	}

}
