package DemoInheritance;

public class DemoInheitance {

	public void demo()
	{
		System.out.println("hello");
	}
	
	public class Demo2 extends DemoInheitance{
		
		
		public void test()
		{
			System.out.println("test demo");
		}	
	}
	
	public static void main(String[] args) {
		DemoInheitance d1= new DemoInheitance();
		d1.demo();
		
		
		Demo2 d2=  (Demo2) new DemoInheitance() ;
		d2.test();
		
	}

}
