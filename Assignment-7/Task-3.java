package assignment7;

class Student{
	int studentId;
	String studentName;
    int marks;
    public Student(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
    String calculateGrade() {
    	if(marks >= 90)
    		return "A";
    	else if(marks >= 75) 
    		return "B";
    	else if(marks >= 50)
    		return "C";
    	else
    		return "Fail";
    	
    }
    
    void gradeDisplay() {
    	System.out.println("\n Student Name : "+studentName+" Student Grade : "+calculateGrade());
    }
}

public class StudentGradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Aadhavan",87);
		Student s2=new Student(2,"Lithin",95);
		
		s1.gradeDisplay();
		s2.gradeDisplay();

	}

}
