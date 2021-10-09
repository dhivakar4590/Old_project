package scanner.com;

import java.util.Scanner;

public class ClassScanner {

	private static Scanner s;

	public static void main(String[] args) {
    s = new Scanner(System.in);
    
    System.out.println("Enter Your Zipcode");
    int c = s.nextInt();
    System.out.println("User Zipcode is- "+c);
    
    System.out.println();
    
    System.out.println("Enter your name");
    String nl = s.nextLine();
    System.out.println("User Name is- "+nl);
    
    System.out.println("Enter Your Designation");
    String l = s.next();
    System.out.println("User Designation is- "+l);
    
    System.out.println("Enter Your Age");
    byte a = s.nextByte();
    System.out.println("User Age is- "+a);
    
    System.out.println("Enter your Emp id");
    short b = s.nextShort();
    System.out.println("User Emp id is"+b);
    
  
 
    System.out.println("Enter Your Mobile No");
    long d = s.nextLong();
    System.out.println("User Mobile No is- "+d);
    
    System.out.println("Enter Your Score by %");
    float f = s.nextFloat();
    System.out.println("Your Score % is- "+f);
    
    System.out.println("Enter your height");
    double g = s.nextDouble();
    System.out.println("User Height is- "+g);
    
  
        

	}

}
