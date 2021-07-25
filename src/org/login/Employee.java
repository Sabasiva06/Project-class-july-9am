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

	private void employeeDepartment() {
		System.out.println("Mechanical Department");

	}

	private void employeeSalary() {
		System.out.println("Employee Salary 10 lakhs");

	}

	private void employeeLocation() {
		System.out.println("Employee Location : Chennai");

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
