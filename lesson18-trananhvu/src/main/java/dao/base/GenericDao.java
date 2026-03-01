package dao.base;

import connection.DbConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GenericDao {
    private SessionFactory sessionFactory;

    public GenericDao() {
        sessionFactory = DbConnection.getSessionFactory();
    }

    protected Session openSession() {
        return sessionFactory.openSession();
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}