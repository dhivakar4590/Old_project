package org.test;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class ListClz {

	public static void main(String[] args) {
		
		Set<Object> l = new HashSet<Object>();
				
				l.add(10);
				l.add(20);
				l.add("");
				l.add(null);
				l.add(null);
				l.add(10);
				l.add("hello");
				l.add(20);
				
				System.out.println(l);
		
	 

	}

}
