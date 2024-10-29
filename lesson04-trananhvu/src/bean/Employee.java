package bean;

import java.time.LocalDate;

public class Employee extends BaseEmployee {
	private String department;
	Manager manager;

	@Override
	public double totalSalary() {
		return (getRegencyLevel() + getSalaryLevel()) * 1250000;
	}

	@Override
	public double getTotalSalary() {
		return totalSalary();
	}

	public Employee() {
	}

	public Employee(String name, LocalDate birthday, double salaryLevel, String department, Manager manager) {
		super(name, birthday, salaryLevel);
		this.department = department;
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", manager=" + manager + ", getName()=" + getName()
				+ ", getBirthday()=" + getBirthday() + ", getSalaryLevel()=" + getSalaryLevel() + "]";
	}

}
