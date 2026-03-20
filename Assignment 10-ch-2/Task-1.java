package assignment11;

import java.util.Scanner;
abstract class Appliance{
	abstract boolean turnOn();
	abstract boolean turnOff();
	
}

class Fan extends Appliance{

	boolean turnOn() {
		System.out.println("Fan was Turn ON....");
		return true;
	}
	boolean turnOff() {
		System.out.println("Fan was Turn OFF....");
		return false;
		
	}
}
class WashingMachine extends Appliance{
	
	boolean turnOn() {
		System.out.println("Washing Machine was Turn ON....");
		return true;
	}
	boolean turnOff() {
		System.out.println("Washing Machine was Turn OFF....");
		return false;
	}
}

public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Appliance s;
		boolean state=true;
		boolean stateFan=false;
		boolean stateWashing=false;
		String fan="OFF";
		String washing="OFF";
		
		while(state) {
			System.out.println("\nHome Appliance controls \n1Fan["+fan+"]\n2.Washing Machine["+washing+"]\n3.exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				s=new Fan();
				if(stateFan) {
					stateFan=s.turnOff();
				    fan="OFF";
				}
				else {
					stateFan=s.turnOn();
					fan="ON";
				}
				break;
			case 2:
				s=new WashingMachine();
				if(stateWashing) {
					stateWashing=s.turnOff();
				    washing="OFF";
				}
				else {
					stateWashing=s.turnOn();
					washing="ON";
				}
				break;
			default:
				state=false;
				break;
			}
		}

	}

}
