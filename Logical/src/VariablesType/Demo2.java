package VariablesType;

public class Demo2 {


	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,4,5,7,7,8,8,2};
	
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.println("duplicate numbers is" + a[j]);
				}
			}
		
		}
	}

}
