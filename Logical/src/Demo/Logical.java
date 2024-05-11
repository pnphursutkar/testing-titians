package Demo;

public class Logical {

	public static void main(String[] args) {
		int a=4;
		int b=3;
		int c=2;
		int d=1;

		if(a>b)
		      {
			if(a>c) {
				      if(a>d) 
				      { System.out.println("a is gratest number");}
			       }
		        }
		
		else if(b>c)
		   {
			if(b>d)
			    {System.out.println("b is gratest number");}
		   }
		
		else if(c>d)
		{
		    { System.out.println("c is gratest number");}
		
		    }
	else {
		System.out.println("d is greatest");
		
	     }
		
	}

}
