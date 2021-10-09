package org.test;

public class Day6Q7 {
	//Description:Given string as "Welcome to java class" and replace java into sql.
//Example:Input  = Welcome to class java
//output = Welcome to class sql
	//Description:Given string as "Greens Adayar"and replace Adayar into Omr.
//Example:Input  = Greens Adayar; 
//Output = Greens Omr
	//Description: Given String as "Welcome to java class" and Replace space into '#'
//Example:input:Welcome to java class
//output:Welcome#to#java#class

	public static void main(String[] args) {
		String s = "Welcome to java class";
		String s1 = s.replace("class", "sql");
		System.out.println(s1);
		
		String a = "Greens Adayar";
		String s2 = a.replace("Adayar", "Omr");
		System.out.println(s2);
		
		String b = "Welcome to java class";
		String s3 = b.replace(" ", "#");
		System.out.println(s3);

			
		}
			
}

	


