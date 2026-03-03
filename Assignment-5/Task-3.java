package assignment5;

class StudentInfo{
	int rollNo;
	String name;
	int mark1;
	int mark2;
	int mark3;
	
	int total() {
		
		return mark1+mark2+mark3;
	}
	int average() {
		return (mark1+mark2+mark3)/3;
	}
	
	String grade() {
		String g;
		int avg=average();
		if(avg >= 80)
			g="A";
		else if(avg >=60)
			g="B";
		else if(avg >= 40)
			g="C";
	    else
	    	g="Fail";
				
		return g;
	}
	
	void display() {
		System.out.println("\nStudent Name : "+name+" Totel is : "+total()+" Average : "+average()+" Grade : "+grade());
	}
	

}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s1=new StudentInfo();
		StudentInfo s2=new StudentInfo();
		StudentInfo s3=new StudentInfo();
		StudentInfo s4=new StudentInfo();
		StudentInfo s5=new StudentInfo();
		
		s1.rollNo=1;
		s1.name="Deepan";
		s1.mark1=95;
		s1.mark2=89;
		s1.mark3=75;
		
		s2.rollNo=2;
		s2.name="Surender";
		s2.mark1=75;
		s2.mark2=99;
		s2.mark3=85;
		
		s3.rollNo=3;
		s3.name="Abdulla";
		s3.mark1=91;
		s3.mark2=96;
		s3.mark3=89;
		
		s4.rollNo=4;
		s4.name="Aadhavan";
		s4.mark1=85;
		s4.mark2=56;
		s4.mark3=41;
		
		s5.rollNo=5;
		s5.name="Lithn";
		s5.mark1=45;
		s5.mark2=59;
		s5.mark3=65;
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();

	}

}
