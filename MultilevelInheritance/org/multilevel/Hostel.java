package org.multilevel;

public class Hostel extends Student{
	
	public void hostelName() {
		
		System.out.println("Hostel Name: Shelby Hostel");
	}

	public static void main(String[] args) {
		
		Hostel h =  new Hostel();
		h.collegeName();
		h.collegeCode();
		h.collegeRank();
		h.deptName();
		h.hostelName();
		h.studentName();
		h.studentDept();
		h.studentId();
		
	}
}
