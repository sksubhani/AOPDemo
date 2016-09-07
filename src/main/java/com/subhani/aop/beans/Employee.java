package com.subhani.aop.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	String firstName;
	String lastName;
	String company;
	
	public Employee() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", company=" + company + "]" + "\n";
	}
	
	
	
}
