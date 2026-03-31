package arrayListAssigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {

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
        
        int first=list.get(0);
        int sec=list.get(1);
        for(int i=1;i<list.size();i++) {
        	if(list.get(i) < first) {
        		sec=first;
        		first=list.get(i);
        	}
        	else if(list.get(i) < sec) {
        		sec=list.get(i);
        	}
        }
        if(first > sec) {
        	sec = first;
        }
        System.out.println(sec);
	}

}
