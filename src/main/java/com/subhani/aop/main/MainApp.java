package com.subhani.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subhani.aop.beans.Employee;
import com.subhani.aop.service.AopService;
import com.subhani.aop.service.impl.AopServiceImpl;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("employee");
		
		new MainApp().setEmployee(emp);
		
		AopService aopService = (AopServiceImpl) context.getBean("aopServiceImpl");
		System.out.print("Employee: " + aopService.getEmployee(emp).toString());
		
		emp.setFirstName("Shakeela");
		System.out.println("Updated Employee : " + aopService.updateEmployee(emp).toString());
		
	}
	
	/**
	 * Set dummy data for testing.
	 * @param emp
	 */
	public void setEmployee(Employee emp) {

		emp.setFirstName("Subhani");
		emp.setLastName("Shaik");
		emp.setCompany("My  Own");
	}
}
