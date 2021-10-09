package org.test;
import java.util.Scanner;
public class Day4Q2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 to 100");
		int i = s.nextInt();
		if (i%2==0) {
			System.out.println("Entered number is even");
		}
		else {
			System.out.println("Entered number is odd");
		}
	}

}
