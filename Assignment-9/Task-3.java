package assignment9;

import java.util.Scanner;

interface SmartDevice{
	boolean turnOn();
	boolean  turnOff();
}
class Fan implements SmartDevice{
	public boolean  turnOn() {
		System.out.println("Fan turnOn");
		return true;
	}
	public boolean  turnOff() {
		System.out.println("Fan turnOff");
		return false;
	}
}
class Light implements SmartDevice{
	public boolean  turnOn() {
		System.out.println("Light turnOn");
		return true;
	}
	public boolean  turnOff() {
		System.out.println("Light turnOff");
		return false;
	}
}
class AirConditioner implements SmartDevice{
	public boolean  turnOn() {
		System.out.println("Air Conditioner turnOn");
		return true;
	}
	public boolean  turnOff() {
		System.out.println("Air Conditioner turnOff");
		return false;
	}
}

public class SmartHomeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SmartDevice s;
		boolean state=true;
		boolean stateFan=false;
		boolean stateLight=false;
		boolean stateAir=false;
		String fan="OFF";
		String light="OFF";
		String air="OFF";
		
		while(state) {
			System.out.println("\nsmart home system controls \n1Fan["+fan+"]\n2.Light["+light+"]\n3.Air Conditioner["+air+"]\n4.exit");
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
				s=new Light();
				if(stateLight) {
					stateLight=s.turnOff();
				    light="OFF";
				}
				else {
					stateLight=s.turnOn();
					light="ON";
				}
				break;
			case 3:
				s=new AirConditioner();
				if(stateAir) {
					stateAir=s.turnOff();
				    air="OFF";
				}
				else {
					stateAir=s.turnOn();
					air="ON";
				}
				break;
			default:
				state=false;
				break;
				
			}
		}

	}

}
