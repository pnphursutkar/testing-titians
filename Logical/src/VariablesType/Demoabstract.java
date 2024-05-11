package VariablesType;

public class Demoabstract  extends Demo123{

	@Override
	void m1() {
		System.out.println("this is an abstract method implementated ");
		
	}

	public static void main(String[] args) {
		
		Demo123 d1= new Demoabstract();
		d1.m1();
		d1.m2();
	}
	

}
