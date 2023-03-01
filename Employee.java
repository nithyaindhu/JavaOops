package com.SerializableDeserializable;

public class Employee implements java.io.Serializable{
	private int empId;
	private String empName;
	transient int empAge;
	static String gender;
	/**
	 * @param empId
	 * @param empName
	 */
	protected Employee(int empId,String empName,int age,String gender) {
		this.empId = empId;
		this.empName = empName;
		empAge = age;
		Employee.gender = gender;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
