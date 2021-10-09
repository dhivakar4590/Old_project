package scanner.com;
import java.util.Scanner;
public class StudentMarks {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Student Id");
		int id = s.nextInt();
	    System.out.println("StudentId is- "+id);
	    
	    String nl = s.nextLine();
	    
	    System.out.println("Enter Student Name");
	    String n = s.nextLine();
	    System.out.println("Student Name is- "+n);
	    
	    System.out.println("Enter Mark1");
	    int m1 = s.nextInt();
	    System.out.println("Mark1 is- "+m1);
	    
	    System.out.println("Enter Mark2");
	    int m2 = s.nextInt();
	    System.out.println("Mark2 is- "+m2);
	    
	    System.out.println("Enter Mark3");
	    int m3 = s.nextInt();
	    System.out.println("Mark3 is- "+m3);
	    
	    System.out.println("Enter Mark4");
	    int m4 = s.nextInt();
	    System.out.println("Mark4 is- "+m4);
	    
	    System.out.println("Enter Mark5");
	    int m5 = s.nextInt();
	    System.out.println("Mark5 is- "+m5);
	    
	    int total = (int) (m1+m2+m3+m4+m5);
	    System.out.println("Your total is- "+total);
	    
	    int average = (int) (m1+m2+m3+m4+m5)/5;
	    System.out.println("Your average is- "+average );
	}
}
