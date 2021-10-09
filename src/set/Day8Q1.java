package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
//Description : Create a HashSet for the below values
//Input : List = 10,20,30,40,50,60,70,80,90,10,20
//Description : Create a LinkedHashSet for the below values
//Input : List = 10,20,30,40,50,60,70,80,90,10,20
//Description : Create a TreeSet for the below values
//Input : List = 10,20,30,40,50,60,70,80,90,10,20
import java.util.Set;
import java.util.TreeSet;

public class Day8Q1 {
	
	public static void main(String[] args) {
		
		Set<Integer> l = new HashSet<Integer>();
		Set<Integer> l1 = new LinkedHashSet<Integer>();
		 Set<Integer> l2 = new TreeSet<Integer>();
		
		l.add(10);  l1.add(10);  l2.add(10);
		l.add(20);  l1.add(20);	 l2.add(20);
		l.add(30);  l1.add(30);  l2.add(30);
		l.add(40);  l1.add(40);	 l2.add(40);
		l.add(50);  l1.add(50);  l2.add(50);
		l.add(60);  l1.add(60);  l2.add(60);
		l.add(70);  l1.add(70);	 l2.add(70);
		l.add(80);	l1.add(80);  l2.add(80);
		l.add(90);  l1.add(90);  l2.add(90);
		l.add(10);	l1.add(10);	 l2.add(10);
		l.add(20);  l1.add(20);  l2.add(20);
		
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
	}
 
}
