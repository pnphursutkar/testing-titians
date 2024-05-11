package testConstroctor;

public class DemoStaticNonStatic {

	int a=10;  // non static
	static int b=20; // class level  single copy
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DemoStaticNonStatic de = new DemoStaticNonStatic();
//        System.out.println(de.a);
      de.a=20;
        System.out.println(de.a);
        
        System.out.println(b);
        b=30;
        System.out.println(b);
        
        System.out.println(de.b);
        
        
        DemoStaticNonStatic de2 = new DemoStaticNonStatic();
        System.out.println("checking for next object"+de2.b);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        //if we want to call static variable in static method then
//        
//        //1 direct call
//        System.out.println(b);
//        //2 object call
//        System.out.println(de.b);
//        //3 with class name
//        System.out.println(DemoStaticNonStatic.b);
        
	}

}
