package org.overload;

import java.util.Scanner;

public class Employee {
	
	public void empId(int id) {
		System.out.println(id);
	}
	
	public void empId(String name) {
		System.out.println(name);
	}
	
	public void empId(String name, int id) {
		
		System.out.println(name+" "+id);
	}
	
	public void empId(char initial) {
		System.out.println(initial);
	}
	public void empdId(byte age) {
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(9876);
		e.empId("Ronaldo");
		e.empId("Ronaldo", 9876);
		e.empId("S");
		
	}
}

