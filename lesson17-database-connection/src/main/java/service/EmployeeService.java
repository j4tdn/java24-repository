package service;

import bean.Employee;

public interface EmployeeService {
	/**
	 * Sign Up a new employee
	 * 
	 * @return the employees
	 */
	void signup(Employee employee);
}