package view;

import connection.DbConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Ex01TestConnection {
    public static void main(String[] args) {
        final SessionFactory sessionFactory = DbConnection.getSessionFactory();

        System.out.println(sessionFactory);

        Session session = sessionFactory.openSession();

        System.out.println(session);
    }
}
