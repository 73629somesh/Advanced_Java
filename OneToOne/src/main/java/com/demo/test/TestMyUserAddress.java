package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyUserAddress {
	public static void main(String[] args) {
		Address a1=new Address(1,"Nashik","MG Road");
		Address a2=new Address(2,"Mirajgaon","Nagar Road");
		MyUser u1=new MyUser(17,"Somesh",a1);
		MyUser u2=new MyUser(18,"Sanket",a2);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(a1);
		sess.save(a2);
		sess.save(u1);
		sess.save(u2);
		tr.commit();
	}
	
}
