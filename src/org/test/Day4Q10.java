package org.test;
import java.util.Scanner;
public class Day4Q10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number- ");
		int i = s.nextInt();
		int a, b=0, c=0;
		a=i;
		while (a>0) {
			b=a%10;
			c=(b*b*b)+c;
			a=a/10;
		}
		if (i==c) {
			System.out.println(i+ "- it is a Amstrong Number");
		}
		else {
			System.out.println(i+ "- is not a Amstrong Number");
		}
}

}
