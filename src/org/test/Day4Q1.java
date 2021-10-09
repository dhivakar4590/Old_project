package org.test;
import java.util.Scanner;

public class Day4Q1 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter your age");
	int i = s.nextInt();
	if (i>=18){
	System.out.println("you are eligable for voting");
	}
	else {
		System.out.println("You are not eligable for voting");}
	}
}
