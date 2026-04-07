package mapSetAssignment;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map <Integer,String> emails=new HashMap<>();
		System.out.println("Enter the Size of emails list : ");
        int n=sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++) {
        	 System.out.println("Enter the "+(i+1)+" list of email id : ");
        	 String email=sc.nextLine();
        	 emails.put(i+1, email);
        }
        
       
        for(int i=0;i<emails.size();i++) {
        	for(int j=i+1+1;j<emails.size();j++) {
        		if(emails.get(i+1).equals(emails.get(j))) {
        			emails.remove(j);
        		}
        	}
        }
        System.out.println("Unique email IDs ");
        for(Map.Entry<Integer,String> entry:emails.entrySet()) {
			System.out.println("Email id : "+entry.getValue());
		}

	}

}
