package com.subhani.aop.service.impl;

import org.springframework.stereotype.Service;

import com.subhani.aop.beans.Employee;
import com.subhani.aop.service.AopService;

@Service
public class AopServiceImpl implements AopService {

	public AopServiceImpl() {
		
	}
	
	public Employee getEmployee(Employee e) {
		// TODO Auto-generated method stub
		//Employee emp = new Employee();
		e.setCompany("Your Company");
		return e;

	}

	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		//Employee emp = new Employee();
		return e;
	}

	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

}
