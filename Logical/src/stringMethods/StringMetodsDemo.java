package stringMethods;

public class StringMetodsDemo {

	
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String v1= "              Velocity Batch testing pune 2023 batch class batch      ";
//		          //01234567
//		
//		String v2= "   Velocity";
//		
//		String v3= new String("Velocity");
//		
//		String v4= new String("Velocity");
//		
//		// charAt method
//	char x=	v1.charAt(1);
//	System.out.println(x);
//	
//	   // string lenth method   lenght statrt from 1 and index start from 0
//	int a=v1.length();
//	System.out.println(a);
//		
//		// index of method
//	 a = v2.indexOf('c');
//	 System.out.println(a);
//	 
//	 
//	    // index of sub string
//	   a= v1.indexOf("batch");
//	   System.out.println(a);   // case sensative
//	   
//	   
//	   //last index of char
//	   
//	    a=v1.lastIndexOf('h');
//	    System.out.println(a);
//	    
//	    System.out.println("------------------------------------------");
//	    // split method
//	    char g[]=v1.toCharArray();
//	    
//	    for(int i=0;i<g.length;i++)
//	    {
//	    	System.out.println(g[i]);
//	    }
//	    System.out.println("------------------------------------------");
//	    //contains
//	    
//	    boolean s1= v1.contains("pune");
//	    System.out.println(s1);
//	    System.out.println("------------------------------------------");
//	    
//	    // trim method
//	    
//	    String v=v1.trim();
//	    System.out.println(v1);
//	    System.out.println(v2);
//	    System.out.println("------------------------------------------");
//	    
//	    
//	   //slipt method
//	    String d[]=v1.split(" ");
//	    for(int i=0;i<d.length;i++)
//	    {
//	    	System.out.println(d[i]);
//	    }
//	    System.out.println("------------------------------------------");
//	    
//	    //suffix starts and ends with
//	    boolean d1=v2.endsWith("ocity");
//	    System.out.println(d1);
//	    System.out.println("------------------------------------------");
//	    
//	    //concat method
//	    
//	    String p1="Prajyot";
//	    String p5="Prajyot";
//	    String p2="Phursutkar";
//	   
//	    System.out.println("#################################################");
//	    boolean w =p1.equals(p2);
//	    
//	    System.out.println(w);
//	    
//	    System.out.println("#################################################");
//        boolean w1 =p1.equals(p5);
//	    
//	    System.out.println("hgga"+w1); 
//	    
//	    System.out.println("#################################################");
//	    
//	    String p3=p1.concat(" ").concat(p2);
//	    System.out.println(p3);
//	    
//	    String p4="Komal "+"kaje "+p1 +" Vaishali "+p2 ;
//	    System.out.println(p4);
//	    
//	    System.out.println("------------------------------------------");
//	    
//	    // Empty and blank
//	    
//	    boolean q1=p1.isBlank();
//	    boolean q2=p1.isEmpty();
//	    System.out.println(q1);
//	    System.out.println(q2);
//	    System.out.println("------------------------------------------");
//	    
//	   
//	    //
////	    String f="";
////	    boolean s=f.isBlank();
////	    boolean s12 = f.isEmpty();
////	    System.out.println(s);
////	    System.out.println(s12);
////	    System.out.println("***********************************************");
//	    
//	    
////	    String f= new String("");
////	    boolean s=f.isBlank();
////	    boolean s12 = f.isEmpty();
////	    System.out.println(s);
////	    System.out.println(s12);
//	    System.out.println("***********************************************");
//	    
//	    
//	    String f="\t";
//	    boolean s=f.isBlank(); //isBlank method also checks the characters of the string. 
//	    boolean s12 = f.isEmpty(); // isEmpty method only checks the length of the string,
//	    System.out.println(s);// true
//	    System.out.println(s12);// false
//	    System.out.println("***********************************************");
	    
	    
	    
	    
	    String s1="Velocity class Pune class Testing Class 2024";
	    String s2=" The Prise is 4000 Rs";
	    
	    String result =s1.substring(4);
	    System.out.println(result);
	    
	    String result1  =s1.substring(4, 10);
	    System.out.println(result1);
	    System.out.println("***********************************************");
	    
	    
	    result1 =s1.replace('c', 'x');
	    System.out.println(result1);
	    
	    System.out.println("***********************************************");
	    
	    result1=s1.replace("class", "batch");
	    System.out.println(result1);
	    
	    System.out.println("***********************************************");
	    
	    result1=s1.replaceAll("a","class");
        System.out.println(result1);
	    
	    System.out.println("******************77777777777*****************************");
	    
	    result1=s1.replaceFirst("a", "b");
        System.out.println(result1);
	    
	    System.out.println("*****************$$$$$$$$$$$$$$******************************");
	    
	  
	    
//	    String a="velocity class";
//	            // ssalc yticolev
//	    
//	           //ssalc yticolev 
	    
	    
//	       f[0]="velocity";
	       //f[1]="class"
	    
	    
//	   String f[] =a.split(" ");
//	   
//	   for(int i=f.length-1;i>=0;i--)
//	   {
//		   
//		   String s3= f[i];
//		   
//		      for(int j=s3.length()-1;j>=0;j--)
//		      {
//		    	  System.out.print(s3.charAt(j));
//		      }
//		   System.out.print(" ");
//	   }
	    
	    
	   System.out.println("8888888888888888888888888888888888888888888888888888888888888");
	   
	   String a="velocity class";
       // ssalc yticolev

      //ssalc yticolev 

  String f[] =a.split(" ");

for(int i=0;i<=f.length-1;i++)  // word ghyachet
{
  
  String s3= f[i];
  
     for(int j=s3.length()-1;j>=0;j--) // reverse
     {
   	  System.out.print(s3.charAt(j));
     }
  System.out.print(" ");
}
	    
	    
	    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	    
	    
	    String demo=" a a a b b b  c c c";
	    
	    String resultdemo =demo.replace('a', 'A');
	    System.out.println(resultdemo);
	    // out put---->   A A A b b b  c c c
	    
	    String resultdemo1=demo.replaceAll("a","Prajyot");
	    String resultdemo2 =  demo.replace("aaa", "Prajyot");
	    System.out.println("*********");
	    System.out.println(resultdemo2);
	    System.out.println(resultdemo1);
	    
	   // out put---> Prajyot Prajyot Prajyot b b b  c c c
	   
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
