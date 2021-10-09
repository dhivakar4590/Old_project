package org.test;

import java.util.Scanner;
//Description : Get two input from user and Compare 

//Example

//String 1 : Nisha
//String 2 : nisha

//Example

//String 1 : Nia
//String 2 : nisha

public class Day6Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String a =s.nextLine();
		System.out.println("Enter next name");
		String b =s.nextLine();
		boolean a1 =a.equals(b);
		System.out.println(a1);

		System.out.println("Enter the name");
		String c =s.nextLine();
		System.out.println("Enter next name");
		String d =s.nextLine();
		boolean b1 =c.equals(d);
		System.out.println(b1);
	}

}
 