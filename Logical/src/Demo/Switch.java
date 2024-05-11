package Demo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
       Scanner scan1 = new Scanner(System.in); //syntax
       
      System.out.println("enter your day");
     String day= scan1.next();
      switch(day)
      {
      
      case "mon":
    	  System.out.println("maths");
    	  break;
    	  
      case "tue":
    	  System.out.println("history");
    	  break;
    	  
      case "wed":
    	  System.out.println("marathi");
    	  break;
    	  
      case "thus":
    	  System.out.println("english");
    	  break;
    	  
    	  
      case "fri":
    	  System.out.println("Bio");
    	  break;
    	  
      case "sat":
    	  System.out.println("Chrmistry");
    	  break;	  
    	  
      case "sun":
    	  System.out.println("physics ");
    	  break;	  
      }
	}

}
