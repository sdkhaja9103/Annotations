package com.Main.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Emp e1=new Emp(1,"khaja","4184");
		System.out.println(e1);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(e1);
		tx.commit();
		factory.close();
    }
}
