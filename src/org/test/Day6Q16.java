package org.test;

public class Day6Q16 {
	//Description: Replace all vowels char into '@'

	//Example:

	//Input  = Welcome
	//Output = W@lc@m@  
	public static void main(String[] args) {
		String s = "Welcome";
		String s1 = s.replace("a,e,i,o,u","@");
		System.out.println(s1);
	}

}
