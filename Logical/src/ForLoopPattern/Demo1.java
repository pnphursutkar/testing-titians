package ForLoopPattern;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int a[]= {20,40,30,60,70};// int
		Arrays.sort(a);
		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			System.out.print( a[i] + ",");
//		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print( a[i] + ",");
		}
		
//		int c;
//		int b[]= new int[5];
//		for(int i=0;i<=a.length;i++)
//		{
//		
//			if(a[i]>=c)
//				{
//				
//				b[i]=a[i];
//				
//					}
//			System.out.print("new array" +b[i] );
//		}
//		
//		;

	}

	}

