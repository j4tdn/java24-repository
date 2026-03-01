package dao;

import java.util.List;

import persistence.Student;

public interface StudentDao {
	/**
	 * Get all student by id
	 */
	List<Student> findByStudentId(int id);
}
