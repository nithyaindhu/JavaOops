/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
public class Programmer  extends ProjectLeader{

	protected String progName;
	protected int empId;
	
	protected void setProgrammer(String progName, int empId) {
		this.progName = progName;
		this.empId = empId;
	}
	
	public void getProjectLeader() {
		System.out.println("Project Leader name : " + super.proLeadName);
		System.out.println("Project Leader id : "+ super.empId);
	}
	public void getProgrammer() {
		System.out.println("Programmer name : " + progName);
		System.out.println("Programmer id : "+ empId);
	}

}
