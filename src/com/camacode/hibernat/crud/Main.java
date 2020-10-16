package com.camacode.hibernat.crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.camacode.hibernat.demo.entity.Employee;
import com.camacode.hibernat.demo.entity.SaveEmployee;

public class Main {

	public static void main(String[] args) {
		
		//create a session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		Employee employee = new Employee("bkarim","Smaili","google");
		
		new SaveEmployee(employee, factory);

	}

}
