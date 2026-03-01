package service;

import java.util.List;

import persistence.Student;

public interface ClassService {
	/**
	 * Get class name and student count
	 */
	List<Student> findByClassId(int id);
}
