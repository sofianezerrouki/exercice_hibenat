package com.camacode.hibernat.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteEmployee {
	
	SessionFactory factory;
	Session session;
	
	public DeleteEmployee(SessionFactory factory,int id) {
	
		this.session = factory.getCurrentSession();
		
		try {
			//Begin transaction 
			System.out.println("Begin transaction .... ");
			session.beginTransaction();
			
			//get Employee 
			Employee employee = session.get(Employee.class,id);
			
			//Delete the student object  
			System.out.println("Delete a Employee object .... ");
			session.delete(employee);
			System.out.println("Employee "+id+" deleted .... ");
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done !");
			
		} finally {
			//session.close();
			factory.close();
		
		}
	}
	
}
