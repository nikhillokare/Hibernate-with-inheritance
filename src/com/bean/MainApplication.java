package com.bean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainApplication {

	public static void main(String[] args) {
		
		Session s = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		
		Employee e = new Employee(1,"Nikhil");
		PartTimeEmp p = new PartTimeEmp(2,"Aniket",500,5);
		FullTimeEmp f = new FullTimeEmp(3,"Sushil",30000,6,2000);
		
		s.save(e);
		s.save(p);
		s.save(f);
		
		t.commit();
		

	}

}
