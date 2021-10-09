package org.constructor;

public class Employee {
	int empId;
	String empName;
	
	public Employee(){//non parameterized or default constructor
		System.out.println("Welcome to Java"+" "+ empId + " "+ empName);
	}
	
	public Employee(int i, String s) {//Parameterized constructor
		empId = i;
		empName = s;
		System.out.println("Employee Id and Name is- "+ i + " "+s);
	}
	
	
	public static void main(String[] args) {
		new Employee();
		new Employee(4590, "Dhivakar");
		new Employee(8593, "Divya");
		new Employee(29721, "sriram");
		}
	

}
