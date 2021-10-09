package org.test;

public class Day6Q2 {
	//Description: Find the particular character index  in the given string
	//   String 1: GreensTechnology 
	//             Find the last index of o

	//   String 2: SeleniumAutomationtool 
	//             Find the index of o

	//   String 3: Velmurugan 
	//             Find the index of n

	//   String 4: j a v a p r o g r a m 
	//             Find the last index of  (emptyspace)

	//   String 5: 9095484678 
	//             Find the index of 8

	public static void main(String[] args) {
		String s1 = "GreensTechnology";
		int i1    = s1.lastIndexOf("o");
		System.out.println(i1);
		
		String s2 = "SeleniumAutomationtool";
		int i2    = s2.indexOf("o");
		System.out.println(i2);
		
		String s3 = "Velmurugan";
		int i3    = s3.indexOf("n");
		System.out.println(i3);
		
		String s4 = "j a v a p r o g r a m";
		int i4    = s4.lastIndexOf(" ");
		System.out.println(i4);
		
		String s5 = "9095484678";
		int i5    = s5.indexOf("8");
		System.out.println(i5);

	}

}
