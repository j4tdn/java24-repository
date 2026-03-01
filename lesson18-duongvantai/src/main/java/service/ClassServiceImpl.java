package service;

import java.util.List;
import java.util.Objects;

import dao.StudentDao;
import dao.HibernateStudentDao;
import persistence.Student;

public class ClassServiceImpl implements ClassService {

		private StudentDao classDao ;
		public ClassServiceImpl() {
			classDao = new HibernateStudentDao();
		}
	@Override
	public List<Student> findByClassId(int id) {
		Objects.requireNonNull(id, "id should not be null.");
		return classDao.findByStudentId(id);
	}

}
