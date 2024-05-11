package VariablesType;

public class FebbonaccieSerice {

	public static void main(String[] args) {
		//[0,1,1,2,3,5,8]
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		
//		for(int i=0;i<5;i++)
//		{
			for(int j=2;j<=5;j++)
			{
				sum= a + b;
				a=b;
				b=sum;
				
				System.out.println(+sum);
				
			}
			
//		}
	
		
	
	}

}
