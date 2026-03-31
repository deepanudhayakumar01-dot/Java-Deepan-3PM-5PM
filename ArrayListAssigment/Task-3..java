package arrayListAssigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

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
        System.out.println("Enter the k : ");
        int k=sc.nextInt();
        
        for(int i=0;i<k;i++) {
        	int last=list.removeLast();
        	list.add(0,last);
        }
        System.out.println(list);
	}

}
