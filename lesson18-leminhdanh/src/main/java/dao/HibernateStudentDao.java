package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.Student;

public class HibernateStudentDao extends GenericDao implements StudentDao {

	private static final String Q_GET_BY_CLASS_ID = ""
	        + "SELECT C02_STUDENT_ID,\n"
	        + "       C02_STUDENT_NAME,\n"
	        + "       C02_GENDER,\n"
	        + "       C02_CLASS_ID\n"
	        + "  FROM T02_STUDENT\n"
	        + " WHERE C02_CLASS_ID = :id;";
	
	@Override
	public List<Student> get(Integer id) {
		return openSession().createNativeQuery(Q_GET_BY_CLASS_ID, Student.class).setParameter("id", id).getResultList();
	}
	
}
