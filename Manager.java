package com.oops;

public class Manager extends InheritEmployee{
	private String empDept;
	
	void setEmpDept(String dept) {
		empDept = dept;
	}
	void displaydetails()
	{
		//displayData();
		System.out.println("Employee department is "+empDept);
	}
}
