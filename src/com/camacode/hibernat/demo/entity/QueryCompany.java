package com.camacode.hibernat.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class QueryCompany {
	
	SessionFactory factory;
	
	
	public QueryCompany(SessionFactory factory, String mCompany) {
		super();
		this.factory = factory;
		
		try {
			Session session =factory.getCurrentSession(); 
			session.beginTransaction();
			List<Employee> employees = session.createQuery("from Employee where company='"+mCompany+"'").getResultList();
			session.getTransaction().commit();
			System.out.println("Name of employee : "+employees);
		} finally {
			
			factory.close();
		}
	
	}
}
