package arrayListAssigment;

import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        List<String> out=new ArrayList<>();
        
        System.out.println("Enter the Size of list : ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	 System.out.println("Enter the "+(i+1)+" list element: ");
        	 int m=sc.nextInt();
        	 list.add(m);
        }
        int index=0;
        int count =1;
        Collections.sort(list);
        for(int i=1;i<list.size();i++) {
        	if(list.get(index)==list.get(i)) {
        		count++;
        	}
        	else {
        		String s=String.valueOf(list.get(index)+"->"+count);
        		out.add(s);
        		count=1;
        		index=i;
        	}
        }
        String s=String.valueOf(list.get(index)+"->"+count);
		out.add(s);
        System.out.println(out);

	}

}
