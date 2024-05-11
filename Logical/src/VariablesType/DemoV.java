package VariablesType;

public class DemoV {
	
	DemoV()
	{
		int w=20;
		System.out.println("constructor value="+w);
	}
	
	
	DemoV(int x)
	{
		int w=20;
		System.out.println("parameterized constructor value="+x);
	}
	
	static int a=10; // Global variable---> class level
	       int b=20; //Global variable--> 
	       int d=65;// Global variable--->instance varibale
	       
	       
	       public static void demo2()
	       {
	    	   System.out.println("this is noj static method");
	       }
	       
	       public void test( int x)
	       {
	    	   DemoV d2= new DemoV();
	    	  demo2(); // direct call
	    	  DemoV.demo2(); //class.method name
	    	  d2.demo2(); // by creating object of class
	    	  
	    	   System.out.println(x);
	       }
	       
	public static void main(String[] args) {
		int c = 30; // local variable
		
		// TODO Auto-generated method stub
		DemoV d1= new DemoV(); // zero arg constructor
		DemoV d2= new DemoV(33); // paramerterized constructor
		System.out.println(a);
		System.out.println(d1.b);
		
		System.out.println(c);
			
	}
	
}


