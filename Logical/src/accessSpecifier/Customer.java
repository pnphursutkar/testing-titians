package accessSpecifier;

public class Customer {

	// non static
	       int acctNo=1233;;
	public String name="Ram";
	private int mobNo= 123456789;
	protected String address="pune";
	
	// static
	public static String accountType="Savings";
	private static int ammount=10000;
	protected static int ifsc=00110022;
	    static String branchName="Camp"; // within the class 
	
	    
	    public void demo()
	    {
	    	System.out.println(acctNo);
	    	
	    }
	    
	    
	    
	
	public static void main(String[] args) {
		Customer c1=new Customer();
		
System.out.println(c1.acctNo);
	}

}
