package scanner.com;
import java.util.Scanner;
public class SwitchCaz {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the type of meal required");
		String a = s.next();
		switch (a) {
case "Burger":System.out.println("Burger is selected");break;
case "ChickenTenders":System.out.println("Chicken Tenders is selected");break;
case "Nuggets":System.out.println("Nuggets is selected");break;	
default:System.out.println("Slected item is not available");break;
			}
		
		System.out.println("Enter the type of drink required");
		String b = s.next();
		switch (b) {
case "Coke":System.out.println("Coke is selected");break;
case "Sprite":System.out.println("Sprite is selected");break;
case "SweetTea":System.out.println("Sweet tea is selected");break;	
default:System.out.println("Slected item is not available");break;
		}
		
		System.out.println("Enter the type of sides required");
		String c = s.next();
		switch (c) {
case "Fries":System.out.println("Fries is selected");break;
case "Coleslaw":System.out.println("Coleslaw is selected");break;
case "Apple":System.out.println("Apple Slices is selected");break;	
default:System.out.println("Slected item is not available");break; 
			}
	}

}
