package dao;

import bean.Employee;

public interface EmployeeDao {

	/**
	 * Sign up a new employee
	 * 
	 * @param the employee
	 */
	void signup(Employee employee);

}
