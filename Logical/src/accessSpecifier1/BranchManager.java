package accessSpecifier1;

import accessSpecifier.Customer;

public class BranchManager extends Customer {
	
	
	
	
	public static void main(String[] args) {
		Customer c1= new Customer();
		BranchManager bm = new BranchManager(); // if we want to call nonstatic varibale into
		                                        //outside package then we need to extend that 
		                                        //class and we need to create child class object and by using
												//that child class object we can call protected variable
		System.out.println(c1.name);
		System.out.println(bm.address);
		
		
		//trying to call static variables
		
		System.out.println(accountType);
		//System.out.println(ammount); //----> this varibale is defined as private hence having scope only within a class
		System.out.println(ifsc);
		//System.out.println(branchName);   //---> default so it will call in only same class and same pacakage
		
		
		
		
		
	}

}
