package com.demo.test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.NonPerishable;
import com.demo.model.Perishable;

public class TestInheritance {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Perishable p1=new Perishable(1,"Cake",new Date(),new Date());
		NonPerishable p2=new NonPerishable(2,"Sofa",new Date(),"Furniture");
		sess.save(p2);
		sess.save(p1);
		tr.commit();
		
	}

}
