package com.camacode.hibernat.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SaveEmployee {
	
	Employee employee;
	SessionFactory factory;
	Session session;
	
	public SaveEmployee(Employee employee,SessionFactory factory) {
		this.employee = employee;
		this.session = factory.getCurrentSession();
		
		try {
			//Begin transaction 
			System.out.println("Begin transaction .... ");
			session.beginTransaction();
			
			//save the student object  
			System.out.println("Save a Employee object .... ");
			session.save(employee);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done !");
			
		} finally {
			//session.close();
			factory.close();
		
		}
	}
	
}
