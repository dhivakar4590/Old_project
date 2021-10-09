package org.test;

import java.util.Scanner;

public class Day6Q5 {
//Description: Get the email id from the user and verify '@' is present or not?
//Example:Input  = velmurugank451@gmail.com
		//Output = valid email id
//Description:Get the address from the user and verify "pincode" is present or not?
//Example:Input  = 5-35-2a,venkatesh nivas,Aruppukottai
		//Output = invalid address
//Description:Get the email from the user and verify '@' is present or not and return true or false?
//Example:Input  = Nishakerala24@gmail.com
		//Output = True/False 
//Description:Get the phonenumber from the user and verify any character is present or not .
			          //  If character is present return invalid number
//Example:Input  = 90954a6o78
		//Output = False

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter email id- ");//Question 5.1
		String a = s.nextLine();
		if (a.contains("@")) {
			System.out.println("valid email id");
			}
		else {
			System.out.println("invalid email id");
		}
		
		System.out.println("Enter email id- ");//Question 5.3
		String a1 = s.nextLine();
		boolean b = a1.contains("@");
		System.out.println(b);
			
		
		
		
	

	}

}
