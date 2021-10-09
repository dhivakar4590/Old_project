package org.test;

import java.util.HashMap;
import java.util.Map;

public class Day9Q1 {
	//Description : Create a HashMap with the below key and values
    //key    : 10,20,30,40,50,60,10,50,40
    //values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		System.out.println(m);
		
		int s=m.size();
		System.out.println(s);
		
		boolean b= m.containsKey(50);
		System.out.println(b);
		
		boolean c = m.containsValue("oops");
		System.out.println(c);
		
		m.entrySet()
	}

}
