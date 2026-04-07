package mapSetAssignment;
import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map <Character,Integer> out=new HashMap<>();
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		int pos =0;
		int count=1;
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(pos)==s.charAt(i)) {
				count++;
			}
			else {
				out.put(s.charAt(pos), count);
				pos=i;
				count=1;
			}
		}
		out.put(s.charAt(pos), count);
		System.out.println(out);
	}

}
