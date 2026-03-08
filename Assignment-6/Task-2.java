package assignment6;

class Library{
	int memberID;
	String memberShipType;
	static int memberCount=501; 
	Library(){
		memberID=memberCount;
		memberShipType="Regular";
		memberCount++;
	}
	void display() {
		System.out.println("\nMember ID : "+memberID+"\nMember Ship Type : "+memberShipType);
	}
}

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l1=new Library();
		Library l2=new Library();
		Library l3=new Library();
		
		l1.display();
		l2.display();
		l3.display();

	}

}
