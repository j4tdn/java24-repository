package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class Ex01Connection {
	public static void main(String[] args) {
		final SessionFactory sessionFactory = DbConnection.getSessionFactory();
		System.out.println("sessionFactory : "+sessionFactory);
		
		Session s1 = sessionFactory.openSession();
		Session s2 = sessionFactory.openSession();
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		System.out.println("\n");
		
		Session s3 = sessionFactory.getCurrentSession();
		Session s4 = sessionFactory.getCurrentSession();
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
	}
}
