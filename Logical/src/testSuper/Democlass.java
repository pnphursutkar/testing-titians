package testSuper;

public class Democlass extends Democlass2 {

	static int a= 10; // global static
	int b=20;         ///global non-static
	
	public static void m2()
	{
		int a=30;   // Local variabale
		int b= 40;    // Local variabale
		System.out.println(a);
		System.out.println(b);
		System.out.println(Democlass.a);
		Democlass d1= new Democlass();
		System.out.println(d1.b);
		
		//System.out.println(super.k);  // we cant call static as well non static varibale 
		                              //from super class by using super keyword  
		System.out.println(Democlass2.k);
	}
	
	// this and super keyword is applicable in side on to Nonstatic method
	// in non static method we can call static and non static variable with the 
	//help oh "Super and This " Keyword
	public void m1()
	{
		int a= 60;
		int b= 70;
		
		System.out.println(this.b);
		System.out.println(this.a);
		System.out.println(super.k);
		System.out.println(super.l);
		System.out.println(Democlass2.k);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
