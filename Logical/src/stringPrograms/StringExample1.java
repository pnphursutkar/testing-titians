package stringPrograms;

import gettersetterMothods.Student;

public class StringExample1 extends Student {
	
	
	
	public static void main(String[] args) {
		
		
		StringExample1 s12= new StringExample1();
		s12.setPassword(101);
		System.out.println(s12.getPassword());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// two way to define string Object
		
		String s1="velocity";
		
		
		String s2="velocity";
		
		
		
		
		String s3= new String("Velocity");
		
		String s4= new String("Velocity");
		
		
		System.out.println(s1==s2);// true
		System.out.println(s3==s4);// false
		System.out.println(s1==s3);// false
		System.out.println(s2==s4);// false
		
		
		
		
		
		
		
		

	}

}
