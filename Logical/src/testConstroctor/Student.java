package testConstroctor;

public class Student {

	int rollno;
	String name;
	String address;
	
	//methods
	 public void demo()
	 {
		 
	 }
	//constructor
	 Student()
	 {
		 
	 }
	//varibales
	 int a;
	 
	 
	//blocks
	 
	 {
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rollno=1;
		s1.name="Ram";
		s1.address="Pune";
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.address);
		
		Student s2 = new Student();
		s2.rollno=2;
		s2.name="sham";
		s2.address="Akola";
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println(s2.address);
		
	}

}
