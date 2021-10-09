package org.test;

import java.util.Scanner;

public class Day6Q4 {
	//Description : Get two input from user and check the equality
    //: print in the output whether it is Equal or not
//Example: Input : String 1 : Java
//				   String 2 : Java
//Input : String 1 : Java
//        String 2 : java
//Input : String 1 : Green Technologys 
//        String 2 : GreenTechnology.

//Example(use equalsIgnoreCase):
//Input : String 1 : Java
//        String 2 : java

//Example(use equalsIgnoreCase) :
//Input : String 1 : Nisha
//        String 2 : nisha


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word to check- ");
		String a = sc.nextLine();
		System.out.println("Enter the next word- ");
		String b = sc.nextLine();
		boolean c = a.equals(b);
		System.out.println(c);
		
		System.out.println("Enter the word to check- ");
		String aa = sc.nextLine();
		System.out.println("Enter the next word- ");
		String bb = sc.nextLine();
		boolean cc = aa.equalsIgnoreCase(bb);
		System.out.println(cc);
	
	
 
	}

}
