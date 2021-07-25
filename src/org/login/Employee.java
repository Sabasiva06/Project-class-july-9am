package org.login;

public class Employee {

	private void employeeId() {
		System.out.println("employee id is 123");
	}

	private void employeeName() {
		System.out.println("employee name is ravi");
	}

	private void employeeAddress() {
		System.out.println("employee address is omr");
	}

	private void employeeNumber() {
		System.out.println("Employee Number :09876543");

	}

	private void employeeGender() {
		System.out.println("Employee Gender : M");

	}

	public static void main(String[] args) {
		// Classname objname = new Classname();
		Employee a = new Employee();

		// objname.methodname
		a.employeeId();
		a.employeeName();
		a.employeeAddress();

	}

}
