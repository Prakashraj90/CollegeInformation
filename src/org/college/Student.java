package org.college;

public class Student extends College {
	
	private void studentName() {
		System.out.println("name raja");

	}
private void studentDept() {
	// TODO Auto-generated method stub
System.out.println("civi");
}
private void studentId() {
	// TODO Auto-generated method stub
System.out.println("4855566");
}

public static void main(String[] args) {
	
	Student s = new Student();
	s.collegeCode();
	s.collegeName();
	s.studentDept();
	s.hostelName();
	s.studentName();
	s.studentId();
	s.deptName();
}
}
