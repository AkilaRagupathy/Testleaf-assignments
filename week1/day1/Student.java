package week1.day1;

public class Student {
	String studentname="Akila",collegename="Sastra";
	int rollno=2,markscored=75;
			
	float cgpa=7.6f;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Class report");
Student s=new Student();
System.out.println("Student name is  " +s.studentname);
System.out.println("college name is  "+s.collegename);
System.out.println("roll no is "+s.rollno);
System.out.println("markscored  "+s.markscored);
System.out.println("cgpa  "+s.cgpa);
	}

}
