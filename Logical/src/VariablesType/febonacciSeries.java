package VariablesType;

public class febonacciSeries {

	public static void main(String[] args) {
		
		//[0,1,1,2,3,5,8,13,]
		int a=0;
		int b=1;
		System.out.print(a+","+b+",");
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum= a+b;
			System.out.print(sum+",");
			a=b;
			b=sum;
		}
		
		
		//0,1,1,2,3,5,8,13,21,34,55,
	}

}
