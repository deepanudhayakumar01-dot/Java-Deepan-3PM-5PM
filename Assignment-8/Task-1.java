package assignment8;

class Payment{
	void processPayment() {
		System.out.println("Payment Done!!");
	}
}

class  CreditCardPayment extends Payment{
	void processPayment() {
		System.out.println("Payment Done with Credit Card !");
	}
}
class DebitCardPayment extends Payment{
	void processPayment() {
		System.out.println("Payment Done with Debit Card !");
	}
}
class UPIPayment extends Payment{
	void processPayment() {
		System.out.println("Payment Done with UPI Mode!");
	}
}

public class OnlinePaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardPayment c =new CreditCardPayment();
		DebitCardPayment d =new DebitCardPayment();
		UPIPayment u=new UPIPayment();
		c.processPayment();
		d.processPayment();
		u.processPayment();

	}

}
