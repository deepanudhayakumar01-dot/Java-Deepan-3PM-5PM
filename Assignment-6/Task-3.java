package assignment6;

class Mobile{
	String model;
	double price;
	
	Mobile(){
		model="Samsung";
		price=20000;
	}
	void display () {
		System.out.println("\nModel Name : "+model+"\nPrice : "+price);
	}
}


public class MobileShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m1=new Mobile();
		m1.display();

	}

}
