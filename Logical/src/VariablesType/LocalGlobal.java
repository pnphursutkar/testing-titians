package VariablesType;

public class LocalGlobal {

	int x=10;        // Global--> instance variable/Object variable
	static int y=20; // Global---> class level
	
	
	
	
	
	
	public void demo()
	{
		int z=30;  // local variable
		
		System.out.println(x);
		System.out.println(z);
	}
	
	public static void demo2()
	{
		System.out.println(x);
		System.out.println(z);
	}
	
	
	public static void demo3()
	{
		LocalGlobal d1= new LocalGlobal();
		int g=60;
		int f=34;
		System.out.println(g);
		
		demo2();
		d1.demo();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalGlobal d1= new LocalGlobal();
System.out.println(d1.z);
System.out.println(d1.x);
System.out.println();
   demo3();



	}

}
