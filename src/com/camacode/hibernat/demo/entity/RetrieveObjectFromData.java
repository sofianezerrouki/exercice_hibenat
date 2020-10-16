package com.camacode.hibernat.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RetrieveObjectFromData {
	
	SessionFactory factory;
	
	
	public RetrieveObjectFromData(SessionFactory factory, int id) {
		super();
		this.factory = factory;
		
		try {
			Session session =factory.getCurrentSession(); 
			session.beginTransaction();
			Employee employee = session.get(Employee.class, id);
			session.getTransaction().commit();
			System.out.println("Name of employee : "+employee.getFirstName());
		} finally {
			
			factory.close();
		}
	
	}
	
	
	
}
