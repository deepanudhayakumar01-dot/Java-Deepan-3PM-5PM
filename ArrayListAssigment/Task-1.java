package arrayListAssigment;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.println("Enter the Size of list : ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	 System.out.println("Enter the "+(i+1)+" list element: ");
        	 int m=sc.nextInt();
        	 list.add(m);
        }
        System.out.println("Enter the Element for Removing : ");
        int element=sc.nextInt();
        for(int i =0 ; i<list.size();i++) {
        	if(list.get(i)==element) {
        		list.remove(i);
        	}
        }
        System.out.println(list);
	}

}
