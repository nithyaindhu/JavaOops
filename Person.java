package com.oops;

class Person {
	private String name;
	private int age;
	private double heightInM;
	private double weightInKg;
	private String gender;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected double getHeightInM() {
		return heightInM;
	}
	protected void setHeightInM(double heightInM) {
		this.heightInM = heightInM;
	}
	protected double getWeightInKg() {
		return weightInKg;
	}
	protected void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}
	protected String getGender() {
		return gender;
	}
	protected void setGender(String gender) {
		this.gender = gender;
	}
	protected double calculateBMI(){
		return (double)(weightInKg/(heightInM * heightInM));
	}
	protected boolean isEligibleToVote()
	{
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	protected void showDetails()
	{
		System.out.println("Person name is " + getName());
		System.out.println("Person age is "+getAge());
		System.out.println("Person weight in kg is " + getWeightInKg());
		System.out.println("Person height in meter is "+ getHeightInM());
		System.out.println("Person gender is "+ getGender());
		System.out.println("Person BMI is "+ calculateBMI());
		System.out.println("Is " + getName() + " eligible to vote? "+ isEligibleToVote());
	}
}
