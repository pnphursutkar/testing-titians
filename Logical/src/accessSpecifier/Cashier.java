package accessSpecifier;

public class Cashier extends Customer {

	
	public void demo1() // non static 
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println();

	}

}
