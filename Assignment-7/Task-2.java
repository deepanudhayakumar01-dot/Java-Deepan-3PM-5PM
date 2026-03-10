package assignment7;

class Product{
	int productId;
	String productName;
	double price;
	double quantity;
	
	public Product(int productId, String productName, double price, double quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	double calculateTotalPrice() {
		return price * quantity;
	}
}

public class ProductPriceCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1,"Brioni",2500,2);
		Product p2=new Product(2,"Tom Ford",3400,1);
		
		System.out.println("Total Cash for "+p1.productName +" : "+p1.calculateTotalPrice());
		System.out.println("Total Cash for "+p2.productName +" : "+p2.calculateTotalPrice());

	}

}
