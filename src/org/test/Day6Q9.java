package org.test;

public class Day6Q9 {

	public static void main(String[] args) {
		String a = "Welcome to java class";
		boolean s1 =a.startsWith("Welcome");
		System.out.println(s1);
		
		String b = "Hai i am nisha";
		boolean s2 =b.startsWith("welocme");
		System.out.println(s2);
		
		boolean s3 = a.endsWith("class");
		System.out.println(s3);
		
		boolean s4 = a.endsWith("java");
		System.out.println(s4);
		
		boolean s5 = a.isEmpty();
		System.out.println(s5);
		
		String c ="";
		boolean s6 = c.isEmpty();
		System.out.println(s6);

	}

} 
