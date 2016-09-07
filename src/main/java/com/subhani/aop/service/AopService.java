package com.subhani.aop.service;

import com.subhani.aop.beans.Employee;

//@Service
public interface AopService {

	public Employee getEmployee(Employee e);
	
	public void insertEmployee(Employee e);
	
	public Employee updateEmployee(Employee e);
	
	public void deleteEmployee(Employee e);
	
}
