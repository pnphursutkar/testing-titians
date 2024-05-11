package this_SuperKey_word;

public class Democlass {
 
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
	}
	
	public void m1()
	{
		int a= 60;
		int b= 70;
		
		System.out.println(this.b);
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		
		Democlass.m2();
		
		Democlass d2= new Democlass();
		d2.m1();
		d2.a=99;
		System.out.println(Democlass.a);
		
		
		
		

	}

}
