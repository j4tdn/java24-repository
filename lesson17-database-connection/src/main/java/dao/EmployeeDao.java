package dao;

import bean.Employee;

public interface EmployeeDao {
	/**
	 * Sign Up a new employee
	 * 
	 * @return the employees
	 */
	void signup(Employee employee);
}
