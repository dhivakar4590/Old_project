package org.test;

public class StringIsEmpty {

	public static void main(String[] args) {
		String s1="";
		String s2=" ";
		String s3="Java";
		String s4=null;
		
		boolean e = s4.isEmpty();
		System.out.println(e);
//without double quote null is not consider as String value hence it shows error.
	}

}
