package service;

import java.util.Objects;

import bean.Employee;
import dao.EmployeeDao;
import dao.JdbcEmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		employeeDao = new JdbcEmployeeDao();
	}

	@Override
	public void signup(Employee employee) {
		Objects.requireNonNull(employee, "employee should not be null");
		employeeDao.signup(employee);
	}

}
