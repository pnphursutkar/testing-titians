package testChainingConcept;

public class Pune {

	Pune()
	{
		System.out.println("this cons from Pune");
	}
	
	
	public static void main(String[] args) {
		Mumbai m1= new Mumbai();
		new Pune();

	}

}
