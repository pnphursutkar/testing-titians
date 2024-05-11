package upcasting_nonprimitive;

public class Execution {

	public static void main(String[] args) {
		
		Delhi d1= new Delhi(); // hello
		d1.test();
		
	
		
		Mumbai m1= new Mumbai(); // hiii
		m1.test();
		m1.demo();
		
		
		
		
		// casting
		
		Delhi d2= new Mumbai();
		System.out.println("*************");
		
		d2.demo();
		
		
	}
}
