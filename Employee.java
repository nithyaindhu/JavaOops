/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
class Employee {

	/**
	 * 
	 */
	private int empId;
	private String empName;
	static private String compName;
	static
	{
		compName = "neem";
	}
	static
	{
		compName = "neem tree";
	}
	public Employee() {
		//empId = 123;  // if we didn't assign default values will get printed
		//empName = "Nithya";
	}
	public Employee(int empId ,String empName ) {
		this.empId = empId;
		this.empName = empName;
	}
	void displayEmployeeDetails()
	{
		System.out.println("Employee id is "+ empId);
		System.out.println("Employee name is "+ empName);
		System.out.println("Employee company is "+ Employee.compName);
	}

}
