package Demo;

import java.util.Scanner;

public class SwitchCsaeEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Enter your fav menue");
			
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1:
				System.out.println(" 1st for noodels");
				break;
			case 2:
				System.out.println(" 2nd for fried rice");
				break;
			case 3:
				System.out.println(" 3rd for soups");
				break;
			case 4:
				System.out.println(" 4th for momos");
				break;
				
				default:
					System.out.println("not hungry");
					
			}
	
	}

}
