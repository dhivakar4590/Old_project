package org.test;

public class Day6Q3 {
	//Description: Find the particular character in the given string
	//   String 1: GreensTechnology 
	//             print the character h 

	//   String 2: SeleniumAutomationtool 
	//             print the character o

	//   String 3: velmurugan 
	//             print the character u

	//   String 4: j a v a p r o g r a m 
	//             print the character p

	//   String 5: 9095484678
	//             print the character 7

	public static void main(String[] args) {
		String s1 = "GreensTechnology";
		char c1   = s1.charAt(9);
		System.out.println(c1);
		
		String s2 = "SeleniumAutomationtool";
		char c2    = s2.charAt(11);
		System.out.println(c2);
		
		String s3 = "Velmurugan";
		char c3    = s3.charAt(4);
		System.out.println(c3);
		
		String s4 = "j a v a p r o g r a m";
		char c4    = s4.charAt(8);
		System.out.println(c4);
		
		String s5 = "9095484678";
		char c5    = s5.charAt(8);
		System.out.println(c5);
		

	}

}
