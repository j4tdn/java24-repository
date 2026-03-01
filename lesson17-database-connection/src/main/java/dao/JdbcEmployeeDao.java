package dao;

import java.sql.SQLException;

import org.apache.commons.codec.digest.DigestUtils;

import bean.Employee;
import bean.Order;
import dao.base.GenericDao;

public class JdbcEmployeeDao extends GenericDao<Order> implements EmployeeDao{
	
	private static final int DEFAULT_DEPARTMENT_ID = 1;
	
	private static final String SAVE_NEW_EMPLOYEE = ""
			+ "INSERT INTO t16_employee (C16_EMPLOYEE_NAME, C16_EMPLOYEE_EMAIL, C16_EMPLOYEE_PASSWORD, C16_DEPARTMENT_ID) \n"
			+ "VALUES (?, ?, ?, ?);";
	
	@Override
	public void signup(Employee employee) {
		
		final String md5Password = DigestUtils.md5Hex(employee.getPassword());
		System.out.println();
		executeUpdate(SAVE_NEW_EMPLOYEE, pst -> {
			try {
				pst.setString(1, employee.getName());
				pst.setString(2, employee.getEmail());
				pst.setString(3, md5Password);
				pst.setInt(4, DEFAULT_DEPARTMENT_ID);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}

}
