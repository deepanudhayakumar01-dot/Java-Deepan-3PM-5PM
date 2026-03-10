package assignment8;

class ShapeCalculator{
	int areas(int side) {
		return side*side;
	}
	int areas(int length,int width) {
		return width*length;
	}
	double areas(double radius) {
		return 3.14*(radius*radius);
	}
}

public class ShapeAreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCalculator square=new ShapeCalculator();
		ShapeCalculator rectangle=new ShapeCalculator();
		ShapeCalculator circle =new ShapeCalculator();
		
		System.out.println("square area is : "+square.areas(4));
		System.out.println("rectangle area is : "+rectangle.areas(4,7));
		System.out.println("circle area is : "+circle.areas(6.0));
		

	}

}
