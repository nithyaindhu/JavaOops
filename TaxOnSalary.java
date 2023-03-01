/**
 * 
 */
package com.oops;

/**
 * @author HP
 *
 */
class TaxOnSalary {
	private double salary;
	private boolean isPANsubmitted;
	
	public TaxOnSalary(){
		salary = 0.0;
		isPANsubmitted = false ;
	}
	public TaxOnSalary(boolean isPANsubmitted) {
		this.isPANsubmitted = isPANsubmitted;
		salary = 1000.00;
	}
	
	public void inputSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public boolean isPANsubmitted() {
		return isPANsubmitted;
	}
	
	public double calculateTax()
	{
		if(salary <= 180000 && isPANsubmitted ) {
			return 0;
		}
		else if(salary <= 180000 && !isPANsubmitted) {
			return (salary*5)/100;
		}
		else if(salary > 180000 && salary <=500000) {
			return (salary*10)/100;
		}
		else if(salary > 500000 && salary <=1000000) {
			return (salary*20)/100;
		}
		else {
			return (salary*30)/100;
		}
	}
	
	@Override
	public String toString() {
		return "TaxOnSalary [ salary = "+ salary + ", isPANsubmitted = "+isPANsubmitted +", Tax = "+calculateTax()+ " ]";
	}
}
