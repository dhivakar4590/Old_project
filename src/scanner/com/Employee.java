package scanner.com;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		System.out.println("Enter EmpId");
		int id = e.nextInt();
	    System.out.println("EmpId is- "+id);
	    
	    String nl = e.nextLine();
	    
	    System.out.println("Enter EmpName");
	    String n = e.nextLine();
	    System.out.println("EmpName is- "+n);
	    
	    System.out.println("Enter EmpEmail");
	    String em = e.next();
	    System.out.println("EmpEmail is- "+em);
	    
	    System.out.println("Enter EmpPhone no");
	    long ph = e.nextLong();
	    System.out.println("EmpPhone no is- "+ph);
	    
	    System.out.println("Enter EmpSalary");
	    int sl = e.nextInt();
	    System.out.println("EmpSalary is- "+sl);
	    
	    System.out.println("Enter EmpGender");
	    String gn = e.next();
	    System.out.println("EmpGender is- "+gn);
	    
	    System.out.println("Enter EmpCity");
	    String c = e.next();
	    System.out.println("EmpCity is- "+c);
	 
	  
	}
	

}
