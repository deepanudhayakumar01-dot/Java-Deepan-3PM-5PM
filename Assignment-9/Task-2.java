package assignment9;

import java.util.Scanner;

interface Vehicle{
	void startEngine();
	void stopEngine();
}
class Car implements Vehicle{
	public void startEngine() {
		System.out.println("Car start Engine");
	}
	public void stopEngine() {
		System.out.println("Car Engine stoped");
	}
}
class Bike implements Vehicle{
	public void startEngine() {
		System.out.println("Bike start Engine");
	}
	public void stopEngine() {
		System.out.println("Bike Engine stoped");
	}
}
class Truck implements Vehicle{
	public void startEngine() {
		System.out.println("Truck start Engine");
	}
	public void stopEngine() {
		System.out.println("Truck Engine stoped");
	}
}

public class TransportationCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vehicle v;
		boolean state=true;
		while(state) {
		System.out.println("Enter the vehicle type...\n1.Car\n2.Bike\n3.Trck\n4.exit");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			v=new Car();
			v.startEngine();
			System.out.println("Take for test drive...");
			v.stopEngine();
			break;
		case 2:
			v=new Bike();
			v.startEngine();
			System.out.println("Take for test drive...");
			v.stopEngine();
			break;
		case 3:
			v=new Truck();
			v.startEngine();
			System.out.println("Take for test drive...");
			v.stopEngine();
			break;
		default :
				state=false;
				break;
		}
		}
		

	}

}
