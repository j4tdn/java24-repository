package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.Student;

public class HibernateStudentDao extends GenericDao implements StudentDao {
	private static final String Q_GET_STUDENT_BY_ID = "" 
													+ "SELECT * FROM T02_STUDENT "
													+ "WHERE C02_CLASS_ID = :classId";   
		
	@Override
	public List<Student> findByStudentId(int classId) {
		return openSession().createNativeQuery(Q_GET_STUDENT_BY_ID, Student.class)
				.setParameter("classId", classId)
				.getResultList();
	}

}
