package mapSetAssignment;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		HashSet<Integer> out = new HashSet<>();
		System.out.println("Enter the N : ");
		int n=sc.nextInt();
		System.out.println("Enter the arry size : ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+(i+1)+" number : ");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i+1)==arr[j]) {
					break;
				}
				if(j==arr.length-1)
					out.add(i+1);
				
			}
		}
		System.out.println(out);

	}

}
