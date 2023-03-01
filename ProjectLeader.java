/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
public class ProjectLeader {
	protected String proLeadName = "sai";
	protected int empId = 1;
	/**
	 * @param proLeadName
	 * @param empId
	 */
	ProjectLeader(){
		
	}
	protected ProjectLeader(String proLeadName, int empId) {
		this.proLeadName = proLeadName;
		this.empId = empId;
	}
}
