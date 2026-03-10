package assignment8;

import java.util.Scanner;

class Transport{
	void calculateFare(double kilometer) {
		System.out.println("Fare Fees for Transport : "+kilometer*25 );
	}
}
class Bus extends Transport{
	void calculateFare(double kilometer) {
		System.out.println("Fare Fees for Bus Transport : "+kilometer*6 );
	}
}
class Train extends Transport{
	void calculateFare(double kilometer) {
		System.out.println("Fare Fees for Train Transport : "+kilometer*4 );
	}
}
class Taxi extends Transport{
	void calculateFare(double kilometer) {
		System.out.println("Fare Fees for Train Transport : "+kilometer*40 );
	}
}


public class TransportFareSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bus b1=new Bus();
		Train t1=new Train();
		Taxi t=new Taxi();
		int n;
		System.out.println("Enter the your Choose of the Transport...");
		System.out.println("\n1.Bus\n2.Train\n3.Taxi");
		n=sc.nextInt();
		double km;
		
		switch(n) {
		case 1:
			System.out.println("Enter the Kilometer : ");
			km=sc.nextDouble();
			b1.calculateFare(km);
			break;
		case 2:
			System.out.println("Enter the Kilometer : ");
			km=sc.nextDouble();
			t1.calculateFare(km);
			break;
		case 3:
			System.out.println("Enter the Kilometer : ");
			km=sc.nextDouble();
			t.calculateFare(km);
			break;
		default:
			break;
		}
		

	}

}
