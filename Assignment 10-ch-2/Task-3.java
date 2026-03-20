package assignment11;

import java.util.Scanner;

abstract class Transport{
	abstract void bookTicket();
}
class Bus extends Transport{
	void bookTicket() {
		System.out.println("Your Bus Ticket has been Confirmed....");
	}
}
class Train extends Transport{
	void bookTicket() {
		System.out.println("Your Train Ticket has been Confirmed....");
	}
}

public class Travels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Transport t;
		boolean state=true;
		while(state) {
			System.out.println("\nWelcome to DP Travels....\nChoose your Transport Mode \n1.Bus\n2.Train \n3.Exit[If you like to exit]");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				t=new Bus();
				t.bookTicket();
				break;
			case 2:
				t=new Train();
				t.bookTicket();
				break;
				default:
					state =false;
					break;
			}
			
		}
	}

}
