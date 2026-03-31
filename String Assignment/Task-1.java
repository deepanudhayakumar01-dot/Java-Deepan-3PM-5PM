package stringAssignment;
import java.util.*;

public class Task1 {
	
	public static boolean checkSubString(String a,String b) {
		for(char c : a.toCharArray()) {
			if(b.indexOf(c)==-1) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		System.out.println("Enter the 2 String : ");
		String t=sc.nextLine();
		
		String temp;
		String sub=s;
		
		for(int i=0;i<s.length()-t.length();i++) {
			for(int j=i+t.length();j<=s.length();j++) {
				
				if(checkSubString(t,(String)s.subSequence(i, j))) {
					temp=(String) s.subSequence(i, j);
					if(sub.length() > temp.length()) {
						sub=temp;
					}
					break;
				}
				if(j-i>sub.length()) {
					break;
				}
			}
			if(sub.length()==t.length()) {
				break;
			}
		}
		
		System.out.println(sub );

	}

}
