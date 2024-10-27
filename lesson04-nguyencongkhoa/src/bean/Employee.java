package bean;

import java.time.LocalDate;

public class Employee extends BaseEmployee implements Department{

	private Manager manager;
	private String department;
	
	public Employee() {
	}

	public Employee(String name, LocalDate birthday, double salaryCoefficient, String department, Manager manager) {
		super(name, birthday, salaryCoefficient);
		this.manager = manager;
		this.department = department;
	}

	@Override
	public String getDepartment() {
		return department;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public long salary() {
		return  (long) (salaryCoefficient * 1250000);
	}

	@Override
	public String toString() {
		return "[name=" + name + ", birthday=" + birthday + ", salaryCoefficient=" + salaryCoefficient
				+ ", nameManager=" + manager.getName() + ", department=" + department + "]";
	}
	
}
