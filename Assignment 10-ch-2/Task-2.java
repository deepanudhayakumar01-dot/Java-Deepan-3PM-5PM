package assignment11;

import java.util.Scanner;

abstract class Food {
	abstract void prepare();
}

class Pizza extends Food{
	void prepare() {
		System.out.println("Your pizza is ready to eat....");
	}
}
class Burger extends Food{
void prepare() {
	System.out.println("Your Burger is ready to eat....");
	}
}
public class SmallHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Food f;
		boolean state=true;
		
		while(state) {
			System.out.println("\nWelcome to DP Hotel....\nwhat like to eat \n1.Pizza\n2.Burger \n3.Exit[If you like to exit]");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				f=new Pizza();
				f.prepare();
				break;
			case 2:
				f=new Burger();
				f.prepare();
				break;
			default:
				state=false;
				break;
			}
		}
	

	}

}
